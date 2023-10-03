package com.mycompany.financemanage.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GraphicsController {

    @RequestMapping("/graphics")
    public String getExpenseData(Model model) {
        Map<String, Double> expenseByDate = getExpenseData(); 
        model.addAttribute("expenseData", expenseByDate);
        return "graphics";
    }
    private Map<String, Double> getExpenseData() {
        Map<String, Double> expenseByDate = new HashMap<>();
        expenseByDate.put("2023-05-01", 100.0);
        expenseByDate.put("2023-05-02", 150.0);
        expenseByDate.put("2023-05-03", 80.0);
        return expenseByDate;
    }
}
