import java.util.Scanner;

public class Solar {

    
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter morning energy generated: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy generated: ");
        double eveningEnergy = sc.nextDouble();

        
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

       
        System.out.println("Total Energy Generated = " + totalEnergy + " kWh");

        sc.close();
    }
}