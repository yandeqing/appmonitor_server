package im.zuber.server.service.impl;

import im.zuber.server.entity.Appinfo;
import im.zuber.server.dao.AppinfoMapper;
import im.zuber.server.service.IAppinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
@Service
public class AppinfoServiceImpl extends ServiceImpl<AppinfoMapper, Appinfo> implements IAppinfoService {

}
