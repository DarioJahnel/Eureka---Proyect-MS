package com.accenture.javacapabilty.backbone.model;

import java.time.Year;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
    
    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRO_ID")
    Long Id;
    
    @Column(name="PRO_NAME")
    String name;
    
    @Column(name="PRO_DESC")
    String description;
    
    @Column(name="PRO_QRESOURCE")
    Long assignedAmount;
    
    @Column(name="PRO_CLIENT_ID")
    Long clientId; //parent
    
    @Column(name="PRO_CALENDAR_SDATE")
    Date calendarStartDate;
    
    @Column(name="PRO_CALENDAR_EDATE")
    Date calendarEndDate;
    
    @Column(name="PRO_CALENDAR_UDATE")
    Date lastUpdate;
    
    @Column(name="PRO_CALENDAR_STATE")
    Boolean active;
    
    //methods
    //constructors
    public Project() {
        this.name = "unnamed";
        this.description = "no description";
        this.assignedAmount = 0l;
        this.clientId = 0l;
        this.calendarStartDate = new Date();
        this.calendarEndDate = Date.from(calendarStartDate.toInstant().plus(1, ));
        
        
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
    
    //getters
    public Long getId() { return Id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Long getAssignedAmount() { return assignedAmount; }

    public Long getClientId() { return clientId; }

    public Date getCalendarStartDate() { return calendarStartDate; }
    
    public Date getCalendarEndDate() { return calendarEndDate; }
    
    public Date getLastUpdate() { return lastUpdate; }
 
    //setters
    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }

    public void setAssignedAmount(Long assignedAmount) { this.assignedAmount = assignedAmount; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public void setCalendarStartDate(Date calendarStartDate) { this.calendarStartDate = calendarStartDate; }

    public void setCalendarEndDate(Date CalendarEndDate) { this.calendarEndDate = CalendarEndDate; }
    
    public void setLastUpdate(Date lastUpdate) { this.lastUpdate = lastUpdate; }
	
    public void setActive(Boolean active) { this.active = active; }
    
    //more methods
    public void autoUpdate() { this.lastUpdate = new Date(); }
}
