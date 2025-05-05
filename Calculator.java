public class Calculator {
    public static double average(double num1, double num2, double num3) {

        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {

        double num1 = 5.0, num2 = 10.0, num3 = 15.0;
        double avg = average(num1, num2, num3);
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg);
    }
}