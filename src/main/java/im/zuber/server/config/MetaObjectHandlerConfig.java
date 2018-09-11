package im.zuber.server.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {


  @Override
  public void insertFill(MetaObject metaObject) {
    Object createTime = getFieldValByName("createTime", metaObject);
    if(Objects.isNull(createTime)){
      setFieldValByName("createTime", LocalDateTime.now(), metaObject);//mybatis-plus版本2.0.9+
    }
  }

  @Override
  public void updateFill(MetaObject metaObject) {
    setFieldValByName("createTime", LocalDateTime.now(), metaObject);
  }
}
