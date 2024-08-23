import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection03 {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        // 콘솔 입력을 받기 위한 Scanner 객체를 선언합니다.
        Scanner scan = new Scanner(System.in);

        System.out.println("도시와 소재지를 차례로 입력합니다. 형식 : {도시} {소재지}");

        while (true) {
            String input = scan.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] separatedInput = input.split(" ");
            cities.putIfAbsent(separatedInput[0], separatedInput[1]);
        }
        for (String city : cities.keySet()) {
            System.out.println(city + "은(는) " + cities.get(city) + "에 있습니다.");
        }
    }
}