package im.zuber.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.dao.AppactionMapper;
import im.zuber.server.entity.Appaction;
import im.zuber.server.service.IAppactionService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
@Service
public class AppactionServiceImpl extends ServiceImpl<AppactionMapper, Appaction> implements IAppactionService {

    @Autowired
    AppactionMapper appactionMapper;

    @Override
    public boolean deleteAll() {
        return appactionMapper.deleteAll()>0;
    }

    @Override
    public List<Appaction> selectListBySQL() {
        return appactionMapper.selectListBySQL();
    }


    @Override
    public Long saveAppActions(HeaderInfo headerInfo, List<Appaction> appActions) {
        if (headerInfo != null) {
            int size = appActions.size();
            for (int i = 0; i < size; i++) {
                Appaction appaction =  appActions.get(i);
                appaction.setUid(headerInfo.getDeviceinfo().getDeviceId());
            }
        }
        Long aLong=0L;
        if(!appActions.isEmpty()) {
            aLong = appactionMapper.saveAppActions(appActions);
        }
        return aLong;
    }

    @Override
    public List<Appaction> selectListByWrapper(Wrapper wrapper) {


        return appactionMapper.selectListByWrapper(wrapper);
    }
}
