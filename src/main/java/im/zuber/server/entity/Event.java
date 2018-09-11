package im.zuber.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Event extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableField("pageId")
    private String pageId;

    @TableField("refererPageId")
    private String refererPageId;
    @TableField("uid")
    private String uid;

    @TableField("eventName")
    private String eventName;

    @TableField("actionTime")
    private LocalDateTime actionTime;

    private String parameter;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;


    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getRefererPageId() {
        return refererPageId;
    }

    public void setRefererPageId(String refererPageId) {
        this.refererPageId = refererPageId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getActionTime() {
        return actionTime;
    }

    public void setActionTime(LocalDateTime actionTime) {
        this.actionTime = actionTime;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
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

    @Override
    public String toString() {
        return "Event{" +
        ", pageId=" + pageId +
        ", refererPageId=" + refererPageId +
        ", uid=" + uid +
        ", eventName=" + eventName +
        ", actionTime=" + actionTime +
        ", parameter=" + parameter +
        ", id=" + id +
        ", createTime=" + createTime +
        "}";
    }
}
