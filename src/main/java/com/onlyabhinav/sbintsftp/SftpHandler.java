package com.onlyabhinav.sbintsftp;

import org.springframework.messaging.Message;

import java.io.File;

public class SftpHandler {

    public void handleFile(Message<File> message) {
        System.out.println("Handling file: " + message.getPayload().getName());
    }

}
