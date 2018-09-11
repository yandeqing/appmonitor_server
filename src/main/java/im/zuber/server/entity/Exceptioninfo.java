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
public class Exceptioninfo extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableField("phoneModel")
    private String phoneModel;

    @TableField("systemModel")
    private String systemModel;

    @TableField("systemVersion")
    private String systemVersion;

    @TableField("exceptionString")
    private String exceptionString;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;
    @TableField("uid")
    private String uid;


    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getSystemModel() {
        return systemModel;
    }

    public void setSystemModel(String systemModel) {
        this.systemModel = systemModel;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getExceptionString() {
        return exceptionString;
    }

    public void setExceptionString(String exceptionString) {
        this.exceptionString = exceptionString;
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
        return "Exceptioninfo{" +
        ", phoneModel=" + phoneModel +
        ", systemModel=" + systemModel +
        ", systemVersion=" + systemVersion +
        ", exceptionString=" + exceptionString +
        ", id=" + id +
        ", createTime=" + createTime +
        ", uid=" + uid +
        "}";
    }
}
