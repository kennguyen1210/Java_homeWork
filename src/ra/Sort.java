package ra;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
        StopWatch st = new StopWatch();
        selectionSort(arr, st);
    }
    // Phương thức sắp xếp chọn
    public static void selectionSort(int[] arr, StopWatch st) {
        System.out.println("bat dau sap xep ....");
        st.start();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        st.stop();
        System.out.println("Sap xep xong!\n" + "Thoi gian thuc hien la : " + st.getElapsedTime());
    }
}
