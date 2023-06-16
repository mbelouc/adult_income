package com.kaggle.adult.income.adultincome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kaggle.adult.income.adultincome.model.AdultIncome;
import com.kaggle.adult.income.adultincome.repository.AdultIncomeRepository;

@Service
public class AdultIncomeService {
    private final AdultIncomeRepository adultIncomeRepository;

    @Autowired
    public AdultIncomeService(AdultIncomeRepository adultIncomeRepository) {
        this.adultIncomeRepository = adultIncomeRepository;
    }

    public List<AdultIncome> getAllAdultIncomes() {
        return adultIncomeRepository.findAll();
    }

    public AdultIncome getAdultIncomeById(String id) {
        return adultIncomeRepository.findById(id).orElse(null);
    }

    public AdultIncome createAdultIncome(AdultIncome adultIncome) {
        return adultIncomeRepository.save(adultIncome);
    }

    public AdultIncome updateAdultIncome(AdultIncome adultIncome) {
    	AdultIncome existingIncome = adultIncomeRepository.findById(adultIncome.getId()).orElse(null);
        if (existingIncome != null) {
            existingIncome.setAge(adultIncome.getAge());
            existingIncome.setWorkclass(adultIncome.getWorkclass());
            // Set other fields as needed
            return adultIncomeRepository.save(existingIncome);
        }
        return null;
    }

    public void deleteAdultIncomeById(String id) {
        adultIncomeRepository.deleteById(id);
    }

	public Page<AdultIncome> getAdultIncomesWithPagination(Pageable pageable) {
		
		return adultIncomeRepository.findAll(pageable);
	}
}