package lv.acodemy;


import lv.acodemy.classroom.Car;
import lv.acodemy.classroom.Cat;

public class Main {
    public static void main(String[] args) {

        // How to create Object?

        Car myFirstCar = new Car();

        // How to print Object?
        System.out.println(myFirstCar);

        // Set carBrand
        myFirstCar.setCarBrand("Audi");
        System.out.println(myFirstCar);

        // Set all other fields
        myFirstCar.setModel("A4");
        myFirstCar.setProductionYear(2024);
        myFirstCar.setMileage(6);
        myFirstCar.setColor("Race blue");
        System.out.println(myFirstCar);

        // Task: Create a new object car, set all fields and print object out;
        Car mySecondCar = new Car();
        mySecondCar.setCarBrand("Volkswagen");
        mySecondCar.setModel("Arteon");
        mySecondCar.setProductionYear(2023);
        mySecondCar.setMileage(17548);
        mySecondCar.setColor("Black");
        System.out.println(mySecondCar);

        Car myBmwCar = new Car("BMW", "X5", 2020, 130_000, "black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder()
                .setCarBrand("Skoda")
                .setModel("Octavia")
                .setProductionYear(2022)
                .setMileage(6)
                .setColor("Mamba Green")
                .build();

        mySkoda.start();
        mySkoda.drive(1_000);
        mySkoda.drive(2_500);

        Cat barsik = new Cat("Barsik", "Male", 1, "Ginger");
        System.out.println(barsik);
        barsik.setAge(2);
        barsik.sleep();
        barsik.walk();
    }
}