package com.kaggle.adult.income.adultincome.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kaggle.adult.income.adultincome.model.AdultIncome;

@Repository
public interface AdultIncomeRepository extends MongoRepository<AdultIncome, String> {
}