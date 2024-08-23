import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("광역시 6개를 차례대로 입력해주세요. 엔터로 도시를 구분해주세요.");

        String[] cities = new String[6];

        for(int i = 0 ; i < cities.length ; i++){
            cities[i] = sc.nextLine();
        }
        // 향상된 for문으로 배열을 차례로 순회하며 출력합니다.
        for(String city : cities) {
            System.out.printf("%s광역시\n", city);
        }
    }
}
