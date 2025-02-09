package com.example.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    // This method will be invoked when a message is received at /app/chat
    @MessageMapping("/chat")
    @SendTo("/topic/messages")  // Broadcast the message to all clients
    public Message sendMessage(Message message) {
        return message;
    }
}
