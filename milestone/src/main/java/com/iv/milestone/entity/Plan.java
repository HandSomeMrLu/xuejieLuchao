package com.iv.milestone.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String milestone;
    @Column(nullable = false)
    private String version;
    @Column(nullable = false)
    private String srTitle;
    private String arTitle;
    @Column(nullable = false)
    private String description;
    private String designManager;
    @Column(nullable = false)
    private String priority;
    private String preDependent;
    @Column(nullable = false)
    private double workload;
    @Column(nullable = false)
    private Date planStart;
    @Column(nullable = false)
    private Date planFinish;
    @Column(nullable = false)
    private String developManager;
    private Date actualStart;
    private Date actualFinish;
    private String completeWeight;
    private String codeDevelop;
    private String jointAdjustment;
    private String problemRepair;
    private String comment;
    private String status;
    private Long projectId;

    public Plan(String milestone, String version, String srTitle, String description, String designManager, String priority, String preDependent, double workload, Date planStart, Date planFinish, String developManager, String comment) {
        this.milestone = milestone;
        this.version = version;
        this.srTitle = srTitle;
        this.description = description;
        this.designManager = designManager;
        this.priority = priority;
        this.preDependent = preDependent;
        this.workload = workload;
        this.planStart = planStart;
        this.planFinish = planFinish;
        this.developManager = developManager;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSrTitle() {
        return srTitle;
    }

    public void setSrTitle(String srTitle) {
        this.srTitle = srTitle;
    }

    public String getArTitle() {
        return arTitle;
    }

    public void setArTitle(String arTitle) {
        this.arTitle = arTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignManager() {
        return designManager;
    }

    public void setDesignManager(String designManager) {
        this.designManager = designManager;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPreDependent() {
        return preDependent;
    }

    public void setPreDependent(String preDependent) {
        this.preDependent = preDependent;
    }

    public double getWorkload() {
        return workload;
    }

    public void setWorkload(double workload) {
        this.workload = workload;
    }

    public Date getPlanStart() {
        return planStart;
    }

    public void setPlanStart(Date planStart) {
        this.planStart = planStart;
    }

    public Date getPlanFinish() {
        return planFinish;
    }

    public void setPlanFinish(Date planFinish) {
        this.planFinish = planFinish;
    }

    public String getDevelopManager() {
        return developManager;
    }

    public void setDevelopManager(String developManager) {
        this.developManager = developManager;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActualFinish() {
        return actualFinish;
    }

    public void setActualFinish(Date actualFinish) {
        this.actualFinish = actualFinish;
    }

    public String getCompleteWeight() {
        return completeWeight;
    }

    public void setCompleteWeight(String completeWeight) {
        this.completeWeight = completeWeight;
    }

    public String getCodeDevelop() {
        return codeDevelop;
    }

    public void setCodeDevelop(String codeDevelop) {
        this.codeDevelop = codeDevelop;
    }

    public String getJointAdjustment() {
        return jointAdjustment;
    }

    public void setJointAdjustment(String jointAdjustment) {
        this.jointAdjustment = jointAdjustment;
    }

    public String getProblemRepair() {
        return problemRepair;
    }

    public void setProblemRepair(String problemRepair) {
        this.problemRepair = problemRepair;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
