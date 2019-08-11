import java.io.Serializable;
import java.util.ArrayList;

public class Car extends A implements Serializable, Cloneable {
    public int weight;
    int year;
    public int capacity;


    public Car(String car){
        System.out.println("Inside default constructor");
    }

    public Car() {
    }

    public Car(int weight, int year, int capacity) {
        this.weight = weight;
        this.year = year;
        this.capacity = capacity;
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
    public static void RandomCar(){
        ArrayList<String> aListRandom = new ArrayList<String>();
        aListRandom.add("Passenger car");
        aListRandom.add("Jeep car");
        aListRandom.add("Cargo car");

        int resultRandom = (int) (Math.random()*aListRandom.size());

        System.out.println(aListRandom.get(resultRandom));
    }
}