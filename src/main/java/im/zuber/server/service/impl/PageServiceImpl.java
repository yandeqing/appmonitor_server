package im.zuber.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.dao.PageMapper;
import im.zuber.server.entity.Page;
import im.zuber.server.service.IPageService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements IPageService {
    @Autowired
    PageMapper pageMapper;

    @Override
    public Long savePages(HeaderInfo headerInfo, List<Page> events) {
        if (headerInfo != null) {
            int size = events.size();
            for (int i = 0; i < size; i++) {
                Page page =  events.get(i);
                page.setUid(headerInfo.getDeviceinfo().getDeviceId());
            }
        }
        Long aLong=0L;
        if(!events.isEmpty()) {
            aLong = pageMapper.savePages(events);
        }
        return aLong;
    }
}
