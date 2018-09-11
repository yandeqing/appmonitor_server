package im.zuber.server.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import im.zuber.server.base.SuperMapper;
import im.zuber.server.entity.Appaction;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public interface AppactionMapper extends SuperMapper<Appaction> {
    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select * from appaction")
    List<Appaction> selectListBySQL();

    Long saveAppActions(List<Appaction> appaction);

    List<Appaction> selectListByWrapper(@Param("ew") Wrapper wrapper);
}
