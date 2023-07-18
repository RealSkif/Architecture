package seminar_3;

import seminar_1.ModelElements.Color;
/*
* Абстрактный класс Car, описывающий основные свойства и поведения
* */
public abstract class Car {
    /*
     * Поля класса
     * */
    private String brand;
    private String model;
    private Color color;
    private String bodyType;
    private int wheelsNumber;
    private String fuelType;
    private String transmissionType;
    private double engineCapacity;
    /*
     * Методы, описывающие поведение объектов-наследников Car
     * */

    public void move() {
        System.out.println("A car goes bzzzzz!");
    }

        public void doCheck() {
        System.out.println("A car was repaired");
    }

    /*
     * Пеердаем в параметры метода текущую передачу и булево значение в какую сторону
     * нужно повысить передачу. Если истина, то повышаем, возвращаем новое значение текущей пердачи
     * и наоборот.
     * */
    public int changeGear(int currentGear, boolean up) {
        return up ? currentGear++ : currentGear--;
    }
    /*
     * Передаем в метод будево значение-индикатор. Если фары включены (true),
     * то выключаем. И наоборот
     * */
    public void turnLights(boolean on) {
        if (on) System.out.println("Lights off");
        else System.out.println("Lights on");
    }
    /*
     * Передаем в метод будево значение-индикатор. Если дворники включены (true),
     * то выключаем. И наоборот
     * */
    public void turnSweepers(boolean on) {
        if (on) System.out.println("Sweepers off");
        else System.out.println("Sweepers on");
    }
    /*
     * Конструкторы. По умолчанию и принимающий все поля
     * */
    public Car() {
    }

    public Car(String brand, String model, Color color, String bodyType,
               int wheelsNumber, String fuelType, String transmissionType,
               double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelsNumber = wheelsNumber;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineCapacity = engineCapacity;
    }
    /*
     * Геттеры и сеттеры для всех полей класса
     * */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
