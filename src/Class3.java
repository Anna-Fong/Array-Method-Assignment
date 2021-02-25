public class Class3 {

// on projector in class

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
        int[]numbers = new int[2];
        numbers[0] = 5;
        numbers[1] = 6;

        System.out.println(squareRoot(81.0));

    }
}
// public static void addOn(int[] array, int number) {
//        int[] newArray = new int[array.length + 1];
//
//        //loop through array
//        //loop old array to new array
//        //add on the number to last position
//        //return new array
//