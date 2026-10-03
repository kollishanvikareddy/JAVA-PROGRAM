import java.util.Scanner;

public class SolarSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panelID;
        double energyGenerated;
        int numberOfPanels;
        char systemStatus;

        System.out.print("Enter Panel ID: ");
        panelID = sc.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status (A/I): ");
        systemStatus = sc.next().charAt(0);

        System.out.println("\n--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelID);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        sc.close();
    }
}