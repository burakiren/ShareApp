package com.burakiren.shareapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends ActionBarActivity implements View.OnClickListener{

    Button bLogin;
    EditText etUserName, etPassword;
    TextView tvRegisterLink;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvRegisterLink = (TextView) findViewById(R.id.tvRegisterLink);
        bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);

    }
    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.bLogin:

                User user = new User(null, null);

                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);
                break;
            case R.id.tvRegisterLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
