/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curveactivitydemo;

/**
 *
 * @author mohammadsalehi
 */
public class CurvedActivity extends GradeActivity {
    double rawScore, percentage;

    public CurvedActivity(double percent) {
        this.percentage = percent;
        rawScore = 0.0;
    }
    public void setScore(double s){
        rawScore = s;
        super.setScore(rawScore * percentage);
    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }

    
     
}
