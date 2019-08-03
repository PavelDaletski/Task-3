import java.io.Serializable;

public class Car extends A implements Serializable, Cloneable {
    public int weight;
    int year;
    public int capacity;


    public Car(String car){
        System.out.println("Inside default constructor");
    }
    public Car(int someCar) {
        weight = 3000;
        year = 1000;
        capacity = 4;
        System.out.println();
    }


    public static void MethodCar(int wight){
        switch (wight){
            case 1000:
                System.out.println("Passenger car");
                break;
            case 2000:
                System.out.println("Jeep car");
                break;
            case 3000:
                System.out.println("Cargo car");
                break;
                default:
                    System.out.println("default");

        }

    }
    public static void Car(int capacity){
        int a=0;
        int b= capacity;
        int random_number = a+(int) (Math.random())*b;
        System.out.println("Случайная машина"+ random_number);
    }
}