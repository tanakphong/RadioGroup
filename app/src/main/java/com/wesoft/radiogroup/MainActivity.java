package com.wesoft.radiogroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wesoft.radiogroup.Class.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(Utils.setTheme("Lar"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
