package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CustomerSupport;

@Repository
public interface CustomerSupportRepository extends JpaRepository<CustomerSupport, String> {
	Optional<CustomerSupport> findByUsernameAndPassword(String username, String password);
}
