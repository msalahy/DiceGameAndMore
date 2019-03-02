
package finalexamdemo;

public class FinalExam  extends GradeActivity{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        
        double numericScore;
        
        this.numQuestions = questions;
        this.numMissed = missed;
        
        pointsEach = 100.0/questions;
        numericScore = 100.0-(missed*pointsEach);
        
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
    
    
}
