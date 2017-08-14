package com.tecnologiasintech.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/**
 * Created by sergiosilva on 8/13/17.
 */

public class DownloadHandler extends Handler {

    private static final String TAG = DownloadHandler.class.getSimpleName();

    @Override
    public void handleMessage(Message msg) {
        downlaodSong(msg.obj.toString());
    }

    private void downlaodSong(String song){

        long endTime = System.currentTimeMillis() + 10 * 1000;

        while (System.currentTimeMillis() < endTime){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        Log.d(TAG, song + " downloaded");

    }
}
