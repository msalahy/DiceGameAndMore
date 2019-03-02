
package finalexamdemo;

import java.util.Scanner;


public class FinalExamDemo {

    public static void main(String[] args) {
        
        int questions, missed; 
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many questions are on the final exam");
        questions = keyboard.nextInt();
        
        System.out.println("How many questions did student miss? ");
        missed = keyboard.nextInt();
        
        FinalExam exam = new FinalExam(questions, missed);
        
        
        System.out.println("Each questions counts "+exam.getPointsEach());
        System.out.println("The exam score is "+exam.getScore());
        System.out.println("The exam exam grade is "+exam.getGrade());
    }
    
}
