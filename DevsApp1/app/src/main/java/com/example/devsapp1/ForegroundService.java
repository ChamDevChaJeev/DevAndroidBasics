package com.example.devsapp1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

import androidx.core.app.NotificationCompat;

public class ForegroundService extends Service {

    public static final String Channel_Id="ForegroundService";

    @Override
    public void onCreate(){
        Log.e("life","On create of foregroundservice");
        super.onCreate();
    }
@Override
  public int onStartCommand(Intent intent, int flags, int StartId){
    Log.e("life","On restart of foregroundservice");
        String Input=intent.getStringExtra("inputExtra");
    Log.e("life","Get Strign extra"+Input);
        createNotificationChannel();
    Log.e("life","creating intent");
        Intent intent1=new Intent(this,MainActivity.class);

    PendingIntent pendingintent=PendingIntent.getActivity(this,0,intent1,0);
    Notification notification=new NotificationCompat.Builder(this, Channel_Id)
    .setContentTitle("Foreground Service")
            .setContentText(Input)
            .setContentIntent(pendingintent)
            .build();
    startForeground(1,notification);
    Log.e("life","creating pending intent");
    return START_NOT_STICKY;
    }

@Override
public void onDestroy(){
        onDestroy();
}


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private void createNotificationChannel() {
        Log.e("life","creating notification channel");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    Channel_Id,
                    "Foreground Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
            Log.e("life","created notification channel");
        }
    }
}


