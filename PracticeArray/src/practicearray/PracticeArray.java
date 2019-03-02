
package practicearray;


public class PracticeArray {


    public static void main(String[] args) {

        
        
        int [] A = {3,9, 4, 5, 6, 7, 8};
         int [] B = {3, 4, 5, 6, 7, 8};
        
         boolean equals = true;
         int index = 0;
         
         if(A.length!= B.length){
             equals=false;
         }
         while(equals&& index<A.length){
             if(A[index]!=B[index])
                 equals=false;
                 index++;  
         }
         if(equals)
             System.out.println("The arrasy are equals. ");
         else
             System.out.println("The arrasy are not equals.");
    }
    
}
