import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert3() {
        String expected = "B";
        String actual = converter.convert(89);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert4() {
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert5() {
        String expected = "C";
        String actual = converter.convert(79);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert6() {
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert7() {
        String expected = "D";
        String actual = converter.convert(69);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert8() {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert9() {
        String expected = "F";
        String actual = converter.convert(59);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert10() {
        String expected = "F";
        String actual = converter.convert(0);
        assertEquals(expected, actual);
    }
//    @Test
//    public void testConvert11() {
//        String expected = "Invalid";
//        String actual = converter.convert(101);
//        assertEquals(expected, actual);
//    }

}