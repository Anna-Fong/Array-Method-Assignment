public class Main {

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr = addValue(arr, 1);
        arr = deleteValue(arr);
        arr = insertValue(arr, 2, 10);
        for (int i = 0; i < arr.length; i++);
    }

//add value
    private static int[] addValue(int arr[], int value) {
        int newarr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
            newarr[newarr.length - 1] = value;
        }
        System.out.println("Array after adding a value:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
        return newarr;
    }

//delete value
    private static int[] deleteValue(int arr[]) {
        int newarr[] = new int[arr.length];
        for(int i = 0 + 1; i < newarr.length - 1; i++) {
            newarr[i] = arr[i];
        }
        System.out.println("Array after deleting a value:");
        for(int i = 0; i + 1 < newarr.length - 1; i++) {
            System.out.println(newarr[i]);
        }
        return newarr;
    }

//insert value
    private static int[] insertValue(int arr[], int indexposition, int value) {
        int newarr[] = new int[arr.length];
        if (indexposition > arr.length) {
            System.out.println("Array after inserting value:\nError - Index position is larger than array");
        } else {
            for (int i = 0; i < newarr.length; i++) {
                if (i < indexposition)
                    newarr[i] = arr[i];
                else if (i == indexposition)
                    newarr[i] = value;
                else
                    newarr[i] = arr[i - 1];
            }
            System.out.println("Array after inserting value:");
            for (int i = 0; i < newarr.length; i++) {
                System.out.println(newarr[i]);
            }
        }
        return newarr;
    }
 }
