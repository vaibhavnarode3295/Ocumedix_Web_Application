package com.ocumedix.healthcare.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@RequiredArgsConstructor
public class UserMessageVO {
    private String name;
    private String email;
    private String phone;
    private String subject;
    private String message;
}
