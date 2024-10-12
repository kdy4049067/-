package com.chatting.domain;

import java.util.*;

public class ChatRoom {

    private String roomId;
    private String name;
    private GenerateRandom generateRandom;

    public ChatRoom(String name, GenerateRandom generateRandom){
        this.generateRandom = generateRandom;
        this.name = name;
        this.roomId = generateRandom.generateRandom();
    }

}

