
package finalexamdemo;

import javax.swing.JOptionPane;

public class GradeDemo
{
   public static void main(String[] args)
   {
      String input;        // To hold input
      double testScore;    // A test score
      
      // Create a GradedActivity object.
      GradeActivity grade = new GradeActivity();

      // Get a test score.
      input = JOptionPane.showInputDialog("Enter " +
                           "a numeric test score.");
      testScore = Double.parseDouble(input);

      // Store the score in the grade object.
      grade.setScore(testScore);
      
      // Display the letter grade for the score.
      JOptionPane.showMessageDialog(null,
                    "The grade for that test is " +
                    grade.getGrade());

      System.exit(0);
   }
}
