package im.zuber.server.dao;

import java.util.List;

import im.zuber.server.entity.Deviceinfo;
import im.zuber.server.entity.Event;
import im.zuber.server.base.SuperMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public interface EventMapper extends SuperMapper<Event> {
    Long saveEvents(List<Event> events);
}
