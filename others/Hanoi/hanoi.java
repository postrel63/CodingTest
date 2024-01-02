import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class hanoi {
//    static List<int[]> solveHanoi(int N, int from, int to, int support, int depth) {
//        if (N == 1) {
//            System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d]\n", 1, from, to);
//            return new ArrayList<>(List.of(new int[]{from, to}));
//        }
//        System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d] start!\n", N-1, from, support);
//        List<int[]> result = solveHanoi(N-1, from, support, to, depth + 1);
//        System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d] done!\n", N-1, from, support);
//        System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d]\n", 1, from, to);
//        result.add(new int[]{from, to});
//        System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d] start!\n", N-1, support, to);
//        result.addAll(solveHanoi(N-1, support, to, from, depth + 1));
//        System.out.printf("| ".repeat(depth) + "Moving %d disks [%d, %d] done!\n", N-1, support, to);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        List<int[]> result = solveHanoi(3, 1, 3, 2, 0);
//        for (int[] step: result) {
//            System.out.println(Arrays.toString(step));
//        }
//    }
}