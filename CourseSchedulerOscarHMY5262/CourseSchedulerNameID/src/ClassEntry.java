/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oskhy
 */
public class ClassEntry {
    private String CourseCode;
    private String Semester;
    private int Seats;
    
    public ClassEntry(String CourseCode, String Semester, int Seats){
        this.CourseCode = CourseCode;
        this.Semester = Semester;
        this.Seats = Seats;
        
    }
    
    public String getCourseCode(){
        return CourseCode;
    }
    
    public String getSemester(){
        return Semester;
    }
    
    public int getSeats(){
        return Seats;
    }
}
