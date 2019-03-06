package net.orgiu.architecture.viewmodel;

import android.arch.lifecycle.ViewModel;


public class MyViewModel extends ViewModel{

    public MyViewModel(int status){
        this.i = status;
    }

    private int i;

    public int getCounter() {
        return i;
    }

    public void increaseCounter() {
        i++;
    }
}
