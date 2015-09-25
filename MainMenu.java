import java.util.Scanner;

public class MainMenu {

public static int printMainMenu(){
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println();
        System.out.println("1. List the hotels in the city");
        System.out.println("2. Get the # of available rooms in the city with queen-sized beds");
        System.out.println("3. Get the # of available rooms in the city with king-sized beds");
        System.out.println("4. Get the total # of available rooms in the city");
        System.out.println("5. Get the total # of rooms in the city (available or otherwise)");
        System.out.println("0. Exit menu");
        System.out.println();
        System.out.print("Please enter a number for one of the options given above: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println();
        return input;
}

public static int action(int reply){
        switch (reply) {
        case 1:
                HotelList.runHotelList();
                break;
        case 2:

                break;
        case 3:

                break;
        case 4:

                break;
        case 5:

                break;
        case 0:
                System.out.println("Exiting...");
                return 0; // Exit the menu
        default:
                System.out.println("ERROR: Invalid input. Returning to Main Menu");
                System.out.println();
                break;
        }
        return 1;
}

public static void runMenu(){
        int proceed = 1;
        while(proceed == 1) {
                int response = printMainMenu();
                proceed = action(response);
        }
}
}
