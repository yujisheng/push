package com.soft863.framework.PushMessageConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @ClassName IosMessage
 * @Author
 * @Date 2019/3/19
 */

public class IosMessage {

    /**
     * tag或者alias标识
     */
    private List<String> tagsOrAlias;
    /**
     * 推送通知
     */
    private String alter;
    /**
     * 推送消息的内容
     */
    private String msgContent;
    /**
     * 推送额外功能的key
     */
    private String extraKey;
    /**
     * 推送额外功能的key
     */
    private String extraValue;

    public IosMessage(List<String> tagsOrAlias, String alter, String msgContent, String extraKey, String extraValue) {
        this.tagsOrAlias = tagsOrAlias;
        this.alter = alter;
        this.msgContent = msgContent;
        this.extraKey = extraKey;
        this.extraValue = extraValue;
    }

    public IosMessage(String alter, String msgContent, String extraKey, String extraValue) {
        this.alter = alter;
        this.msgContent = msgContent;
        this.extraKey = extraKey;
        this.extraValue = extraValue;
    }


    public List<String> getTagsOrAlias() {
        return tagsOrAlias;
    }

    public void setTagsOrAlias(List<String> tagsOrAlias) {
        this.tagsOrAlias = tagsOrAlias;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getExtraKey() {
        return extraKey;
    }

    public void setExtraKey(String extraKey) {
        this.extraKey = extraKey;
    }

    public String getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(String extraValue) {
        this.extraValue = extraValue;
    }
}
