package com.tecnologiasintech.musicmachine;

import android.content.Intent;
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
    public static final String KEY_SONG = "song";
    private Button mDownlaodButten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDownlaodButten = (Button) findViewById(R.id.downloadButton);

        mDownlaodButten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "DOWNLOADING", Toast.LENGTH_SHORT).show();

                // Send Messages to the handler for proccesing
                for (String song : Playlist.songs){
                    Intent intent = new Intent(MainActivity.this, DownloadService.class);
                    intent.putExtra(KEY_SONG, song);
                    startService(intent);
                }

            }
        });

    }


}
