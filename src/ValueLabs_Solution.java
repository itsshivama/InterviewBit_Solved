import java.util.Scanner;

//main logic
public class ValueLabs_Solution {
    public void solution(int N) {

        // write your logic here and print the desired output
        for (int i = 0; i < N; i++) {
            for (int k = -1; k < i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j < N - i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        ValueLabs_Solution s = new ValueLabs_Solution();
        s.solution(in);
    }

}