

package cpe200;

import java.util.regex.Matcher;

public class Student {
    private String student_name;
    private String student_id;
    private int year_of_birth;
    private boolean status;
    private static final String student_id_regex="^5([6-9]?)061([0-2]?)([0-9]{3})$";
    public Student() {
        this("John Doe","560610000",1990,false);

        // implement here
    }

    // implement all missing constructors here
       public  Student(String n,String id,int y,boolean b ){

               this.student_name =!n.equalsIgnoreCase("")?n:"John Doe";
               this.student_id =isValidStudent_id(id)?id: "560610000";
               this.year_of_birth = (y>1989)?y:1990;
               this.status = b;

}
          public Student(String n,String id,int y){
           this.student_name = !n.equalsIgnoreCase("")?n:"John Doe";
           this.student_id = isValidStudent_id(id)?id:"560610000";
           this.year_of_birth = (y>1989)?y:1990;

}
          public Student(String n, String id){
                this.student_name = !n.equalsIgnoreCase("")?n:"John Doe";
                this.student_id = isValidStudent_id(id)?id:"560610000";
            }
    public String getStudent_id() {
        return this.student_id;
    }

    public int getYearOfBirth() {
        return this.year_of_birth;
    }

    public boolean isActive() {
        return this.status;
    }

    public void setName(String name) {
        // this.name = name;
                this.student_name = !name.equalsIgnoreCase("")?name:this.student_name;
    }

    public void setStudent_id(String student_id) {

        this.student_id =isValidStudent_id(student_id)?student_id:this.student_id;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.year_of_birth = isValidYOB(yearOfBirth)?yearOfBirth:this.year_of_birth;
    }

    private boolean isValidStudent_id(String id) {
        String patt = "5[6-9]{1}061[0-2]{1}[0-9]{3}";
        return id.matches(patt) ? true : false;
    }




    // implement all get and set methods here
    @Override
    public String toString() {
        String o = this.student_name + " ("
              +this.student_id+ ") was born in "
              +this.year_of_birth + " is an ";
              if (isActive()) o += "ACTIVE student.";
              else o += "INACTIVE student.";


        return o;
    }

    private boolean isValidYOB(int yob) {
              return yob>1989;
    }

    public String getName() {
                return this.student_name;
    }


    // declare your attributes here

}
