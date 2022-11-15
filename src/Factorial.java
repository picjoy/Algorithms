public class Factorial {

    public static void main(String[] args) {


        int result = solution(5);
        System.out.println(result);

        result = solution(10);
        System.out.println(result);

    }

    public static int solution(int num){
        int cnt = 0;

        while (num >= 5){
            cnt += num / 5;
            num /= 5;
        }

        return cnt;
    }
}
