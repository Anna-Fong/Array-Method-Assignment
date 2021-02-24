public class Main {

    public static void array(int array [], int number) {
        int[] newArray = new int[array.length + 1];

        //loop through array
        //loop old array to new array
        //add on the number to last position
        //return new array

        array[1] = 0;

        System.out.println("Index: \tValue: \n------------------");
        for (int i = 1; i < 11; i++) {

            int rand = (int) ((Math.random() * 100) + 1);
            if (i == 5) {
                break;
            }

            System.out.println(i + "\t\t" + rand);
        }
    }

    public static void main(String[] args) {
        System.out.println(array);

    }

}