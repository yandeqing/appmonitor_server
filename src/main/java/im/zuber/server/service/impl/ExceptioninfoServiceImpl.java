package im.zuber.server.service.impl;

import im.zuber.server.entity.Exceptioninfo;
import im.zuber.server.dao.ExceptioninfoMapper;
import im.zuber.server.service.IExceptioninfoService;
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
public class ExceptioninfoServiceImpl extends ServiceImpl<ExceptioninfoMapper, Exceptioninfo> implements IExceptioninfoService {

}
