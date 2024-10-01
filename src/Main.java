import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static String calc(String input) throws Exception{
        String[] arr = input.split(" ");
        int answer = 0;

        if (arr.length != 3){
                throw new Exception("Неверный формат входых данных. Используйте формат 1 + 1");
        }

        if ((arr[0].length() != 1 && !Objects.equals(arr[0], "10") || Objects.equals(arr[0], "0")) || (arr[2].length() != 1 && !Objects.equals(arr[2], "10") || Objects.equals(arr[2], "0"))){
            throw new Exception("Введено недопустимое значение. Используйте только числа 1-10");
        }

        if (Objects.equals(arr[1], "+")){
            answer = parseInt(arr[0]) + parseInt(arr[2]);
        }
        else if (Objects.equals(arr[1], "-")){
            answer = parseInt(arr[0]) - parseInt(arr[2]);
        }
        else if (Objects.equals(arr[1], "*")){
            answer = parseInt(arr[0]) * parseInt(arr[2]);
        }
        else if (Objects.equals(arr[1], "/")){
            answer = parseInt(arr[0]) / parseInt(arr[2]);
        }
        else{
            throw new Exception("Недопустимая операция. Используйте операции из списка: +, -, *, /.");
        }

        return Integer.toString(answer);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            System.out.println(calc(input));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}