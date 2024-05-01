public class Calculator {

    public static double divide(double d1, double d2) {
        return d1 / d2;
    }

    public static  double sum(double firstnumber, double secondnumber) {
        return firstnumber + secondnumber;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double substraction(double first, double second) {
        return first * second;
    }

    public static void main(String[] args) {

        double a=40 , b=50;

        System.out.println("Sum = "+sum(a,b));
        System.out.println("Substraction = "+substraction(a,b));
        System.out.println("Multiply = "+multiply(a,b));
        System.out.println("Divition = "+divide(a,b));

    }
    
}
