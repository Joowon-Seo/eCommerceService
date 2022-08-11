package com.eCommerceService.client;

import com.eCommerceService.client.mailgun.SendMailForm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandbox65a205b338e340e5b427fee5d7a55191.mailgun.org/messages")
    ResponseEntity<String> sendEmail(@SpringQueryMap SendMailForm from);
}
