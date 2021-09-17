package ui_Class_advance_2;

import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> scores;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.scores=new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.scores.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        double sum=0;
        int count=0;
        if(this.grades.isEmpty()) return -1;
        else {
            for(int i=0;i<grades.size();i++){
                sum+=(Integer)grades.get(i);
                count++;
            }
            return (1.0*sum)/count;
        }
    }
    public  double averageOfPoints(){
        int sum=0;
        int count=0;
        if(this.scores.isEmpty()) return -1;
        else {
            for(int i=0;i<scores.size();i++){
                sum+=(Integer) scores.get(i);
                count++;
            }
            return (1.0*sum)/count;
        }
    }
}