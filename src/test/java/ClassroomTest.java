
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;


public class ClassroomTest {

    Classroom c = new Classroom();
    final Logger LOGGER = Logger.getLogger(ClassroomTest.class.getName());
    @Test
    public void testGetStudents() {
        Double[] examScore = {80.0,95.0,100.0};
        Student mySelf = new Student("Nisha","Patel",examScore);
        Double[] otherExamScore = {95.0,94.0,98.0};
        Student other = new Student("Aarav","Patel",otherExamScore);
        Student[] expected = new Student[30];

        Student[] actual = c.getStudents();
       Assert.assertEquals(expected,actual);

    }

    @Test
    public void testGetAverageExamScore() {
        Double[] examScore = {80.0,95.0,100.0};
        Student mySelf = new Student("Nisha","Patel",examScore);
        Double[] otherExamScore = {95.0,94.0,98.0};
        Student other = new Student("Aarav","Patel",examScore);
        Double meAve = mySelf.getAverageExamScore();
        Double expected = 275.0;

        Double actual = c.getAverageExamScore();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAddStudent() {
        Double[] myExamScore = {80.0,95.0,100.0};
        Student nisha = new Student("Nisha","Patel",myExamScore);
        Double[] aarnaExamScore = {95.0,94.0,98.0};
        Student aarna = new Student("Aarna","Patel",myExamScore);
        Student[] preEnroll = {nisha};
        Student[] expected = {nisha,aarna};
        c.addStudent(aarna);

        Student[] actual = c.addStudent(aarna);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveStudent() {
        int maxNumOfStudents = 2;
        Double[] examScores = {100.0,15.0,250.0,0.0};
        Student student = new Student("Aarav","Patel",examScores);
        Double[] examScores1 = {100.0,150.0,20.0,0.0};
        Student student1 = new Student("Ankur","Patel",examScores);

        c.addStudent(student);
        c.addStudent(student1);
        Student[] preEnrollment = c.getStudents();
        c.removeStudent(student.firstName,student.lastName);
        Student[] postEnrollment = c.getStudents();

        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("============================");
        System.out.println(preEnrollmentAsString);
        System.out.println("============================");
        System.out.println(postEnrollmentAsString);

    }

    @Test
    public void testGetStudentsByScore() {
        Double[] nishaExamScore = {95.0,95.0,75.0};
        Student nisha = new Student("Nisha","Patel",nishaExamScore);
        Double[] aarnaExamScore = {50.0,80.0,95.0};
        Student aarna = new Student("Aarna","Patel",aarnaExamScore);
        Double[] aaravExamScore = {60.0,85.0,90.0};
        Student aarav = new Student("Aarav","Patel",aaravExamScore);
        Student[] school = {nisha,aarna,aarav};

        Student[] expected = {aarav,aarna};
        Student[] actual = c.getStudentsByScore();

        LOGGER.info("\n" + Arrays.toString(c.getStudentsByScore()));


    }

    @Test
    public void testGetGradeBook() {
        Double[] nishaExamScore = {95.0,95.0,75.0};
        Student nisha = new Student("Nisha","Patel",nishaExamScore);
        Double[] aarnaExamScore = {50.0,80.0,95.0};
        Student aarna = new Student("Aarna","Patel",aarnaExamScore);
        Double[] aaravExamScore = {60.0,85.0,90.0};
        Student aarav = new Student("Aarav","Patel",aaravExamScore);
        Student[] school = {nisha,aarna,aarav};

        Student[] expected = {aarav,aarna};
        Student[] actual = c.getStudentsByScore();

        LOGGER.info("\n" + c.getGradeBook());

    }
}