package com.example.WhatsAppClone.Chat;

import java.util.ArrayList;

public class MessageObject {

    String messageId, senderId, message;

    ArrayList<String> mediaUrlList;

    public MessageObject(String messageId, String senderId, String text, ArrayList<String> mediaUrlList){
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = text;
        this.mediaUrlList= mediaUrlList;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public ArrayList<String> getMediaUrlList() {
        return mediaUrlList;
    }
}
