/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskhy
 */
public class CourseEntry {
    private String CourseCode;
    private String Description;
    
    public CourseEntry(String CourseCode, String Description){
        this.CourseCode = CourseCode;
        this.Description = Description; 
    };
    
    public String getCourseCode(){
        return this.CourseCode;
    }
    
    public String getCourseDescription(){
        return this.Description;
    }
    
}
