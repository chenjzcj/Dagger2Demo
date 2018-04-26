package com.sk7.dagger2demo;

import dagger.Component;

/**
 * Created by Administrator on 2018/3/15.
 */

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
