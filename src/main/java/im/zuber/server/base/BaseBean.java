package im.zuber.server.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 版权:上海屋聚 版权所有
 * author: yandeqing
 * version: 3.0.0
 * date:2018/9/1 11:54
 * 备注:
 *
 * @author Zuber
 */
public class BaseBean<T extends Model> extends Model<T>  {
    @TableId("id")
    protected Long id;
    @TableField("createTime")
    protected LocalDateTime createTime;
    @TableField("uid")
    protected String uid;

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
    public Serializable pkVal() {
        return this.id;
    }


}
