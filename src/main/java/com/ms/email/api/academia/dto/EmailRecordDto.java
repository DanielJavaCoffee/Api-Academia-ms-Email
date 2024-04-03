package com.ms.email.api.academia.dto;

import java.util.UUID;

public record EmailRecordDto(

        UUID clienteId,
        String emailTo,
        String subject,

        String text
) {
}