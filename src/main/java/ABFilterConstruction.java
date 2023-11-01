package org.example;

    import java.util.Scanner;

    public class ABFilterConstruction {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Clear the console
                clearScreen();

                System.out.println("höAB Filter Construction\n");

                System.out.println("Tvåvägs...............(1)");
                System.out.println("Trevägs...............(2)");
                System.out.println("Fyrvägs...............(3)");
                System.out.print("Vad önskas: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        twoWayFilter();
                        break;
                    case 2:
                        threeWayFilter();
                        break;
                    case 3:
                        fourWayFilter();
                        break;
                    default:
                        System.out.println("Invalid choice. Please select 1, 2, or 3.");
                }

                System.out.print("Önskas omstart (J/N): ");
                String restart = scanner.next().toLowerCase();
                if (!restart.equals("j")) {
                    break;
                }
            }
        }

        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        public static void twoWayFilter() {
            Scanner scanner = new Scanner(System.in);

            clearScreen();

            System.out.println("höAB Filter Construction\n");
            System.out.print("Delningsfrekvensen: ");
            double DFLP = scanner.nextDouble();

            double LLP = 11312 / (2 * Math.PI * DFLP);
            double CLP = 88375 / (2 * Math.PI * DFLP);
            double LHP = LLP;
            double CHP = CLP;

            clearScreen();

            System.out.println("höAB Filter Construction\n");
            System.out.println("Tvåvägssystem");
            System.out.println("Bas/Mellanreg/Diskant " + DFLP + "Hz");
            System.out.println("L = " + LLP + " mH");
            System.out.println("C = " + CLP + " uF");

            // Continue with the presentation of filters and user interactions
            // ...

            System.out.print("Önskas omstart (J/N): ");
            String restart = scanner.next().toLowerCase();
            if (!restart.equals("j")) {
                return;
            }
        }

        public static void threeWayFilter() {
            // Implement the three-way filter logic here
        }

        public static void fourWayFilter() {
            // Implement the four-way filter logic here
        }
    }


