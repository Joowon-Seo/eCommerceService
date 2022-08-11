package com.eCommerceService.client.service;

import com.eCommerceService.service.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class EmailSendServiceTest {

    @Autowired
    private EmailSendService emailSendService;

    @Test
    void EmailTest() {
        String response = emailSendService.sendEmail();
        System.out.println(response);

    }

}