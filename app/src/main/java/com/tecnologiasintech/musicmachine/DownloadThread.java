package com.tecnologiasintech.musicmachine;

import android.util.Log;

/**
 * Created by sergiosilva on 8/13/17.
 */

class DownloadThread extends Thread{

    private static final String TAG = DownloadThread.class.getSimpleName();

    @Override
    public void run() {

        for (String song:Playlist.songs) {
            downlaodSong();
        }

    }

    private void downlaodSong(){

        long endTime = System.currentTimeMillis() + 10 * 1000;

        while (System.currentTimeMillis() < endTime){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        Log.d(TAG, "Song downloaded");

    }
}
