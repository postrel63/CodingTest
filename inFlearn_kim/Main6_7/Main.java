package inFlearn_kim.Main6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable {

    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point o) {
        if (this.x == o.x) return y - o.y;
        else{
            return this.x - o.x;
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for (Point o : arr){
            System.out.println(o.x+" "+o.y);
        }

    }
}
