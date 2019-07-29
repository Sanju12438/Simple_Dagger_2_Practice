package com.zerobytes.sanju.dagger2.di.main;

import androidx.lifecycle.ViewModel;

import com.zerobytes.sanju.dagger2.di.ViewModelKey;
import com.zerobytes.sanju.dagger2.ui.main.posts.PostsViewModel;
import com.zerobytes.sanju.dagger2.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindsProfileViewModel(ProfileViewModel profileViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindsPostsViewModel(PostsViewModel postsViewModel);
}
