package com.kaggle.adult.income.adultincome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "some")
@Data
@Getter
@Setter
public class AdultIncome {
    @Id
    private String id;
    private int age;
    private String workclass;
    private String total;
    private String education;
    private int educationNum;
    private String maritalStatus;
    private String occupation;
    private String relationship;
    private String race;
    private String gender;
    private int capitalGain;
    private int capitalLoss;
    private int hoursPerWeek;
    private String nativeCountry;
    private String incomeBracket;
    
    
}