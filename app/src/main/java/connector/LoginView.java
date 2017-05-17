package connector;

/**
 * date: 2017/5/16
 * author:侯亮亮候亮亮
 */

public interface LoginView {
    void showProgress();
    void hideProgress();


    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
