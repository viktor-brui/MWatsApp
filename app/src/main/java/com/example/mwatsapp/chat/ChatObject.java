package com.example.mwatsapp.chat;

import com.example.mwatsapp.user.UserObject;

import java.io.Serializable;
import java.util.ArrayList;

public class ChatObject implements Serializable {
    private String chatId;
    private ArrayList<UserObject> userObjectArrayList = new ArrayList<>();

    public ChatObject(String chatId) {
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }

    public ArrayList<UserObject> getUserObjectArrayList() {
        return userObjectArrayList;
    }

    public void addUserToArrayList(UserObject mUser){
        userObjectArrayList.add(mUser);
    }
}
