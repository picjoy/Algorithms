package Hash;

import java.util.Arrays;

public class Marathon {

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki","eden"};
        String[] completion = {"eden","kiki"};

        // 오름차순으로 정렬하고 비교하기
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;

        for (i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }

        System.out.println(participant[i]);

    }
}
