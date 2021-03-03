public class Class1 {
    /*

    parameter has to be a positive integer perfect square
    if the method does not find a square root return -1
     */

    public static int squareRoot(int number) {
        int guess = 0;
        int increment = 1;
        int count = 1;
        while(guess * guess < number) {
            guess += increment;
            count ++;
        }
        System.out.println("Count: " + count);
        if(guess * guess == number) {
            return guess;
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(squareRoot(2));

    }
}
