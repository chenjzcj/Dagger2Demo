package com.sk7.dagger2demo;

/**
 * Created by Administrator on 2018/3/15.
 */

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    Context providesContext() {
        return context;
    }

    @Provides
    List<String> providesImageUrlList() {
        List<String> list = new ArrayList<>();
        list.add("http://img4.cache.netease.com/photo/0001/2016-08-13/900x600_BUBDM7GI00AO0001.jpg");
        list.add("http://img4.cache.netease.com/photo/0001/2016-08-13/900x600_BUBDM7JI00AO0001.jpg");
        list.add("http://img3.cache.netease.com/photo/0001/2016-08-13/900x600_BUBDM85900AO0001.jpg");
        list.add("http://img3.cache.netease.com/photo/0001/2016-08-13/900x600_BUBDM8F500AO0001.jpg");
        list.add("http://i0.sinaimg.cn/dy/slidenews/76_img/2016_32/76522_1882718_992616.jpg");
        return list;
    }
}
