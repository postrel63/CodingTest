package programmers.P12904;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("abcdcba");
    }
}

class Solution{
    public int solution (String s){
        int answer = 0;
        //스트링빌더는 문자열 객체 생성없이 추가할 때 좋은것
        // 펠린드롬문제는 양쪽에서 꺼내서 확인해야하니까 데크가 효율적
        // 부분 펠린드롬은 데크?
        //  abcdcba

        int cnt = 0;
        StringBuilder sb;
        String str= "";
        outLoop:
        for (int i = 0; i< s.length();i++){
            for (int j = i+1; j< s.length()+1;j++){
                sb = new StringBuilder();
                str = s.substring(i,j);
                sb.append(str);
                if (str.equals(sb.reverse().toString())){
                    if (cnt < str.length()){
                        cnt = str.length();

                        if (cnt > s.length() - i-1){
                            break outLoop;
                        }

                    }
                }
            }
        }



        return answer;
    }
}