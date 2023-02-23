// Joyaddar Md Jobayer 
// matric  no : 1731833
package tutorialoop;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        student details= new student("Jobayer",1731833,"shopping");
        details.name="Jobayer";
        details.matricnumber= 1731833;
        details.hobby="shopping";
        
        details.displayInformation();
        details.TotalCreaditHour();
        
        ArrayList<String>course= new ArrayList<String>();
             course.add("Java");
             course.add("Ico");
             course.add("Cn");
             course.add("Ungs");
             course.add("Sad");
             
             System.out.println("The courses is:" +course+ "" );
         
      
        
    
}
}
