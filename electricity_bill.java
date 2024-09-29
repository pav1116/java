import java.util.Scanner;
public class ElectricityBill 
{
    String consumerNo;
    String consumerName;
    double previousReading;
    double currentReading;
    String connectionType;

    public ElectricityBill(String consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) 
    {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double calculateBill(double tariff) 
    {
        return (currentReading - previousReading) * tariff; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Consumer No: ");
        String consumerNo = scanner.nextLine();
        System.out.print("Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Previous Month Reading: ");
        double previousReading = scanner.nextDouble();
        System.out.print("Current Month Reading: ");
        double currentReading = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.nextLine();
        System.out.print("Tariff Rate (per unit ): ");
        double tariff = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);

        double billAmount = bill.calculateBill(tariff);
        System.out.printf("Electricity Bill for %s (%s): %.2f%n", consumerName, connectionType, billAmount);
    }
}

***OUTPUT***

Consumer No: 100
Consumer Name: bill
Previous Month Reading: 200
Current Month Reading: 300
Connection Type (Domestic/Commercial): domestic
Tariff Rate (per unit ): 20
Electricity Bill for bill (domestic): 2000.00