package com.example.tp1_deangelis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class LlamadaEmergencia extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean con = intent.getExtras().getBoolean("connected");

        if(con)
        {
            Toast.makeText(context, "USB Conectado", Toast.LENGTH_LONG).show();
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel: " +"911"));
            context.startActivity(intent);
        }
    }
}
