package net.orgiu.architecture.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import java.security.Provider;

public class CustomViewModelFactory implements ViewModelProvider.Factory {

    int status;

    public CustomViewModelFactory(int status){
        this.status = status;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (!modelClass.getName().equalsIgnoreCase("MyViewModel")){
            try {
                return  modelClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;

            }
        } else {
            return (T) new MyViewModel(status);
        }

    }
}
