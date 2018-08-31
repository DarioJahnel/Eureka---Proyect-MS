package com.accenture.javacapabilty.backbone.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String name;
    String description;
    Long clientId; //parent
    Date calendarStartDate;
    Date CalendarEndDate;
    
    //methods
    //constructors
    public Project() {

    }
    
    public Project(String name) {
        
        this.name = name;
    }

    public Project(String name, Long clientId, Date calendarStartDate, Date CalendarEndDate) {
        
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
