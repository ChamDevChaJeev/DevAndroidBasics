package com.example.devsapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("life","On Create");
    }
    public void onStart(){
        super.onStart();
        Log.e("life","On start");
    }
    public void onResume(){
        super.onResume();
        Log.e("life","On Resume");
    }
    public void onPause(){
        super.onPause();
        Log.e("life","On Pause");
    }
    public void onStop(){
        super.onStop();
        Log.e("life","On stop");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.e("life","On Destroy");
    }
    public void onRestart(){
        super.onRestart();
        Log.e("life","On restart");
    }

    public void StartService(View view) {
        Log.e("life","StartService");
        Intent serviceintent=new Intent(this,ForegroundService.class);
        serviceintent.putExtra("inputExtra","Android forground service");
        ContextCompat.startForegroundService(this,serviceintent);
        Log.e("life","back to start service");
    }

    public void StopService(View view) {
        Log.e("life","stopService");
    Intent serviceintent=new Intent(this,ForegroundService.class);
    stopService(serviceintent);
        Log.e("life","back to stopService");
    }
}
