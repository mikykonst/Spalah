package HomeWork2_Calc_Arrays;

import sun.plugin.javascript.navig.Array;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by user on 13.12.2016.
 */
class Calculator {

    public static float toDec(float res) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Result = " + df.format(res));
        return res;
    }

    public static void main(String[] args) {

        float temp = 0;

        Scanner inputNum = new Scanner(System.in);
        while (true) {

            System.out.print("Write your input: ");
            String input = inputNum.nextLine();

            if(input.split(" ").length == 3) {
                Float a = Float.parseFloat(input.split(" ")[0]);
                Float b = Float.parseFloat(input.split(" ")[2]);
                String symb = input.split(" ")[1];

                if (symb.equals("+")) {
                    temp = a + b;
                    toDec(temp);
                } else if (symb.equals("-")) {
                    temp = a - b;
                    toDec(temp);
                } else if (symb.equals("*")) {
                    temp = a * b;
                    toDec(temp);
                } else if (symb.equals("/")) {
                    temp = a / b;
                    toDec(temp);
                } else if(input.split("0")[0].equals("exit")) {
                    System.exit(0);
                }
            } else if(input.split(" ").length == 2) {
                float a = Float.parseFloat(input.split(" ")[1]);
                String symb = input.split(" ")[0];
                if (symb.equals("+")) {
                    temp += a;
                    toDec(temp);
                } else if (symb.equals("-")) {
                    temp -= a;
                    toDec(temp);
                } else if (symb.equals("*")) {
                    temp *= a;
                    toDec(temp);
                } else if (symb.equals("/")) {
                    temp /= a;
                    toDec(temp);
                } else if (input.split("0")[0].equals("exit")) {
                    System.exit(0);
                }
            } else {
                System.exit(0);
            }
        }
    }
}