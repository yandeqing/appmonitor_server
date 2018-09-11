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
public class Page extends BaseBean {

    private static final long serialVersionUID = 1L;

    @TableField("pageStartTime")
    private LocalDateTime pageStartTime;

    @TableField("pageEndTime")
    private LocalDateTime pageEndTime;

    @TableField("pageId")
    private String pageId;

    @TableField("refererPageId")
    private String refererPageId;

    @TableField("cityId")
    private String cityId;
    @TableField("uid")
    private String uid;

    private String parameter;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("createTime")
    private LocalDateTime createTime;


    public LocalDateTime getPageStartTime() {
        return pageStartTime;
    }

    public void setPageStartTime(LocalDateTime pageStartTime) {
        this.pageStartTime = pageStartTime;
    }

    public LocalDateTime getPageEndTime() {
        return pageEndTime;
    }

    public void setPageEndTime(LocalDateTime pageEndTime) {
        this.pageEndTime = pageEndTime;
    }

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

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
        return "Page{" +
        ", pageStartTime=" + pageStartTime +
        ", pageEndTime=" + pageEndTime +
        ", pageId=" + pageId +
        ", refererPageId=" + refererPageId +
        ", cityId=" + cityId +
        ", uid=" + uid +
        ", parameter=" + parameter +
        ", id=" + id +
        ", createTime=" + createTime +
        "}";
    }
}
