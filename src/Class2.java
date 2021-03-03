public class Class2 {
    /*

    square root of any positive number
     */

    public static double squareRoot(double number) {
        double guess = 0;
        double increment = .001;
        int count = 1;
        double error = .0001;
        while(Math.abs(guess * guess - number) > error && guess < number) {
            guess += increment;
            count ++;
        }
        System.out.println("Count: " + count);
        return guess;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(25));
    }
}
