package com.example.mwatsapp.util;

import com.onesignal.OneSignal;

import org.json.JSONException;
import org.json.JSONObject;

public class SendNotification {

    public SendNotification(String message, String heading, String notificationKey) {


        notificationKey = "684a0a45-f485-48ec-8d14-0e12d955450f";

        try {
            JSONObject notificationContent = new JSONObject(
                    "{'contents':{'en':'" + message + "'},"+
                    "'include_player_ids':['" + notificationKey + "']," +
                    "'headings':{'en': '" + heading + "'}}" );
            OneSignal.postNotification(notificationContent, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
