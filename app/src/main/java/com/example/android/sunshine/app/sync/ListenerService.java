package com.example.android.sunshine.app.sync;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Joopk on 2/29/2016.
 */
public class ListenerService extends WearableListenerService {

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {

        if (messageEvent.getPath().equals("/update_path")) {
            SunshineSyncAdapter.syncImmediately(this);
        } else {
            super.onMessageReceived(messageEvent);
        }
    }
}
