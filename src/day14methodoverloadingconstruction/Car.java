package day14methodoverloadingconstruction;

public class Car {

    String make;
    int price;
    int year;
    String model;
    String color;
    static int soldCarCounter = 0;

    public static void main(String[] args) {

        //ClassName ObjectName = new Constructor()
        Car car01 = new Car("Audi", 20000, 2017, "Q5", "Black");
        System.out.println(car01.make);
        System.out.println(car01.price);
        System.out.println(car01.year);
        System.out.println(car01.model);
        System.out.println(car01.color);
        System.out.println(soldCarCounter);

        Car car02 = new Car("Honda", 15000, 2019, "CRV", "Red");
        System.out.println(car02.make);
        System.out.println(car02.price);
        System.out.println(car02.year);
        System.out.println(car02.model);
        System.out.println(car02.color);
        System.out.println(soldCarCounter);

    }
    public Car(String make, int price, int year, String model, String color){
        this.make = make;
        this.price = price;
        this.year = year;
        this.model = model;
        this.color = color;

        soldCarCounter++;

    }
}
