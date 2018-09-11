package im.zuber.server.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.entity.Appaction;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public interface IAppactionService extends IService<Appaction> {
    boolean deleteAll();

    public List<Appaction> selectListBySQL();

    public Long saveAppActions(HeaderInfo headerInfo,List<Appaction> appaction);

    public List<Appaction> selectListByWrapper(Wrapper wrapper);
}
