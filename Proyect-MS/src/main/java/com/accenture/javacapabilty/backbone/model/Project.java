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
    Long assignedAmount;
    Long clientId; //parent
    Date calendarStartDate;
    Date calendarEndDate;
    Date lastUpdate;
    Boolean active;
    
    //methods
    //constructors
    public Project() {

    }
    
    public Project(String name) {
        
        this.name = name;
    }

    public Project(String name, Long clientId, Date calendarStartDate, Date calendarEndDate) {
        
        this.name = name;
        this.clientId = clientId;
        this.calendarStartDate = calendarStartDate;
        this.calendarEndDate = calendarEndDate;
    }
    
    //getter
    public Long getId() { return Id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Long getAssignedAmount() { return assignedAmount; }

    public Long getClientId() { return clientId; }

    public Date getCalendarStartDate() { return calendarStartDate; }
    
    public Date getCalendarEndDate() { return calendarEndDate; }

    //setters
    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }

    public void setAssignedAmount(Long assignedAmount) { this.assignedAmount = assignedAmount; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public void setCalendarStartDate(Date calendarStartDate) { this.calendarStartDate = calendarStartDate; }

    public void setCalendarEndDate(Date CalendarEndDate) { this.calendarEndDate = CalendarEndDate; }
    
    public void setLastUpdate(Date lastUpdate) { this.lastUpdate = lastUpdate; }
	
    public void setActive(Boolean active) { this.active = active; }
}
