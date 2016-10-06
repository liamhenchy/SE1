package com.mycompany.softwareengineeringassignment1;

public class Student
{
    private String name;
    private String age;
    private String dob;
    private String id;
    private static String username;
    
    public Student(String name, String age, String dob, String id)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;      
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(String age)
    {
        this.age = age;
    }
    
    public String getAge()
    {
        return age;
    }
    
    public void setDob(String dob)
    {
        this.dob = dob;
    }
    
    public String getDob()
    {
        return dob;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getId()
    {
        return id;
    }     
    
    public static String getUsername(String name, String age)
    {
        username = name.concat(age);
        return username;
    }
}