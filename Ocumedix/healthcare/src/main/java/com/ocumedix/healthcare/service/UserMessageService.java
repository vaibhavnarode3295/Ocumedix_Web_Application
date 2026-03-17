package com.ocumedix.healthcare.service;

import com.ocumedix.healthcare.model.UserMessage;
import com.ocumedix.healthcare.model.UserMessageVO;
import com.ocumedix.healthcare.repository.UserMessageRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class UserMessageService {
    @Autowired
    private UserMessageRepo userMessageRepo;

    public void saveUser(UserMessageVO userMessage) throws Exception {
        UserMessage userDetail = new UserMessage();
        BeanUtils.copyProperties(userMessage,userDetail);
        userDetail.setLocalDate(LocalDate.now());
        userDetail.setLocalTime(LocalTime.now());
        userMessageRepo.save(userDetail);
    }
}
