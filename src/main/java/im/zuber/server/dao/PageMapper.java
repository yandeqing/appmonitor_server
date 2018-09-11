package im.zuber.server.dao;

import java.util.List;

import im.zuber.server.entity.Appdevice;
import im.zuber.server.entity.Page;
import im.zuber.server.base.SuperMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public interface PageMapper extends SuperMapper<Page> {
    Long savePages(List<Page> appaction);
}
