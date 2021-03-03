
public class Main {

        //loop through array
        //loop old array to new array
        //add on the number to last position
        //return new array

        //	• Add values to the end of an array.
        //	• Delete values from the end of an array (often referred to as pop).
        //	This method should also return the 'popped' value. Array size should shrink by one.
        //Insert values into an array at chosen index position.
        // (Increases the size of the array by 1 Ex. array 2, 3, 5.  Insert 4 into position 2 gives 2,3,4,5)

    public static int oldArray(int length) {

        int oldArrayLength = length;
        int base = 0;
        int a = length;

        System.out.println("Index: \tValue:");

        for (int i = 0; i < length; i++) {
            int value = (base += 2);
            if (i == length) {
                break;
            }

            System.out.println(i + "\t\t" + value);
        }
        return a;
    }

    public static int newArray(int length) {

        int newArrayLength = length;
        int base = 0;
        int a = length;

        for (int i = 0; i < length; i++) {
            int value = (base += 10);
            if (i == length) {
                break;
            }

            System.out.println(i + "\t\t" + value);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(oldArray(5));
        System.out.println(newArray(2));
    }

}
