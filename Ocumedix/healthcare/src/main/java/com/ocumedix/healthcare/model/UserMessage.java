package com.ocumedix.healthcare.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Ocumedix")
public class UserMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String subject;
    private LocalDate localDate;
    private LocalTime localTime;

    @Column(length = 2000)
    private String message;

}
