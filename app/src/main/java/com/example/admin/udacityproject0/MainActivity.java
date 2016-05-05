package com.example.admin.udacityproject0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                toast("1");

                break;
            case R.id.button2:
                toast("2");

                break;
            case R.id.button3:
                toast("3");

                break;
            case R.id.button4:
                toast("4");

                break;
            case R.id.button5:
                toast("5");

                break;
            case R.id.button6:
                toast("6");

                break;
        }
    }

    private void toast(String s) {
        Toast.makeText(this, "Click" + s, Toast.LENGTH_SHORT).show();

    }
}
