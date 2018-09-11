package im.zuber.server.service.impl;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.dao.AppactionMapper;
import im.zuber.server.entity.Appaction;
import im.zuber.server.entity.Appdevice;
import im.zuber.server.dao.AppdeviceMapper;
import im.zuber.server.service.IAppdeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
@Service
public class AppdeviceServiceImpl extends ServiceImpl<AppdeviceMapper, Appdevice> implements IAppdeviceService {


    @Autowired
    AppdeviceMapper appdeviceMapper;

    @Override
    public Long saveAppdevices(HeaderInfo headerInfo, List<Appdevice> appdevices) {
            if (headerInfo != null) {
                int size = appdevices.size();
                for (int i = 0; i < size; i++) {
                    Appdevice appdevice =  appdevices.get(i);
                    appdevice.setUid(headerInfo.getDeviceinfo().getDeviceId());
                }
            }
            Long aLong = appdeviceMapper.saveAppdevices(appdevices);
            return aLong;
        }
}
