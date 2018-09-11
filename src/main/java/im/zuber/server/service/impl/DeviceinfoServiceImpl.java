package im.zuber.server.service.impl;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.dao.AppdeviceMapper;
import im.zuber.server.entity.Appdevice;
import im.zuber.server.entity.Deviceinfo;
import im.zuber.server.dao.DeviceinfoMapper;
import im.zuber.server.service.IDeviceinfoService;
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
public class DeviceinfoServiceImpl extends ServiceImpl<DeviceinfoMapper, Deviceinfo> implements IDeviceinfoService {
    @Autowired
    DeviceinfoMapper deviceinfoMapper;

    @Override
    public Long saveAppdevices(HeaderInfo headerInfo, List<Deviceinfo> appdevices) {
        if (headerInfo != null) {
            int size = appdevices.size();
            for (int i = 0; i < size; i++) {
                Deviceinfo appdevice =  appdevices.get(i);
                appdevice.setUid(headerInfo.getDeviceinfo().getDeviceId());
            }
        }

        Long aLong=0L;
        if(!appdevices.isEmpty()) {
             aLong = deviceinfoMapper.saveDeviceInfos(appdevices);
        }
        return aLong;
    }
}
