package com.springboot.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Applications {

    @Id
    private long id;

    private String ApplicationName;

}
