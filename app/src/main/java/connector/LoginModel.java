package connector;

/**
 * date: 2017/5/16
 * author:侯亮亮候亮亮
 */

public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);

}
