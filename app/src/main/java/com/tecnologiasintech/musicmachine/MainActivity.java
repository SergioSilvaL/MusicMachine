package com.tecnologiasintech.musicmachine;

import android.os.Message;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mDownlaodButten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DownloadThread thread = new DownloadThread();
        thread.setName("DownloadThread");
        thread.start();

        mDownlaodButten = (Button) findViewById(R.id.downloadButton);

        mDownlaodButten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();

                // Send Messages to the handler for proccesing
                for (String songs : Playlist.songs){
                    Message message = Message.obtain();
                    message.obj = songs;
                    thread.mHandler.sendMessage(message);
                }

            }
        });

    }


}
