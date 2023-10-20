package com.onlyabhinav.sbintsftp;

import org.apache.sshd.sftp.client.SftpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.file.remote.session.SessionFactory;

@SpringBootApplication
@ImportResource("classpath:/sftp-config.xml")
public class SbintsftpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbintsftpApplication.class, args);

 
        //SessionFactory<SftpClient.DirEntry> sessionFactory;//= context.getBean(CachingSessionFactory.class);

    }

}
