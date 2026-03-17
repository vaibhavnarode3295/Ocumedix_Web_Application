package com.ocumedix.healthcare.repository;

import com.ocumedix.healthcare.model.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMessageRepo extends JpaRepository<UserMessage,Long> {
}
