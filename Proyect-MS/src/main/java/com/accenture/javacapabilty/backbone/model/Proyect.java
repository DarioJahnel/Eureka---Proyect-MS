package com.accenture.javacapabilty.backbone.model;

import java.util.Date;

public class Proyect {
    
    //attributes
    String name;
    Long clientId; //parent
    Date calendarStartDate;
    Date CalendarEndDate;
    
    //methods
    //constructors
    public Proyect() {

    }
    
    public Proyect(String name) {
        
        this.name = name;
    }

    public Proyect(String name, Long clientId, Date calendarStartDate, Date CalendarEndDate) {
        
        this.name = name;
        this.clientId = clientId;
        this.calendarStartDate = calendarStartDate;
        this.CalendarEndDate = CalendarEndDate;
    }

    //getters
    public String getName() { return name; }

    public Long getClientId() { return clientId; }

    public Date getCalendarStartDate() { return calendarStartDate; }

    public Date getCalendarEndDate() { return CalendarEndDate; }

    //setters
    public void setName(String name) { this.name = name; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public void setCalendarStartDate(Date calendarStartDate) { this.calendarStartDate = calendarStartDate; }

    public void setCalendarEndDate(Date CalendarEndDate) { this.CalendarEndDate = CalendarEndDate; }   
}
