package com.accenture.javacapabilty.backbone.model;

import java.util.Date;

public class Proyect {
    
    //attributes
    String name;
    Long clientId; //parent
    String calendarType;
    Date calendarStartDate;
    Date CalendarEndDate;
    Double percentageAllocated;
    Boolean roolOffConfirmed;
    
    //methods
    //constructors
    public Proyect() {

    }
    
    public Proyect(String name) {
        
        this.name = name;
    }

    public Proyect(String name, Long clientId, String calendarType, Date calendarStartDate, Date CalendarEndDate, Double percentageAllocated, Boolean roolOffConfirmed) {
        
        this.name = name;
        this.clientId = clientId;
        this.calendarType = calendarType;
        this.calendarStartDate = calendarStartDate;
        this.CalendarEndDate = CalendarEndDate;
        this.percentageAllocated = percentageAllocated;
        this.roolOffConfirmed = roolOffConfirmed;
    }

    //getters
    public String getName() { return name; }

    public Long getClientId() { return clientId; }

    public String getCalendarType() { return calendarType; }

    public Date getCalendarStartDate() { return calendarStartDate; }

    public Date getCalendarEndDate() { return CalendarEndDate; }

    public Double getPercentageAllocated() { return percentageAllocated; }

    public Boolean getRoolOffConfirmed() { return roolOffConfirmed; }

    //setters
    public void setName(String name) { this.name = name; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public void setCalendarType(String calendarType) { this.calendarType = calendarType; }

    public void setCalendarStartDate(Date calendarStartDate) { this.calendarStartDate = calendarStartDate; }

    public void setCalendarEndDate(Date CalendarEndDate) { this.CalendarEndDate = CalendarEndDate; }

    public void setPercentageAllocated(Double percentageAllocated) { this.percentageAllocated = percentageAllocated; }

    public void setRoolOffConfirmed(Boolean roolOffConfirmed) { this.roolOffConfirmed = roolOffConfirmed; }   
}
