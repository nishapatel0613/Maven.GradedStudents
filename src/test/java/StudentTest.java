import junit.framework.TestCase;
import org.jcp.xml.dsig.internal.dom.DOMX509Data;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


   @Test
    public void testGetExamScores() {
        Student st = new Student();
        Double[] expected = {50.0,70.0,80.0};
        String actual = st.getExamScores();

        Assert.assertEquals(expected,actual);


    }


    @Test
    public void testGetAverageExamScore() {
        Student st = new Student();
        double expected = 50.0;
        double actual = st.getAverageExamScore();

       Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testTestToString() {
        Student st = new Student();
        String expected = String.valueOf(90);
        String actual = st.toString();

        Assert.assertEquals(expected,actual);
    }


}