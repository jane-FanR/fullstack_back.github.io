package com.programcoding.fullstackbackend.repository;

import com.programcoding.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{

}
