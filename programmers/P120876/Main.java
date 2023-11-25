package programmers.P120876;

public class Main {
    public static void main(String[] args) {
//        int[][] arr = {{0, 5}, {3, 9}, {1, 10}};
//        int cnt = 0;
//        HashSet set = new HashSet();
//        for (int[] i : arr){
//            cnt += i[1]-i[0];
//            for (int j = i[0]; j< i[1];j++){
//                set.add(j);
//            }
//        }
//
//        System.out.println(cnt - set.size());
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        int[] arr = new int[100];
        int cnt=0;
        for (int[] i : lines){
            for (int j = i[0]+100;j<i[1]+100 ; j++){
                arr[j]++;
            }
        }
        for (int i: arr){
            if (i > 1){
                cnt++;
            }
        }
        System.out.println(cnt);



    }
}
