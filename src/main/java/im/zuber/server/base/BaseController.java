package im.zuber.server.base;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.ApiResult;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import im.zuber.server.bean.Result;
import im.zuber.server.bean.header.HeaderInfo;


/**
 * @author Zuber
 */
@Controller
public class BaseController extends ApiController {


    protected String toJson(Object o) {
        return JSON.toJSONString(o, true);
    }


    protected void logStr(String o) {
        System.out.println(o);
    }

    protected <T> Result<T> success(String msg, T data) {
        return new Result(Result.SUCCESS, msg, data);
    }


    protected HeaderInfo getHeaderInfo(@RequestHeader HttpHeaders headers) {
        HeaderInfo headerInfo=null;
        List<String> dataHead = headers.get("data_head");
        for (int i = 0; i < dataHead.size(); i++) {
            String head = dataHead.get(i);
            String decode = null;
            try {
                decode = URLDecoder.decode(head, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            headerInfo = JSON.parseObject(decode, HeaderInfo.class);
            logStr("head:\n" + toJson(headerInfo));
        }
        return headerInfo;
    }
}
