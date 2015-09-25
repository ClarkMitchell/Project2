import java.util.Scanner;

public class HotelMenu {

public static int printHotelMenu(){
        System.out.println();
        System.out.println("HOTEL MENU");
        System.out.println();
        System.out.println("1. View Reservations");
        System.out.println("2. Get the # of available rooms in the hotel with queen-sized beds");
        System.out.println("3. Get the # of available rooms in the hotel with king-sized beds");
        System.out.println("4. Get the total # of available rooms in the hotel");
        System.out.println("5. Return to the list of hotels");
        System.out.println("6. Return to Main Menu");
        System.out.println();
        System.out.print("Please enter a number for one of the options given above: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println();
        return input;
}

public static int hotelMenuAction(int reply){
        switch (reply) {
        case 1:

                break;
        case 2:

                break;
        case 3:

                break;
        case 4:

                break;
        case 5:
                System.out.println("Returning to Hotel List...");
                return 0; // Exit the menu
        case 6:
                System.out.println("Returning to Main Menu...");
                return 2; // Exit the menu
        default:
                System.out.println("ERROR: Invalid input. Returning to Main Menu");
                System.out.println();
                break;
        }
        return 1;
}

public static int runHotelMenu(){
        int proceed = 1;
        while(proceed == 1) {
                int response = printHotelMenu();
                proceed = hotelMenuAction(response);
                if(proceed == 0)
                  return 1; //return to hotel list
                if(proceed == 2)
                  return 0;
        }
        return 1;
}
}
