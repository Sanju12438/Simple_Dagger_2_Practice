package com.zerobytes.sanju.dagger2.di;

import androidx.lifecycle.ViewModelProvider;

import com.zerobytes.sanju.dagger2.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
