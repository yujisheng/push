package com.soft863.framework.PushMessageConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: MessageConfig
 * @Author
 * @Date 2019/3/20 0020 20:44
 */
@ConfigurationProperties(prefix = "blsf.push")
public class MessageConfig {
    private String appKey = "";
    private String masterSecret = "";
    private boolean production = true;

    private long timeToLive = 86400;
    private int sendno = 1;
    private int badge = 1;
    private String sound = "default";

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getMasterSecret() {
        return masterSecret;
    }

    public void setMasterSecret(String masterSecret) {
        this.masterSecret = masterSecret;
    }

    public boolean isProduction() {
        return production;
    }

    public void setProduction(boolean production) {
        this.production = production;
    }

    public long getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(long timeToLive) {
        this.timeToLive = timeToLive;
    }

    public int getSendno() {
        return sendno;
    }

    public void setSendno(int sendno) {
        this.sendno = sendno;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
