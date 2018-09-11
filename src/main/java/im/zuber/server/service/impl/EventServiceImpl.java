package im.zuber.server.service.impl;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.dao.DeviceinfoMapper;
import im.zuber.server.entity.Deviceinfo;
import im.zuber.server.entity.Event;
import im.zuber.server.dao.EventMapper;
import im.zuber.server.service.IEventService;
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
public class EventServiceImpl extends ServiceImpl<EventMapper, Event> implements IEventService {
    @Autowired
    EventMapper eventMapper;

    @Override
    public Long saveAppdevices(HeaderInfo headerInfo, List<Event> events) {
        if (headerInfo != null) {
            int size = events.size();
            for (int i = 0; i < size; i++) {
                Event appdevice =  events.get(i);
                appdevice.setUid(headerInfo.getDeviceinfo().getDeviceId());
            }
        }
        Long aLong=0L;
        if(!events.isEmpty()) {
            aLong = eventMapper.saveEvents(events);
        }
        return aLong;
    }
}
