package im.zuber.server.service;

import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.entity.Appaction;
import im.zuber.server.entity.Appdevice;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
public interface IAppdeviceService extends IService<Appdevice> {
    public Long saveAppdevices(HeaderInfo headerInfo, List<Appdevice> appaction);
}
