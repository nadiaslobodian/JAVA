package homework16;

public class Data {

    public static void sort(int[] array) {

        int storage = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for(int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    storage = array[i];
                    array[i] = array[j];
                    array[j] = storage;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



    public  static  void  bubbleSort(int[] array) {

        boolean isSort = false;
        int storage = 0;
        int count = 0;

        while (!isSort) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    storage = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = storage;
                    count++;
                }
            }
            if (count == 0) {
                isSort = true;
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
























}
