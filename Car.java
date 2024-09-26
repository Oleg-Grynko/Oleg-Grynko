package car;

import component.*;
import exception.StartCarException;
import storage.Storage;

public abstract class Car {
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Wheel wheel4;
    FuelTank fuelTank;
    Electrical electrical;
    Engine engine;
    Light light;
    Storage storage;


    protected String colour;
    protected int maxSpeed;
    protected boolean go ;
    protected double price;

    // конструктор
    public Car( String colour, double price) {
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.fuelTank = fuelTank;
        this.electrical = electrical;
        this.engine = engine;
        this.light = light;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.go = go;
        this.price = price;
    }

    // конструктор
    public Car(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4,
               FuelTank fuelTank, Electrical electrical, Engine engine, Light light,
               int maxSpeed, boolean go) {
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.fuelTank = fuelTank;
        this.electrical = electrical;
        this.engine = engine;
        this.light = light;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.go = go;
        this.price = price;
    }


 // метод начать движение
 // и проверка на наличие неисправностей (доделаю)
    public void go() throws StartCarException {
        if (fuelTank.getCountFuel() >= 0 || wheel1.wheelPunctured() == true
                || wheel2.wheelPunctured() == true || wheel3.wheelPunctured()
                || wheel4.wheelPunctured()
        || electrical.isOperableElectrical() == true
                || engine.isOperableEngine() == true) {
            this.go = true;
            System.out.println("Движение начато");
            return ;
        } throw new StartCarException("Устраните неисправность ");

    }

    public void stop() {
        this.go = false;
        System.out.println("Движение остановлено");
    }
    public void turnLight() {  // включение фар
        light.isWorkLight();
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
