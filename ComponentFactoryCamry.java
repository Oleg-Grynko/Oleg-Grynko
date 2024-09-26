package сomponentFactory;

import car.Camry;
import car.Car;
import component.*;

import java.util.Arrays;

public class ComponentFactoryCamry {
    String country;
    public static final int WHEEL = 17;
    public static final Transmission TRANSMISSION = Transmission.AUTOMATIC;

//    public void setWeels() {
//        Wheel[] wheel = new Wheel[4];
//        for (int i = 0; i < wheel.length; i++) {
//            wheel[i] = new Wheel(17);
//        }
//        System.out.println("создание колес " + Arrays.toString(wheel));
//    }
    public static Car factoryComponentCamry() {
        Electrical electrical = new Electrical();
        electrical.isOperableElectrical();
        Engine engine = new Engine();
        engine.isOperableEngine();
        FuelTank fuelTank = new FuelTank();
        Light light = new Light();
        Wheel wheel1 = new Wheel(WHEEL);
        Wheel wheel2 = new Wheel(WHEEL);
        Wheel wheel3 = new Wheel(WHEEL);
        Wheel wheel4 = new Wheel(WHEEL);
        return new Camry(wheel1, wheel2, wheel3, wheel4, fuelTank, electrical,
                engine, light, 200, false, Transmission.AUTOMATIC,
                false, false);

    }

    @Override
    public String toString() {
        return "ComponentFactoryCamry{" +
                "country='" + country + '\'' +
                '}';
    }
}
