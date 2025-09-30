import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.print("Enter your Bill($): ");
        int billInt = (int) (s.nextDouble()*10);
        System.out.print("Tip Percent: ");
        int tipPercent = (s.nextInt());
        System.out.print("Number of People: ");
        int ppl = (s.nextInt());
        double tip = (billInt*(tipPercent*0.1)/100);
        double total = ((double) billInt/10+tip);
        double tipPerPerson = tip/ppl;
        double totalPerPerson = total/ppl;
        System.out.println();
        System.out.println("--------------------------------");
        System.out.printf("Total Tip Amount: $%.2f        |%n", tip);
        System.out.println("--------------------------------");
        System.out.printf("Total bill cost: $%.2f        |%n", total);
        System.out.println("--------------------------------");
        System.out.printf("Tip per person: $%.2f          |%n", tipPerPerson);
        System.out.println("--------------------------------");
        System.out.printf("Total bill per person: $%.2f   |%n", totalPerPerson);
        System.out.println("--------------------------------");




    }
}
