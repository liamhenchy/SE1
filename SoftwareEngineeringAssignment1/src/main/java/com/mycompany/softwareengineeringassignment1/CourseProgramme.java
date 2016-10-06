package com.mycompany.softwareengineeringassignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme
{
    private String courseName;
    private ArrayList<Module> moduleList;
    private DateTime startDate = new DateTime();
    private DateTime endDate = new DateTime();
    
    public CourseProgramme(String courseName, ArrayList<Module> moduleList, DateTime startDate, DateTime endDate)
    {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }
        
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
        
    public String getCourseName()
    {
        return courseName;
    }
    
    public void setModuleList(ArrayList<Module> moduleList)
    {
        this.moduleList = moduleList;
    }
    
    public ArrayList<Module> getModuleList()
    {
        return moduleList;
    }
    
    public void setStartDate(DateTime startDate)
    {
        this.startDate = startDate;
    }
    
    public DateTime getStartDate()
    {
        return startDate;
    }
    
    public void setEndDate(DateTime endDate)
    {
        this.endDate = endDate;
    }
    
    public DateTime getEndDate()
    {
        return endDate;
    }
}