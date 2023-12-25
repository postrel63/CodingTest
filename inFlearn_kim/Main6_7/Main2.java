package inFlearn_kim.Main6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        ArrayList<Point2> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            list.add(new Point2(x, y));
        }

        Collections.sort(list);

        for (Point2 p : list) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Point2 implements Comparable<Point2> {
    public int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point2 o) {

        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}
