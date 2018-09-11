package im.zuber.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import im.zuber.server.base.BaseBean;

/**
 * <p>
 * 
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public class Deviceinfo extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableField("deviceId")
    private String deviceId;

    @TableField("deviceMacAddr")
    private String deviceMacAddr;

    @TableField("deviceLocale")
    private String deviceLocale;

    @TableField("devicePlatform")
    private String devicePlatform;

    @TableField("deviceOsVersion")
    private String deviceOsVersion;

    @TableField("deviceScreen")
    private String deviceScreen;

    @TableField("deviceDensity")
    private String deviceDensity;

    @TableField("deviceModel")
    private String deviceModel;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;
    @TableField("uid")
    private String uid;


    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceMacAddr() {
        return deviceMacAddr;
    }

    public void setDeviceMacAddr(String deviceMacAddr) {
        this.deviceMacAddr = deviceMacAddr;
    }

    public String getDeviceLocale() {
        return deviceLocale;
    }

    public void setDeviceLocale(String deviceLocale) {
        this.deviceLocale = deviceLocale;
    }

    public String getDevicePlatform() {
        return devicePlatform;
    }

    public void setDevicePlatform(String devicePlatform) {
        this.devicePlatform = devicePlatform;
    }

    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion;
    }

    public String getDeviceScreen() {
        return deviceScreen;
    }

    public void setDeviceScreen(String deviceScreen) {
        this.deviceScreen = deviceScreen;
    }

    public String getDeviceDensity() {
        return deviceDensity;
    }

    public void setDeviceDensity(String deviceDensity) {
        this.deviceDensity = deviceDensity;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Deviceinfo{" +
        ", deviceId=" + deviceId +
        ", deviceMacAddr=" + deviceMacAddr +
        ", deviceLocale=" + deviceLocale +
        ", devicePlatform=" + devicePlatform +
        ", deviceOsVersion=" + deviceOsVersion +
        ", deviceScreen=" + deviceScreen +
        ", deviceDensity=" + deviceDensity +
        ", deviceModel=" + deviceModel +
        ", id=" + id +
        ", createTime=" + createTime +
        ", uid=" + uid +
        "}";
    }
}
