package com.policynest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policynest.model.Policy;
import com.policynest.repository.PolicyRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    @Override
    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id).orElse(null);
    }

    @Override
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public Policy updatePolicy(Long id, Policy policy) {
        Optional<Policy> existingPolicy = policyRepository.findById(id);
        if (existingPolicy.isPresent()) {
            Policy p = existingPolicy.get();
            p.setPolicyNumber(policy.getPolicyNumber());
            p.setPolicyHolderName(policy.getPolicyHolderName());
            p.setPolicyType(policy.getPolicyType());
            p.setPremiumAmount(policy.getPremiumAmount());
            return policyRepository.save(p);
        }
        return null;
    }

    @Override
    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
}
