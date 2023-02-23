
package tutorialoop;




public class student {
    String name;
    int matricnumber;
    String hobby;
   
        
    
     student(String name,int matricnumber,String hobby){
        this.name=name;
        this.matricnumber=matricnumber;
        this.hobby=hobby;
    }
     int totalcreaditHour=3*3;
    
    
        void setData(String name,int matricnumber,String hobby){
        name=name;
        matricnumber=matricnumber;
        hobby=hobby;
    }
        void TotalCreaditHour(){
         System.out.println("creadit is :" + totalcreaditHour);
     }
    
        void displayInformation(){
            System.out.println("Student name is : "+name);
            System.out.println("Matric no : "+matricnumber);
            System.out.println("Hobby: "+hobby);
           
                
        
            
        }

    
         
       
}
