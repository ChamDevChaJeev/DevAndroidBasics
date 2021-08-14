package com.example.devsapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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
}
