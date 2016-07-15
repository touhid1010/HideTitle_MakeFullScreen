package com.touhidapps.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title not the title bar


        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        aBoolean = false;


    } // end of onCreate


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:

                if (aBoolean) {

                    //code that displays the content in full screen mode (hide notification panel)
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);


                    aBoolean = false;
                } else {

                    //code that displays the content in full screen mode (hide notification panel)
                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

                    aBoolean = true;
                }

                break;
        }
    }
}
