package com.nivedhithav.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityA extends Activity {

    private static int count=0;
    private TextView mStatusCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mStatusCount=(TextView) findViewById(R.id.count);
        mStatusCount.setText(Integer.toString(count));
    }

    @Override
    protected void onResume() {
        super.onResume();

        mStatusCount.setText(Integer.toString(count));
        count++;
    }

    public void startDialog(View v) {
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }

    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }

    public void finishActivityA(View v) {

        ActivityA.this.finish();
    }

}
