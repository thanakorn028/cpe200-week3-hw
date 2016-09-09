package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {

        this("","","",30);
        course_name = "TBA";
        course_id="000000";
        lecturer ="TBA";
        max_students = 30;
        no_students=0;
    }

    public Course(String n, String cid) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";;
        this.course_id = cid;
    }

    public Course(String n, String cid, String l) {
        this.course_name = n;
        this.course_id = cid;
        this.lecturer = "TBA";
        this.max_students = 30;
        this.no_students=0;

    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        this.course_id = cid;
        this.lecturer = l;
        this.max_students = max;

    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    // implement the other get and set methods here
    public String getLecturer() { return lecturer; }

    public void setLecturer(String lecturer) {
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>9){
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students >=0 && no_students<=max_students){
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        String a;
        if(no_students == 0){
            a = "NO student" + ", [maximum: "+max_students+"]";
        }
        else if(no_students == 1){
            a = "ONE student" + ", [maximum: "+max_students+"]";
        }
        else{
            a = no_students  + " students"+", [maximum: "+max_students+"]";
        }
        String o = this.course_name + " ("  + this.course_id + "), Teacher: "  + this.lecturer + ", has "+a;



        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);



        return m.matches();
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
