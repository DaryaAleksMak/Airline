import entity.Calculate;
import entity.plane.Plane;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    public View headView() {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("                            " +  "      WELCOME TO GL AIRLINE" +  "                                     ");
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
            menuItem =inputValue("Choose menu item: ");

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
                    System.out.println("Input range[1000,7000] values: ");
                    printListPlanes(calculate.filterRangeOfFuelConsumption(inputValue("min = "), inputValue("max = ")));
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

    private int inputValue(String param) {
        Scanner sc = new Scanner(System.in);
        int value;
        while (true)
            try{
                System.out.print(param);
                value =sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Input incorrect value!"+" Try again");
                sc.next();
            }
        return value;
    }


}
