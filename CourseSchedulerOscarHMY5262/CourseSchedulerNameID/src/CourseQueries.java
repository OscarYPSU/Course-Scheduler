/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author oskhy
 */
public class CourseQueries {
    private static Connection connection;
    
    private static PreparedStatement addCourse;
    private static PreparedStatement getCourseList;
    private static PreparedStatement getCourseDescription;
    private static ResultSet resultSet;

    public static void addCourse(CourseEntry course)
    {
        connection = DBConnection.getConnection();
        try
        {
            addCourse = connection.prepareStatement("insert into JAVA.course (courseCode, description) values (?, ?)");
            // Delete addCourse.setString(1, course.getSemester());
            addCourse.setString(1, course.getCourseCode());
            addCourse.setString(2, course.getCourseDescription());
            // Delete addCourse.setInt(4, course.getSeats());

            addCourse.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }

    public static ArrayList<String> getAllCourseCodes(String semester)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> courseCodes = new ArrayList<String>();
        try
        {
            getCourseList = connection.prepareStatement("select coursecode from JAVA.course");
            resultSet = getCourseList.executeQuery();
            
            while(resultSet.next())
            {
                courseCodes.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return courseCodes;
    }
    
    public static String getCourseDescription(String semester, String CourseCode){
        connection = DBConnection.getConnection();
        String description = null;
        try
        {
            getCourseDescription = connection.prepareStatement("select description from JAVA.course where coursecode = ?");
            getCourseDescription.setString(1, CourseCode); 
            
            resultSet = getCourseList.executeQuery();
            
            if(resultSet.next()){
                description = resultSet.getString(1);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return description;
    }

}