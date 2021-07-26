import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{

   String firstName;
   String lastName;
   ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }
    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getNumberOfExamTaken(Student student){
        return student.examScores.size();
    }
    public String getExamScores(){
        StringBuilder str = new StringBuilder();
        str.append("Exam Scores:\n");
        int counter = 1;
        for (int i = 0; i < examScores.size(); i++){
            String strFormat = String.format("%1.1f", examScores.get(i));
            str.append("Exam " + counter + " -> " + strFormat + "\n");
            counter++;
        }
        return str.toString();
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore){
        this.examScores.set(examNumber,newScore);
    }

    public double getAverageExamScore(){
        Double sumAverage = 0d;
        for (double d : examScores) {
            sumAverage += d;
        }
        double average =  sumAverage/examScores.size();
        return average;
    }

   @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Student Name: " + firstName + " " + lastName + "\n");
        String storeAvgScore = String.format("%1.2f", getAverageExamScore());
        str.append("Average Score: " + storeAvgScore + "\n");
        str.append(this.getExamScores());
        String s = str.toString();
        return s;
    }

    @Override
    public int compareTo(Student student2){
        return Double.compare(this.getAverageExamScore(),student2.getAverageExamScore());
    }



}








