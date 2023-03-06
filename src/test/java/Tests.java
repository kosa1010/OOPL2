import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl2.zad1.QuadraticEquationImpl;
import pl.edu.ur.oopl2.zad1.QuadraticEquationInterface;
import pl.edu.ur.oopl2.zad2.Calc;
import pl.edu.ur.oopl2.zad3.Zad3;
import pl.edu.ur.oopl2.zad4.Zad4;
import pl.edu.ur.oopl2.zad5.Zad5;
import pl.edu.ur.oopl2.zad6.Zad6;
import pl.edu.ur.oopl2.zad7.Zad7;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Tests {

    @Test
    public void testEx1A() {
        QuadraticEquationInterface qe = new QuadraticEquationImpl();
        qe.setA(1);
        qe.setB(-5);
        qe.setC(4);

        double d = qe.countDiscriminant(1, -5, 4);
        double y[] = qe.countRoot(1, -3, qe.countDiscriminant(1, -5, 4));
        double x[] = {1, 4};

        Assert.assertArrayEquals(x, y, 0);

    }

    @Test
    public void testEx1B() {
        QuadraticEquationInterface qe = new QuadraticEquationImpl();
        qe.setA(1);
        qe.setB(-6);
        qe.setC(9);

        double d = qe.countDiscriminant(1, -6, -1);
        double y[] = qe.countRoot(1, -6, d);
        double x[] = {3};

        Assert.assertArrayEquals(x, y, 0);
    }

    @Test@Test(expected = NullPointerException.class)
    public void testEx1C() {
        QuadraticEquationInterface qe = new QuadraticEquationImpl();
        qe.setA(3);
        qe.setB(-2);
        qe.setC(6);

        double d = qe.countDiscriminant(3, -2, 6);
        double y[] = qe.countRoot(3, -2, 0);
        
    /*
        try {
            double y[] = qe.countRoot(3, -2, 0);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            Assert.assertThat(e.getMessage(), CoreMatchers.is("Not supported."));
        }
    */
    }

    @Test
    public void testEx2Add() {
        Calc c = new Calc();

        Assert.assertEquals(4, c.add(2, 2), 0);
    }

    @Test
    public void testEx2Minus() {
        Calc c = new Calc();

        Assert.assertEquals(2, c.minus(4, 2), 0);
    }

    @Test
    public void testEx2Multiply() {
        Calc c = new Calc();

        Assert.assertEquals(16, c.multiply(4, 4), 0);
    }

    @Test
    public void testEx2Divide() {
        Calc c = new Calc();

        Assert.assertEquals(3, c.divide(6, 2), 0);
    }

    @Test
    public void testEx2Pow() {
        Calc c = new Calc();

        Assert.assertEquals(81, c.power(9, 2), 0);
    }

    @Test
    public void testEx2Sqrt() {
        Calc c = new Calc();

        Assert.assertEquals(6, c.sqrt(36), 0);
    }

    @Test
    public void testEx2Sin() {
        Calc c = new Calc();

        Assert.assertEquals(Math.sin(Math.toRadians(0)), c.sin(Math.toRadians(0)), 0);
        Assert.assertEquals(Math.sin(Math.toRadians(30)), c.sin(Math.toRadians(30)), 0);
        Assert.assertEquals(Math.sin(Math.toRadians(90)), c.sin(Math.toRadians(90)), 0);
    }

    @Test
    public void testEx2Cos() {
        Calc c = new Calc();

        Assert.assertEquals(Math.cos(Math.toRadians(0)), c.cos(Math.toRadians(0)), 0);
        Assert.assertEquals(Math.cos(Math.toRadians(60)), c.cos(Math.toRadians(60)), 0);
        Assert.assertEquals(Math.cos(Math.toRadians(90)), c.cos(Math.toRadians(90)), 0);
    }

    @Test
    public void testEx2Tan() {
        Calc c = new Calc();

        Assert.assertEquals(Math.tan(Math.toRadians(0)), c.tan(Math.toRadians(0)), 0);
        Assert.assertEquals(Math.tan(Math.toRadians(45)), c.tan(Math.toRadians(45)), 0);
    }

    @Test
    public void testEx2Ctan() {
        Calc c = new Calc();

        Assert.assertEquals((1 / Math.tan(Math.toRadians(45))), c.ctan(Math.toRadians(45)), 0);
        Assert.assertEquals((1 / Math.tan(Math.toRadians(90))), c.ctan(Math.toRadians(90)), 0);
    }

    @Test
    public void testEx3() {

        String input = "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "0\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Zad3 z = new Zad3(new Scanner(in));

        int[] a = {6, 7, 8, 9, 0, 1, 2, 3, 4};
        int[] b = {4, 3, 2, 1, 0, 9, 8, 7, 6};
        int[] c = {6, 8, 0, 2, 4};
        int[] d = {7, 9, 1, 3};

        Assert.assertEquals(a, z.table());
        Assert.assertEquals(b, z.invertTable());
        Assert.assertEquals(c, z.evenIndexNumbers());
        Assert.assertEquals(d, z.oddIndexNumbers());

    }

    @Test
    public void testEx4() {

        String input = "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "10\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Zad4 z = new Zad4(new Scanner(in));

        int[] a = {6, 7, 8, 9, 10, 1, 2, 3, 4};

        Assert.assertEquals(Arrays.stream(a).sum(), z.sum(), 0);
        Assert.assertEquals(6 * 7 * 8 * 9 * 10 * 1 * 2 * 3 * 4 * 5, z.product(), 0);
        Assert.assertEquals(Arrays.stream(a).average()getAsDouble(), z.average());
        Assert.assertEquals(Arrays.stream(a).min(), z.min());
        Assert.assertEquals(Arrays.stream(a).max(), z.max());

    }

    @Test
    public void testEx5() {
        Zad5 z = new Zad5();

        int[] a = {20, 18, 17, 16, 14, 13, 12, 11, 10, 8, 7, 5, 4, 3, 1, 0};

        Assert.assertEquals(a, z.from20To0WithoutSome());
    }

    @Test(timeout = 10000)
    public void testEx6() {

        String input = "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "10\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n"
                + "-1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        Zad6 z = new Zad6();
        z.start(new Scanner(in));

    }

    @Test(timeout = 10000)
    public void testEx7() {

        String input = "5\n"
                + "6\n"
                + "27\n"
                + "18\n"
                + "45\n"
                + "10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        int[] a = {5, 6, 27, 18, 14, 10};
        Arrays.sort(a);
        Zad7 z = new Zad7();
        Assert.assertArrayEquals(a, z.boubleSort());
        Assert.assertArrayEquals(a, z.start(new Scanner(in)));

    }

}
