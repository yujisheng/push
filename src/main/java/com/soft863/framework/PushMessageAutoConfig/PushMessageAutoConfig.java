package com.soft863.framework.PushMessageAutoConfig;

import cn.jpush.api.push.model.notification.AndroidNotification;
import com.soft863.framework.PushMessage;
import com.soft863.framework.PushMessageConfig.AllMessage;
import com.soft863.framework.PushMessageConfig.AndroidMessage;
import com.soft863.framework.PushMessageConfig.IosMessage;
import com.soft863.framework.PushMessageConfig.MessageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.reflect.CallerSensitive;

/**
 * @ClassName: PushMessageAutoConfig
 * @Author
 * @Date 2019/3/20 0020 20:46
 */
@Configuration
@EnableConfigurationProperties(MessageConfig.class)
@ConditionalOnClass(PushMessage.class)
@ConditionalOnProperty(prefix = "blsf.push", value = "enable", matchIfMissing = true)
public class PushMessageAutoConfig {

    @Autowired
    private MessageConfig messageConfig;

    @Bean
    @ConditionalOnMissingBean(PushMessage.class)
    public PushMessage pushMessage() {
        PushMessage pushMessage = new PushMessage();
        pushMessage.setAppKey(messageConfig.getAppKey());
        pushMessage.setMasterSecret(messageConfig.getMasterSecret());
        pushMessage.setBadge(messageConfig.getBadge());
        pushMessage.setProduction(messageConfig.isProduction());
        pushMessage.setSendno(messageConfig.getSendno());
        pushMessage.setSound(messageConfig.getSound());
        pushMessage.setTimeToLive(messageConfig.getTimeToLive());

        return pushMessage;
    }
}
