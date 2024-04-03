package com.ms.email.api.academia.consumer;

import com.ms.email.api.academia.dto.EmailRecordDto;
import com.ms.email.api.academia.model.Email;
import com.ms.email.api.academia.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailService emailService;

    @RabbitListener(queues = {"email.log"})
    public void listenEmailQueueEmail(@Payload EmailRecordDto emailRecordDto){
        var emailModel = new Email();
        BeanUtils.copyProperties(emailRecordDto, emailModel);
        emailService.sendEmail(emailModel);
    }
}
