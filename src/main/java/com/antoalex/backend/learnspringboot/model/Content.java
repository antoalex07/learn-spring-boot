package com.antoalex.backend.learnspringboot.model;

import java.time.LocalDateTime;

public record Content(
    
    Integer id,
    String title,
    String desc,
    Status status,
    Type type,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
) {

}
