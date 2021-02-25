
public class Main {

    public static int oldArray(int number) {

        //loop through array
        //loop old array to new array
        //add on the number to last position
        //return new array

        int a = number;

        System.out.println("Index: \tValue:");
        System.out.println("--------------");

        for (int i = 0; i < number; i++) {
            int rand = (int) ((Math.random() * 20) + 1);
            if (i == number) {
                break;
            }

            System.out.println(i + "\t\t" + rand);
        }
        System.out.println("--------------");
        return a;

    }

    public static void main(String[] args) {
        System.out.println(oldArray(5));

    }

}
