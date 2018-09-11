package im.zuber.server.bean.header;

import com.alibaba.fastjson.annotation.JSONField;

import im.zuber.server.entity.Appinfo;
import im.zuber.server.entity.Deviceinfo;

/**
 * @author Tamic
 * @date 2016-04-06
 */
public class HeaderInfo {
    @JSONField(ordinal = 1)
    private Appinfo appinfo;
    @JSONField(ordinal = 2)
    private Deviceinfo deviceinfo;
    @JSONField(ordinal = 3)
    private NetworkInfo networkinfo;

    public HeaderInfo() {
    }

    public HeaderInfo(Appinfo appinfo, Deviceinfo deviceinfo, NetworkInfo networkinfo) {
        this.appinfo = appinfo;
        this.deviceinfo = deviceinfo;
        this.networkinfo = networkinfo;
    }

    public Appinfo getAppinfo() {
        return appinfo;
    }

    public void setAppinfo(Appinfo appinfo) {
        this.appinfo = appinfo;
    }

    public Deviceinfo getDeviceinfo() {
        return deviceinfo;
    }

    public void setDeviceinfo(Deviceinfo deviceinfo) {
        this.deviceinfo = deviceinfo;
    }

    public NetworkInfo getNetworkinfo() {
        return networkinfo;
    }

    public void setNetworkinfo(NetworkInfo networkinfo) {
        this.networkinfo = networkinfo;
    }


}
