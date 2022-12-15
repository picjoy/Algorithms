package CodingTest;

public class Snail {
    public void solution(int size) {

        int [][] arr = new int[size][size];

        // 배열에 들어갈 첫번째 숫자
        int first = 1;

        // 오른쪽 방향 채우기
        int right = 0;

        // 아래 방향채우기
        int bottom = -1;

        // 위 방향 채우기
        int top = 1;

        int i, j;


        for(i = size; i >= 0; i--) {

            for (j = 0; j < size; j++){
                bottom = bottom + top;
                arr[right][bottom] = first;
                first++;

            }
            size--;

            for (j = 0; j < size; j++){
                right = right + top;
                arr[right][bottom] = first;
                first++;
            }

            top = top*(-1);
        }

        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr[i].length; j++){
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }




        // Systee.out.println("결과값 출력");
    }


    public static void main(String[] args) throws Exception {
        // 배열의 크기 (입력 값)
        int size = 3;
        System.out.println("배열 크기 : " + size);

        Snail pg = new Snail();
        pg.solution(size);

    }
}
