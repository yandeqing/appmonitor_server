package im.zuber.server.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.api.ApiResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import im.zuber.server.base.BaseController;
import im.zuber.server.entity.Appaction;
import im.zuber.server.service.IAppactionService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yandeqing
 * @since 2018-09-03
 */
@RestController
@RequestMapping("/appaction")
public class AppactionController extends BaseController {

    @Autowired
    private IAppactionService iAppactionService;

    /**
     * http://localhost:8080/appaction/selectAll
     */
    @GetMapping("/getAllAppaction")
    public List<Appaction> getAllAppaction() {
        return iAppactionService.selectListBySQL();
    }

    /**
     * AR 部分测试
     * http://localhost:8080/appaction/test1
     */
    @GetMapping("/deleteAll")
    public ApiResult<Boolean> deleteAll() {
        return success(iAppactionService.deleteAll());
    }

    @ResponseBody
    @PostMapping("/addAppaction")
    public ApiResult<Boolean> addAppaction(@RequestBody String content) {
        Appaction appaction = JSON.parseObject(content, Appaction.class);
        Boolean save = iAppactionService.save(appaction);
        logStr("body:\n" + save);
        return success(save);
    }
}

