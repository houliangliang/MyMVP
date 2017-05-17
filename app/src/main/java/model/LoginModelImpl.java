package model;

import android.text.TextUtils;

import connector.LoginModel;
import connector.OnLoginFinishedListener;

/**
 * date: 2017//16
 * author:侯亮亮候亮亮
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(String username, String password, OnLoginFinishedListener listener) {
        boolean error = false;
        if (TextUtils.isEmpty(username)){
            listener.onUsernameError();//model层里面回调listener
            error = true;
        }
        if (TextUtils.isEmpty(password)){
            listener.onPasswordError();
            error = true;
        }
        if (!error){
            listener.onSuccess();
        }

    }
}
