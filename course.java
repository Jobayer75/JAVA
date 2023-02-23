
package tutorialoop;


public class course {
    String courseName;
    int courseCode;
    course(String courseName,int courseCode){
        this.courseName=courseName;
        this.courseCode=courseCode;
        
    }
    int totalcreaditHour=3;
   
    public String  getcourseName() {
        return this.courseName;
    }
     public int getcourseCode() {
        return this.courseCode;
    }
     public void setcourseName( String courseName) {
        this.courseName = courseName;
    }
     public void setcoursecode( String coursecode) {
        this.courseCode = courseCode;
    }
     public int totalcreaditHour(){
        return  totalcreaditHour* 4;
     }
     
}
