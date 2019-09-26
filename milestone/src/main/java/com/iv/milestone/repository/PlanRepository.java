package com.iv.milestone.repository;

import com.iv.milestone.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Long> {

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='expire_not_start' WHERE id=?1")
    void planExpireNotStart(long id);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='expire_not_finish' WHERE id=?1")
    void planExpireNotFinish(long id);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='doing' WHERE id=?1")
    void planStart(long id);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='finished' WHERE id=?1")
    void planFinish(long id);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='supply' WHERE id=?1")
    void planSupply(long id);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE Plan SET status='modify' WHERE id=?1")
    void planModify(long id);

    List<Plan> findByMilestoneLikeOrSrTitleLikeOrArTitleLikeOrDescriptionLikeOrDesignManagerLikeOrDevelopManagerLike(String milestone, String srTitle, String arTitle, String description, String designManager, String developManager);

    List<Plan> findByProjectId(Long projectId);
}
