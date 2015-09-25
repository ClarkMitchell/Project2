import java.util.Scanner;

public class HotelList {

public static int printHotelList(){
        System.out.println();
        System.out.println("HOTEL List");
        System.out.println();
        System.out.println("1. Holiday Inn");
        System.out.println("2. Days Inn");
        System.out.println("3. Delete a Hotel");
        System.out.println("4. Add a Hotel");
        System.out.println("5. Return to Main Menu");
        System.out.println();
        System.out.print("Please enter a number for one of the options given above: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println();
        return input;
}

public static int hotelListAction(int reply){
        switch (reply) {
        case 1:
                return(HotelMenu.runHotelMenu());
        case 2:
                return(HotelMenu.runHotelMenu());
        case 3:

                break;
        case 4:

                break;
        case 5:
                System.out.println("Returning to Main Menu...");
                return 0; // Exit the menu
        default:
                System.out.println("ERROR: Invalid input. Returning to Main Menu");
                System.out.println();
                break;
        }
        return 1;
}

public static void runHotelList(){
        int proceed = 1;
        while(proceed == 1) {
                int response = printHotelList();
                proceed = hotelListAction(response);
        }
}
}
