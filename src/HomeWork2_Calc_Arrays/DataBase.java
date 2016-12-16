package HomeWork2_Calc_Arrays;
import java.util.Scanner;

public class DataBase {
    public static void main(String[] args) {
        String[] mikeInfo = {"age: 19", "study: DNU"};
        String[] petyaInfo = {"age: 21", "study: NGU"};
        String[] vasyaInfo = {"age: 50", "study: N/A"};
        Scanner readName = new Scanner(System.in);
        String personName = "0";
        while(personName != "exit") {
            System.out.print("Input name, please: ");
             personName = readName.nextLine();
            switch (personName) {
                case "Mike":
                    for (String item : mikeInfo) {
                        System.out.println(item);
                    }
                    break;
                case "Vasya":
                    for (String item : vasyaInfo) {
                        System.out.println(item);
                    }
                    break;
                case "Petya":
                    for (String item : petyaInfo) {
                        System.out.println(item);
                    }
                    break;
                    case "exit":
                        System.out.println("Thanks :)");
                        System.exit(0);
                default:
                    System.out.println("Input another name, please!");
            }
        }
    }
}