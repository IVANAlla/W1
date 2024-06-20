import java.util.Scanner;

public  class Calcul {

    public Calcul() {}


    public static String calc(String input) {


        //     Scanner in = new Scanner(System.in);


        while (true) {

            Scanner s = new Scanner(System.in);
            //    String exception1 = "throws Exception";
            System.out.println("\nInput: ");

            input = s.nextLine();

            input = input.trim();
            System.out.println("\nOutput: ");




            input = input.replace(" ", "");

            String znacStr = " ";
            char[] znacs = new char[10];
            char znac = '+';
            for (int i = 1; i < input.length(); i++) {
                znacs[i] = input.charAt(i);
                if (znacs[i] == '+') {
                    znac = '+';
                    znacStr = "\\+";
                }
                if (znacs[i] == '-') {
                    znac = '-';
                    znacStr = "-";
                }
                if (znacs[i] == '*') {
                    znac = '*';
                    znacStr = "\\*";
                }
                if (znacs[i] == '/') {
                    znac = '/';
                    znacStr = "/";
                }
            }

            int number1 = 0;
            int number2 = 0;
            int result ;
            int resultArab ;


            String[] numbers = input.split(znacStr);
            // String[] calc_input1;



            try {
                if (numbers.length == 2 ) {
                    number1 = romanNumeral(numbers[0]);
                    number2 = romanNumeral(numbers[1]);

                }
            }catch (Exception  e) {
                System.out.println("throws Exception");
            }

            if (number1 == 0 | number2 == 0){



                try {

                    number1 = Integer.parseInt(numbers[0]);
                    number2 = Integer.parseInt(numbers[1]);

                    if (number1 >10 || number2 > 10 || number1 < 0 || number2 < 0 ||numbers.length != 2) {
                        System.out.println("throws Exception ");

                    }else {
                        resultArab = calculate(number1, number2, znac);
                        System.out.println(+resultArab);


                    }
                }catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
                    System.out.println("throws Exception ");
                }
            }else {
                try {

                    result = calculate(number1, number2, znac);
                    String resultRom = romanSolution(result);
                    System.out.println(resultRom);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
                    System.out.println("throws Exception");//ArrayIndexOutOfBoundsException
                }
            }
        }
    }

    public static int calculate(int x1, int x2, char z) {
        int result = 0;
        switch (z) {
            case '+':
                result = x1 + x2;
                break;
            case '-':
                result = x1 - x2;
                break;
            case '*':
                result = x1 * x2;
                break;
            case '/':
                result = x1 / x2;
                break;
            default:
                break;
        }
        return result;
    }

    public static int romanNumeral(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if
        (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }

    public static String romanSolution(int arabNumeral) {
        String[] romanAll = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
                "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String q;
        q = romanAll[arabNumeral];
        return q;
    }
}
