/*
 *    Copyright (C) 2016 Tamic
 *
 *    link :https://github.com/Tamicer
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package im.zuber.server.bean.body;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import im.zuber.server.entity.Appaction;
import im.zuber.server.entity.Event;
import im.zuber.server.entity.Exceptioninfo;
import im.zuber.server.entity.Page;

/**
 * @author yandeqing
 * @version v3.7.1
 * 备注:整合数据集合一次性传给后台
 * @date 2018/8/14
 */
public class DataBlock implements Serializable {
    private ArrayList<Appaction> appActions;
    private ArrayList<Page> page;
    private ArrayList<Event> event;
    private ArrayList<Exceptioninfo> exceptionInfos;

    public List<Appaction> getAppActions() {
        return appActions;
    }

    public void setAppActions(ArrayList<Appaction> appActions) {
        this.appActions = appActions;
    }

    public List<Page> getPage() {
        return page;
    }

    public void setPage(ArrayList<Page> page) {
        this.page = page;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(ArrayList<Event> event) {
        this.event = event;
    }

    public List<Exceptioninfo> getExceptionInfos() {
        return exceptionInfos;
    }

    public void setExceptionInfos(ArrayList<Exceptioninfo> exceptionInfos) {
        this.exceptionInfos = exceptionInfos;
    }

    @Override
    public String toString() {
        return "DataBlock{" +
                "appActions=" + appActions +
                ", page=" + page +
                ", event=" + event +
                ", exceptionInfos=" + exceptionInfos +
                '}';
    }
}
