package com.policynest.service;





import java.util.List;

import com.policynest.model.Policy;

public interface PolicyService {
    List<Policy> getAllPolicies();
    Policy getPolicyById(Long id);
    Policy createPolicy(Policy policy);
    Policy updatePolicy(Long id, Policy policy);
    void deletePolicy(Long id);
}

