import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:  ");
        int number = scanner.nextInt();

        if (number <= 20) {
            System.out.println((number1(number) + number2(number)));
        } else if (number > 20 && number < 100) {
            int dv = number/10;
            int dv1 = number%10;
            System.out.println((number3((dv))+" "+number2(dv1)));
        } else if (number >= 100 && number < 1000) {
            int dv = number/100;
            int dv1x = number%100;
            int dv1;
            int dv2;
            if (dv1x >= 10) {
                dv1 = dv1x/10;
                dv2 = dv1%10;
            } else {
                dv1 = 0;
                dv2 = number%100;
            }
            System.out.println((number2((dv))+" hundred "+number3(dv1))+" "+number2(dv2));
        }
    }

    public static String number2(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String number1(int number) {
        switch (number) {
            case 0: return "zero";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            default: return "";
        }
    }

    public static String number3(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
