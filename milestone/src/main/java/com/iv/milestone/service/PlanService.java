package com.iv.milestone.service;

import com.iv.milestone.entity.Plan;
import com.iv.milestone.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {
    @Autowired
    PlanRepository planRepository;

    public List<Plan> findAllPlans(Long projectId) {
        return planRepository.findByProjectId(projectId);
    }

    public List<Plan> search(String keywords) {
        return planRepository.findByMilestoneLikeOrSrTitleLikeOrArTitleLikeOrDescriptionLikeOrDesignManagerLikeOrDevelopManagerLike(keywords, keywords,keywords,keywords,keywords,keywords);
    }


}
