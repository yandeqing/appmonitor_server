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
public class Appevent extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableField("appDeviceId")
    private String appDeviceId;

    @TableField("eventId")
    private Integer eventId;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("uid")
    private String uid;


    public String getAppDeviceId() {
        return appDeviceId;
    }

    public void setAppDeviceId(String appDeviceId) {
        this.appDeviceId = appDeviceId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
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
        return "Appevent{" +
        ", appDeviceId=" + appDeviceId +
        ", eventId=" + eventId +
        ", id=" + id +
        ", createTime=" + createTime +
        ", uid=" + uid +
        "}";
    }
}
