//package com.example.tabe.model.leave;
////
////import java.util.Date;
////
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
////import javax.validation.constraints.NotNull;
////
//@Entity
//@Table(name = "Leave")
//public class Leave {
////
////
////    public enum leaveType {
////        SICK, ANNUAL};
////
////    @Column(name="number_of_leave_days")
////    @NotNull
////    private double numberOfLeaveDays;
////    
////    @Column(name="leave_status")
////    private boolean leaveStatus;
////    
////    @NotNull
////    @Column(name="start_leave_date")
////    private Date startLeaveDate;
////    
////    @Column(name="end_leave_date")
////    @NotNull
////    private Date endLeaveDate;
////    
////    @Column(name="totaal_number_of_leave_days")
////    @NotNull
////    private double totalNumberOfLeaveDays;
////
////    public Leave() {
////    }
////
////    public double getNumberOfLeaveDays() {
////        return numberOfLeaveDays;
////    }
////
////    public void setNumbersOfLeaveDays(double numberOfLeaveDays) {
////        this.numberOfLeaveDays = numberOfLeaveDays;
////    }
////
////    public boolean isLeaveStatus() {
////        return leaveStatus;
////    }
////
////    public void setLeaveStatus(boolean leaveStatus) {
////        this.leaveStatus = leaveStatus;
////    }
////
////    public Date getStartLeaveDate() {
////        return startLeaveDate;
////    }
////
////    public void setStartLeaveDate(Date startLeaveDate) {
////        this.startLeaveDate = startLeaveDate;
////    }
////
////    public Date getEndLeaveDate() {
////        return endLeaveDate;
////    }
////
////    public void setEndLeaveDate(Date endLeaveDate) {
////        this.endLeaveDate = endLeaveDate;
////    }
////
////    public Leave(int numberOfLeaveDays, boolean leaveStatus, Date startLeaveDate, Date endLeaveDate) {
////        this.numberOfLeaveDays = numberOfLeaveDays;
////        this.leaveStatus = leaveStatus;
////        this.startLeaveDate = startLeaveDate;
////        this.endLeaveDate = endLeaveDate;
////    }
////
////    public double getTotalNumberOfLeaveDays() {
////        return totalNumberOfLeaveDays;
////    }
////
////    public void setTotalNumberOfLeaveDays(double totalNumberOfLeaveDays) {
////        this.totalNumberOfLeaveDays = totalNumberOfLeaveDays;
//    }
////
////}