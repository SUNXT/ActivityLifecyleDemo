package com.sun.activitylifecyledemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author sxt
 */
public class MainActivity extends BaseActivity {

    private static int index = 0;

    @Override
    public String setTAG() {
        return getClass().getSimpleName() + "#" + index;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        index ++;
        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_start_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
