package com.houliangliang.bawei.mymvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import connector.LoginView;
import presender.LoginPresenterImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginView {

    private EditText user;
    private EditText paw;
    private Button btn_login;
    private LoginPresenterImpl mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mPresenter = new LoginPresenterImpl(this);
    }

    private void initView() {
        user = (EditText) findViewById(R.id.user);
        paw = (EditText) findViewById(R.id.paw);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                mPresenter.validateCredentials(user.getText().toString(), paw.getText().toString());
                break;
        }
    }

    private void submit() {
        // validate
        String userString = user.getText().toString().trim();
        if (TextUtils.isEmpty(userString)) {
            Toast.makeText(this, "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }

        String pawString = paw.getText().toString().trim();
        if (TextUtils.isEmpty(pawString)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }

    @Override
    public void showProgress() {


    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {
        Toast.makeText(this, "name不能为空", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPasswordError() {
        Toast.makeText(this, "mima不能为空", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateToHome() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }
}
