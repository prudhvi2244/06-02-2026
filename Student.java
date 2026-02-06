import java.io.Serializable;

public class Student implements Serializable{

    int sid;
    transient String sname; // null
    String semail;

   public Student(){
        System.out.println("Student Class no-parameter constructor");
    }

   public Student(int sid,String sname,String semail){
        this.sid=sid;
        this.sname=sname;
        this.semail=semail;
    }

    @Override
    public String toString() {
        return "Student ID :"+sid+" Student Name :"+sname+" Student Email :"+semail;
    }


}