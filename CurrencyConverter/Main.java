import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How much money (in dollars) do you have?");
        int dollar = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("What is the currency you want to change?");
        String currency  = scanner.nextLine();
        
        if (currency.equals("Vnd")) {
            double vnd = dollar * 26160;
            System.out.println("You will receive" + vnd + "Vnd");
        } else if (currency.equals("Pound")) {
            double pound = dollar * 0.73;
            System.out.println("You will receive" + pound + "Pounds");
        } else if (currency.equals("Peso")) {
            double peso = dollar * 866.57;
            System.out.println("You will receive" + peso + "Peso");
        } else if (currency.equals("Yen")) {
            double yen = dollar * 155.85;
            System.out.println("You will receive" + yen + "Yen");
        } else if (currency.equals("Ringgit")) {
            double ringgit = dollar * 4;
            System.out.println("You will receive" + ringgit + "Ringgit");
        } else if (currency.equals("Rupee")) {
            double rupee = dollar * 91.67;
            System.out.println("You will receive" + rupee + "Rupee");
        } else {
            System.out.println("Currency not supported");
        }
        
        scanner.close();
    }
}