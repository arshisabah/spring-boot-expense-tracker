package com.expensetracker.expense_tracker_api.service;
import com.expensetracker.expense_tracker_api.model.Expence;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ExpenceService {

    private List<Expence> expenceList = new ArrayList<>();
    public List<Expence> getAllExpence(){
        return expenceList;
    }
    public void addExpence(Expence expence){
        expenceList.add(expence);
    }
    public void deleteExpence(int id){
        expenceList.remove(id);
    }
    public double getTotalExpence(){
        double total = 0;
        for(Expence expence:expenceList){
            total += expence.getAmount();
        }
        return total;
    }

}
