package com.mycompany.softwareengineeringassignment1;

import java.util.ArrayList;

public class Module
{
    private String moduleName;
    private String moduleId;
    private ArrayList<Student> studentList;
    
    public Module(String moduleName, String moduleId, ArrayList<Student> studentList)
    {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.studentList = studentList;
    }
        
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }
    
    public String getModuleName()
    {
        return moduleName;
    }
    
    public void setModuleId(String moduleId)
    {
        this.moduleId = moduleId;
    }
    
    public String getModuleId()
    {
        return moduleId;
    }
    
    public void setStudentList(ArrayList<Student> studentList)
    {
        this.studentList = studentList;
    }
    
    public ArrayList<Student> getStudentList()
    {
        return studentList; 
    }
}