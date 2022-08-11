package com.eCommerceService.service;

import com.eCommerceService.client.MailgunClient;
import com.eCommerceService.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {

        SendMailForm form = SendMailForm.builder()
                .from("zerobase-test@Email.com")
                .to("tjwndnjs1998@gmail.com")
                .subject("Test email from zero base")
                .text("my text")
                .build();

        return mailgunClient.sendEmail(form).getBody();

    }
}
