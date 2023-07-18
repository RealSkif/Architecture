package seminar_3;

import seminar_1.ModelElements.Color;
/*
 * Класс гоночного автомобиля, наслудующися от абстрактного класса Car
 * GasStation и реализует метод refuel
 * */
public class RaceCar extends Car implements GasStation{
    /*
Тип топлива присваивается в коструекторе, но, возможно, его лучше вынести в поле,
статическое или финализированное и присвоить значение там
 * */
    public RaceCar() {
        super();
        this.setFuelType("petroleum");
    }

    public RaceCar(String brand, String model, Color color, String bodyType,
                   int wheelsNumber, String fuelType, String transmissionType,
                   double engineCapacity) {
        super(brand, model, color, bodyType, wheelsNumber, fuelType, transmissionType,
                engineCapacity);
        this.setFuelType("petroleum");
    }
    /*
    Реализация метода инплементируемого интерфейса
     * */
    @Override
    public void refuel() {
        System.out.println("Race car is refueled with " + this.getFuelType());
    }
}
