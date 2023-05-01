package edu.guilford;

import java.util.Arrays;

public class VechileDemo {
        public static void main(String[] args) {
            Car car1 = new Car("Toyota", "Corolla", 2021, 4);
            Car car2 = new Car("Honda", "Accord", 2022, 4);
            Car car3 = new Car("Ford", "Mustang", 2023, 2);
    
            Truck truck1 = new Truck("Chevrolet", "Silverado", 2021, 2000);
            Truck truck2 = new Truck("Ford", "F-150", 2022, 2500);
            Truck truck3 = new Truck("Dodge", "Ram", 2023, 3000);
    
            Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "Softail", 2021, 2);
            Motorcycle motorcycle2 = new Motorcycle("BMW", "S1000RR", 2022, 2);
            Motorcycle motorcycle3 = new Motorcycle("Honda", "Gold Wing", 2023, 3);
    
            // use inherited method
            car1.start_engine();
            truck1.start_engine();
            motorcycle1.start_engine();
    
            // use abstract method
            for (Vehicle vehicle : Arrays.asList(car1, car2, car3, truck1, truck2, truck3, motorcycle1, motorcycle2, motorcycle3)) {
                System.out.println(vehicle.get_description());
                }
                 // use polymorphism
        Vehicle fastest = motorcycle2;
        System.out.println("The fastest vehicle is: " + fastest.get_description());
        fastest = car3;
        System.out.println("The fastest vehicle is: " + fastest.get_description());
    
        // use Comparable interface
        Vehicle[] vehicles = {car1, car2, car3, truck1, truck2, truck3, motorcycle1, motorcycle2, motorcycle3};
        Arrays.sort(vehicles);
        System.out.println("Vehicles sorted by number of wheels:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.get_description());
        }
    }
}
