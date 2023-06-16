package com.kaggle.adult.income.adultincome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaggle.adult.income.adultincome.model.AdultIncome;
import com.kaggle.adult.income.adultincome.service.AdultIncomeService;

@RestController
@RequestMapping("/adult-incomes")
public class AdultIncomeController {

    @Autowired
    private AdultIncomeService adultIncomeService;

    @GetMapping("/all")
    public List<AdultIncome> getAllAdultIncomes() {
        return adultIncomeService.getAllAdultIncomes();
    }
    @GetMapping("/hello")
    public String getAll() {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public AdultIncome getAdultIncomeById(@PathVariable String id) {
        return adultIncomeService.getAdultIncomeById(id);
    }

    @PostMapping("/")
    public AdultIncome createAdultIncome(@RequestBody AdultIncome adultIncome) {
        return adultIncomeService.createAdultIncome(adultIncome);
    }

    @PutMapping("/{id}")
    public AdultIncome updateAdultIncome(@RequestBody AdultIncome adultIncome) {
        return adultIncomeService.updateAdultIncome(adultIncome);
    }

    @DeleteMapping("/{id}")
    public void deleteAdultIncome(@PathVariable String id) {
        adultIncomeService.deleteAdultIncomeById(id);
    }
    
    @GetMapping("/")
    public Page<AdultIncome> getAllAdultIncomes(Pageable pageable) {
        return adultIncomeService.getAdultIncomesWithPagination(pageable);
    }
}