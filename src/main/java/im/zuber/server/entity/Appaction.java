package im.zuber.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serializable;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import org.springframework.context.annotation.Primary;

import im.zuber.server.base.BaseBean;

/**
 * <p>
 * 
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public class Appaction extends BaseBean {


    @TableField("actionTime")
    private LocalDateTime actionTime;

    @TableField("appActionType")
    private String appActionType;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("uid")
    private String uid;


    public LocalDateTime getActionTime() {
        return actionTime;
    }

    public void setActionTime(LocalDateTime actionTime) {
        this.actionTime = actionTime;
    }

    public String getAppActionType() {
        return appActionType;
    }

    public void setAppActionType(String appActionType) {
        this.appActionType = appActionType;
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
        return "Appaction{" +
        ", actionTime=" + actionTime +
        ", appActionType=" + appActionType +
        ", id=" + id +
        ", createTime=" + createTime +
        ", uid=" + uid +
        "}";
    }

}
