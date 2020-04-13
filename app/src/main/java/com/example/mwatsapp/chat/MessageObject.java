package com.example.mwatsapp.chat;

import java.util.ArrayList;

public class MessageObject {

    String messageId,
            senderId,
            message;

    ArrayList<String> mediaUrList;



    public MessageObject(String messageId, String senderId, String message, ArrayList<String> mediaUrList) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.mediaUrList = mediaUrList;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getMediaUrList() {
        return mediaUrList;
    }
}
