package im.zuber.server.controller;

import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import im.zuber.server.base.BaseController;
import im.zuber.server.bean.Result;
import im.zuber.server.bean.body.DataBlock;
import im.zuber.server.bean.header.HeaderInfo;
import im.zuber.server.entity.Appaction;
import im.zuber.server.entity.Deviceinfo;
import im.zuber.server.service.IAppactionService;
import im.zuber.server.service.IDeviceinfoService;
import im.zuber.server.service.IEventService;
import im.zuber.server.service.IPageService;
import im.zuber.server.service.impl.AppdeviceServiceImpl;
import im.zuber.server.service.impl.DeviceinfoServiceImpl;

/**
 * @author Zuber
 */
@Controller
public class StatController extends BaseController {

    @Autowired
    private IAppactionService iAppactionService;

    @Autowired
    private IDeviceinfoService deviceinfoService;

    @Autowired
    private IEventService eventService;

    @Autowired
    private IPageService pageService;

    @ResponseBody
    @PostMapping("/uploadAction")
    public Result<Boolean> uploadAppStat(@RequestHeader HttpHeaders headers, @RequestBody String dataBlock) {

        HeaderInfo headerInfo = getHeaderInfo(headers);

        DataBlock data = JSON.parseObject(dataBlock, DataBlock.class);

        iAppactionService.saveAppActions(headerInfo, data.getAppActions());

        Deviceinfo deviceinfo = headerInfo.getDeviceinfo();
        List<Deviceinfo> deviceinfos = new ArrayList<>();
        deviceinfos.add(deviceinfo);
        deviceinfoService.saveAppdevices(headerInfo, deviceinfos);

        eventService.saveAppdevices(headerInfo, data.getEvent());

        pageService.savePages(headerInfo, data.getPage());

        logStr("body:\n" + toJson(data));

        return success("成功", true);
    }






}
