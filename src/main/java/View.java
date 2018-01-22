import entity.Calculate;
import impl.Plane;

import java.util.List;
import java.util.Scanner;

public class View {
    public View headView(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("                            "+"\033[0;1m"+"      WELCOME TO GL AIRLINE" + "\033[0;37m" + "                                     ");
        System.out.println("--------------------------------------------------------------------------------------------");
        return new View();
    }

    public void template(){

        System.out.println("1. Calculate the total capacity: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("2. Calculate the carrying capacity: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("3. Airplanes corresponding to a given");
        System.out.println("   range of fuel consumption parameters: ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("4. Display the list of aircraft of the ");
        System.out.println("   company sorted by flight range : ");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public void commands(){
        Calculate calculate = new Calculate();

        boolean quit = false;

        int menuItem;

        do {
            System.out.print("\033[0;1m" + "Choose menu item: " + "\033[0;37m");
            Scanner in = new Scanner(System.in);
            menuItem = in.nextInt();

            switch (menuItem) {
                case 1:
                    headView();
                    System.out.println("\033[0;1m" + "1. Calculate the total capacity: "+calculate.getSumTotalCapacity() +"\033[0;37m");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("2. Calculate the carrying capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("3. Airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("4. Display the list of aircraft of the ");
                    System.out.println("   company sorted by flight range : ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    headView();
                    System.out.println("1. Calculate the total capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("\033[0;1m" + "2. Calculate the carrying capacity: "+calculate.getSumCarrierCapacity() + "\033[0;37m");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("3. Find airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("4. Display the list of aircraft of the");
                    System.out.println("   company sorted by flight range :");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    headView();
                    System.out.println("1. Calculate the total capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("2. Calculate the carrying capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("\033[0;1m" + "3. Find airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: " );
                    printListPlanes(calculate.filterRangeOfFuelConsumption(2000,4000));
                    System.out.println("\033[0;37m" + "--------------------------------------------------------------------------------------------");
                    System.out.println("4. Display the list of aircraft of the          " + "                                      ");
                    System.out.println("   company sorted by flight range : "+"                                                     ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");                      break;
                case 4:
                    headView();
                    System.out.println("1. Calculate the total capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("2. Calculate the carrying capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("3. Find airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: " );
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("\033[0;1m" +"4. Display the list of aircraft of the          " + "                                      ");
                    System.out.println("   company sorted by flight range : "+"                                                     ");
                    System.out.println();
                    printListPlanes(calculate.sortedByFlightRange());
                    System.out.println("\033[0;37m" + "--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("\u001B[31m" + "INVALID CHOICE!" + "\033[0;1m" + " Try again");
            }
        } while (!quit);

        System.out.println("\n" + "\033[0;1m" + "GOOD LUCK!");
    }

    private void printListPlanes(List<Plane> planes){
        for (Plane plane: planes) {
            System.out.println(plane);

        }


    }




}
