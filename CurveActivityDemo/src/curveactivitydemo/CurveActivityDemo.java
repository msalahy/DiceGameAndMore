/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curveactivitydemo;

import java.util.Scanner;

/**
 *
 * @author mohammadsalehi
 */
public class CurveActivityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double score, curvePercent;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sutdent's raw's numeric score :");
        score = keyboard.nextDouble();
        
        System.out.println("Enter the sutdent's percentage  :");
        curvePercent = keyboard.nextDouble();
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);
        
        curvedExam.setScore(score);
        
        System.out.println("The raw score is "+curvedExam.getRawScore()+" points.");
        System.out.println("The curved score is "+curvedExam.getScore());
        System.out.println("The exam grade is "+curvedExam.getGrade());
        
    }
    
}
