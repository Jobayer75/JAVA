
package beginnerjava;

public class Array3 {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int sum =0;
        for(int  x : num){
            
            sum = sum +x;
        }
        
        System.out.println("Sum is "+sum);
    }
    
}
