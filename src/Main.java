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
        double tipPerPerson = ((int) ((tip/ppl)*100)/100.0);
        double totalPerPerson = ((int) ((total/ppl)*100)/100.0);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Total Tip Amount: $" + tip + "        |");
        System.out.println("--------------------------------");
        System.out.println("Total bill cost: $" + total + "        |");
        System.out.println("--------------------------------");
        System.out.println("Tip per person: $" + tipPerPerson + "          |");
        System.out.println("--------------------------------");
        System.out.println("Total bill per person: $" + totalPerPerson + "   |");
        System.out.println("--------------------------------");




    }
}
