package com.zerobytes.sanju.dagger2.di;

import com.zerobytes.sanju.dagger2.di.auth.AuthModule;
import com.zerobytes.sanju.dagger2.di.auth.AuthScope;
import com.zerobytes.sanju.dagger2.di.auth.AuthViewModelsModule;
import com.zerobytes.sanju.dagger2.di.main.MainFragmentBuildersModule;
import com.zerobytes.sanju.dagger2.di.main.MainModule;
import com.zerobytes.sanju.dagger2.di.main.MainScope;
import com.zerobytes.sanju.dagger2.di.main.MainViewModelsModule;
import com.zerobytes.sanju.dagger2.ui.auth.AuthActivity;
import com.zerobytes.sanju.dagger2.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(modules = {
            AuthModule.class,
            AuthViewModelsModule.class,
    })
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(modules = {
            MainFragmentBuildersModule.class,
            MainViewModelsModule.class,
            MainModule.class,

    })
    abstract MainActivity contributeMainActivity();

}
