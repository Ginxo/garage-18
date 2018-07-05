package com.everis.alicante.courses.beca.garage;

import com.everis.alicante.courses.beca.garage.domain.vehicle.Bicycle;
import com.everis.alicante.courses.beca.garage.domain.vehicle.Car;
import com.everis.alicante.courses.beca.garage.domain.vehicle.MotorBike;
import com.everis.alicante.courses.beca.garage.manager.vehicle.BicycleManager;
import com.everis.alicante.courses.beca.garage.manager.vehicle.CarManager;
import com.everis.alicante.courses.beca.garage.manager.vehicle.MotorBikeManager;
import mingorance.enrique.commandlinemenu.Menu;
import mingorance.enrique.commandlinemenu.MenuBuilder;

import java.util.Scanner;


public class GarageRunner {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String option;


        do {
            option = generateMenu().play();
            if (option != null) {
                switch (option) {
                    case "1.1":
                        System.out.println(CarManager.getInstance().findAll());//TODO problem with space entrys. ArrayIndexOutOfBounds.
                        break;
                    case "1.2":
                        CarManager.getInstance().save(carBuilder());
                        break;
                    case "1.3":
                        CarManager.getInstance().delete(selectCar());//TODO problem with deleting last item. It doesn't create a new file.
                        break;
                    case "2.1":
                        System.out.println(MotorBikeManager.getInstance().findAll());
                        break;
                    case "2.2":
                        MotorBikeManager.getInstance().save(motorBikeBuilder());
                        break;
                    case "2.3":
                        MotorBikeManager.getInstance().delete(selectMotorBike());
                        break;
                    case "3.1":
                        System.out.println(BicycleManager.getInstance().findAll());
                        break;
                    case "3.2":
                        BicycleManager.getInstance().save(bicycleBuilder());
                        break;
                    case "3.3":
                        BicycleManager.getInstance().delete(selectBicycle());
                        break;
                }
            }
        } while (option != null);

        System.out.println("GOOD BYE");

    }

    private static Menu generateMenu() {
        mingorance.enrique.commandlinemenu.Menu submenu1 = MenuBuilder.createSubMenu("CARS", 1)
                .addSimpleOption(1, "List")
                .addSimpleOption(2, "New")
                .addSimpleOption(3, "Delete")
                .addExitOption(4, "Back")
                .build();
        Menu submenu2 = MenuBuilder.createSubMenu("MOTORBIKES", 2)
                .addSimpleOption(1, "List")
                .addSimpleOption(2, "New")
                .addSimpleOption(3, "Delete")
                .addExitOption(4, "Back")
                .build();
        Menu submenu3 = MenuBuilder.createSubMenu("BICYCLE", 3)
                .addSimpleOption(1, "List")
                .addSimpleOption(2, "New")
                .addSimpleOption(3, "Delete")
                .addExitOption(4, "Back")
                .build();

        return MenuBuilder.createMainMenu("GARAGE MENU")
                .addSubMenuOption("Cars", submenu1)
                .addSubMenuOption("Motorbikes", submenu2)
                .addSubMenuOption("Bicycle", submenu3)
                .addExitOption(4, "Exit")
                .build();
    }

    private static Car selectCar() {
        System.out.println(CarManager.getInstance().findAll());
        System.out.println("Select an element of the list");
        int element = in.nextInt();
        return CarManager.getInstance().get(element);
    }

    private static MotorBike selectMotorBike() {
        System.out.println(MotorBikeManager.getInstance().findAll());
        System.out.println("Select an element of the list");
        int element = in.nextInt();
        return MotorBikeManager.getInstance().get(element);
    }

    private static Bicycle selectBicycle() {
        System.out.println(BicycleManager.getInstance().findAll());
        System.out.println("Select an element of the list");
        int element = in.nextInt();
        return BicycleManager.getInstance().get(element);
    }

    private static Car carBuilder() {
        System.out.println("Introduce plate");
        String plate = in.nextLine();
        System.out.println("Introduce color");
        String color = in.nextLine();
        System.out.println("Introduce model");
        String model = in.nextLine();

        final Car car = new Car();
        car.setPlate(plate);
        car.setColor(color);
        car.setModel(model);
        return car;
    }

    private static MotorBike motorBikeBuilder() {
        System.out.println("Introduce plate");
        String plate = in.nextLine();
        System.out.println("Introduce color");
        String color = in.nextLine();
        System.out.println("Introduce model");
        String model = in.nextLine();

        final MotorBike motorBike = new MotorBike();
        motorBike.setPlate(plate);
        motorBike.setColor(color);
        motorBike.setModel(model);
        return motorBike;
    }

    private static Bicycle bicycleBuilder() {
        System.out.println("Introduce color");
        String color = in.nextLine();
        System.out.println("Introduce model");
        String model = in.nextLine();

        final Bicycle bicycle = new Bicycle();
        bicycle.setColor(color);
        bicycle.setModel(model);
        return bicycle;
    }

}
