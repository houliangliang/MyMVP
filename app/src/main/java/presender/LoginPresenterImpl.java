package presender;

import connector.LoginPresenter;
import connector.LoginView;
import connector.OnLoginFinishedListener;
import model.LoginModelImpl;

/**
 * date: 2017/5/16
 * author:侯亮亮候亮亮
 */

public class LoginPresenterImpl implements OnLoginFinishedListener, LoginPresenter {
    LoginView mLoginView;
    private final LoginModelImpl mLoginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView=loginView;
        mLoginModel = new LoginModelImpl();
    }

    @Override
    public void onUsernameError() {
      mLoginView.setUsernameError();
    }

    @Override
    public void onPasswordError() {
     mLoginView.setPasswordError();
    }

    @Override
    public void onSuccess() {
     mLoginView.navigateToHome();
    }

    @Override
    public void validateCredentials(String username, String password) {
    mLoginModel.login(username,password,this);
    }
}
