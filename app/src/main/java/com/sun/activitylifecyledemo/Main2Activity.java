package com.sun.activitylifecyledemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends BaseActivity {

    private static int index = 0;

    @Override
    public String setTAG() {
        return getClass().getSimpleName() + "#" + index;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        index ++;
        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
