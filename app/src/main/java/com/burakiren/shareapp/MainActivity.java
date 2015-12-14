package com.burakiren.shareapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button bLogout;
    EditText etPassword, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPassword = (EditText)findViewById(R.id.etPassword);
        etUsername = (EditText)findViewById(R.id.etUsername);

        bLogout = (Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.bLogout:

                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
