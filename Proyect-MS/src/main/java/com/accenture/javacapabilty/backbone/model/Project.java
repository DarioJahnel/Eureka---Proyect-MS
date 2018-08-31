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
    Date calendarEndDate;
    Date lastUpdate;
    
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

    //getters
    public String getName() { return name; }

    public Long getClientId() { return clientId; }

    public Date getCalendarStartDate() { return calendarStartDate; }

    public Date getCalendarEndDate() { return calendarEndDate; }
    
    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	//setters
    public void setName(String name) { this.name = name; }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public void setCalendarStartDate(Date calendarStartDate) { this.calendarStartDate = calendarStartDate; }

    public void setCalendarEndDate(Date calendarEndDate) { this.calendarEndDate = calendarEndDate; }   
    
    public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
    
	public void setDescription(String description) {
		this.description = description;
	}
}
