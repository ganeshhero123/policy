package com.policynest.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Policy {

    @Id
    @GeneratedValue
    private Long id;
    private String policyNumber;
    private String policyHolderName;
    private String policyType;
    private double premiumAmount;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public void setPolicyHolderName(String policyHolderName) { this.policyHolderName = policyHolderName; }
    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }
    public double getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(double premiumAmount) { this.premiumAmount = premiumAmount; }
}
