package com.tecnologiasintech.musicmachine;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/**
 * Created by sergiosilva on 8/13/17.
 */

class DownloadThread extends Thread{

    private static final String TAG = DownloadThread.class.getSimpleName();
    public DownloadHandler mHandler;

    @Override
    public void run() {

        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();

    }
}
