package com.policynest.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.policynest.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
}

