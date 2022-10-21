package com.dataloader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataloader.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{

	public UserModel findByUsername(String username);
}
