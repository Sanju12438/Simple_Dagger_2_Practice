package com.zerobytes.sanju.dagger2.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.zerobytes.sanju.dagger2.SessionManager;
import com.zerobytes.sanju.dagger2.models.User;
import com.zerobytes.sanju.dagger2.ui.auth.AuthResource;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    private SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager manager) {
        this.sessionManager = manager;
        Log.d(TAG, "ProfileViewModel: ViewModelReady");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser() {
        return sessionManager.getAuthUser();
    }
}
