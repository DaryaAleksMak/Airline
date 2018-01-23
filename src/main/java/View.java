import entity.Calculate;
import entity.plane.Plane;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    public View headView() {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("                            " + "\033[0;1m" + "      WELCOME TO GL AIRLINE" + "\033[0;37m" + "                                     ");
        System.out.println("--------------------------------------------------------------------------------------------");
        return new View();
    }

    public void template() {

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

    public void commands() {
        Calculate calculate = new Calculate();
        boolean quit = false;
        Scanner sc;

        int menuItem;

        do {
            while (true){
                 sc = new Scanner(System.in);
                try{
                    System.out.print("\033[0;1m" + "Choose menu item: " + "\033[0;37m");
                    menuItem = sc.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("\u001B[31m" + "Input incorrect value!" + "\033[0;1m" + " Try again");
                    sc.next();
                }
            }

            switch (menuItem) {
                case 1:
                    headView();
                    System.out.println("1. Calculate the total capacity: " + calculate.getSumTotalCapacity());
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
                    System.out.println("2. Calculate the carrying capacity: " + calculate.getSumCarrierCapacity() + " kg");
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
                    System.out.println("3. Find airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: ");
                    printRangeOfFuel();
                    printListPlanes(calculate.filterRangeOfFuelConsumption(2000, 4000));
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("4. Display the list of aircraft of the          " + "                                      ");
                    System.out.println("   company sorted by flight range : " + "                                                     ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    headView();
                    System.out.println("1. Calculate the total capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("2. Calculate the carrying capacity: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("3. Find airplanes corresponding to a given");
                    System.out.println("   range of fuel consumption parameters: ");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("4. Display the list of aircraft of the          " + "                                      ");
                    System.out.println("   company sorted by flight range : " + "                                                     ");
                    System.out.println();
                    printListPlanes(calculate.sortedByFlightRange());
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("5. Exit");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("INVALID CHOICE!" + " Try again");
            }
        } while (!quit);

        System.out.println("GOOD LUCK!");
    }


    private void printListPlanes(List<Plane> planes) {
        for (Plane plane : planes) {
            System.out.println(plane);

        }
    }

    private void printRangeOfFuel() {

        System.out.println("Input range[1000,7000] values: ");
        Scanner sc = new Scanner(System.in);
        while (true)
        try{
            System.out.print("min = ");
            sc.nextInt();
            break;
        }catch (InputMismatchException e){
            System.out.println("Input incorrect value!"+" Try again");
            sc.next();
        }
        while (true)
        try{
            System.out.print("max = ");
            sc.nextInt();
            break;
        }catch (InputMismatchException e){
            System.out.println("Input incorrect value!" +  " Try again");
            sc.next();
        }
    }


}
