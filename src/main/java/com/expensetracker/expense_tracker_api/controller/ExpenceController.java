package com.expensetracker.expense_tracker_api.controller;

import org.springframework.web.bind.annotation.*;
import com.expensetracker.expense_tracker_api.model.Expence;
import com.expensetracker.expense_tracker_api.service.ExpenceService;

import java.util.List;

@RestController
@RequestMapping("expences")
public class ExpenceController {

    private final ExpenceService expenceService;

    public ExpenceController(ExpenceService expenceService) {
        this.expenceService = expenceService;
    }
    @GetMapping
    public List<Expence> getAllExpence(){
        return expenceService.getAllExpence();
    }
    @PostMapping
    public String addExpences(@RequestBody List<Expence> expences) {

        for (Expence expence : expences) {
            expenceService.addExpence(expence);
        }

        return "Expenses Added Successfully";
    }
    @DeleteMapping("/{id}")
    public String deleteExpence(@PathVariable int id){
        expenceService.deleteExpence(id);
        return "Expence deleted successfully";
    }
    @GetMapping("/total")
    public double getTotalExpence(){
        return expenceService.getTotalExpence();
    }
}
