package HomeWork2_Calc_Arrays.Calculator;

import sun.plugin.javascript.navig.Array;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by user on 13.12.2016.
 */
class Calculator {
    public static float temp = 0;

    private static float toDec(float res) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Result = " + df.format(res));
        return res;
    }

    private static void standartCalculation(String input) {
        float a = Float.parseFloat(input.split(" ")[0]);
        float b = Float.parseFloat(input.split(" ")[2]);
        String symb = input.split(" ")[1];
        switch (symb) {
            case "+": temp = a + b; break;
            case "-": temp = a - b; break;
            case "*": temp = a * b; break;
            case "/": temp = a / b; break;
            case "exit": System.exit(0); break;
        }
        toDec(temp);
    }

    private static void memoryCalculation(String input) {
        float a = Float.parseFloat(input.split(" ")[1]);
        String symb = input.split(" ")[0];
        switch (symb) {
            case "+": temp += a; break;
            case "-": temp -= a; break;
            case "*": temp *= a; break;
            case "/": temp /= a; break;
            case "exit": System.exit(0);
        }
        toDec(temp);
    }

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Write your input: ");
        String input = inputNum.nextLine();
        while (!input.equals("exit")) {
            if(input.split(" ").length == 3) {standartCalculation(input);}
            else if(input.split(" ").length == 2) {memoryCalculation(input);}
            input = inputNum.nextLine();

        }
    }
}