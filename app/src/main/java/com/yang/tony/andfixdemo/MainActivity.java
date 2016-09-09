package com.yang.tony.andfixdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


/**
 * main activity
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toast();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    //打包1.apk后，修改toast内容，打包2.apk
    private void toast() {
        Toast.makeText(this, "old", Toast.LENGTH_SHORT).show();
    }
}
