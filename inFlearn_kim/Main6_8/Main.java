package inFlearn_kim.Main6_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(arr,m));
    }
}

class BinarySearch {
    public int binarySearch(int[] arr, int targetNum) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
        int mid = left + (right - left) / 2;

            if (arr[mid] == targetNum) {
                return mid + 1;
            }

            if (arr[mid] > targetNum) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }


}
