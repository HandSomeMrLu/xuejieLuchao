package com.iv.milestone.controller;

import com.iv.milestone.entity.Plan;
import com.iv.milestone.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    PlanService planService;

    @PostMapping("/search/{keywords}")
    public List<Plan> search(@PathVariable("keywords") String keywords) {
        return planService.search(keywords);
    }
}
