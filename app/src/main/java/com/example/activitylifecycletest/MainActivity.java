package com.example.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);
        Button displayToastActivity = (Button)findViewById(R.id.display_toast_value);
        final EditText editTextValue = (EditText)findViewById(R.id.editText);
        startNormalActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent  intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent  intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
        displayToastActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                String inputText = editTextValue.getText().toString();
                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected  void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }






















}
