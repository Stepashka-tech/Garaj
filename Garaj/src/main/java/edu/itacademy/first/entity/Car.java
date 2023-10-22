package edu.itacademy.first.entity;

public class Car {
    private int carID;
    private CarBrand carBrand;
    private CarModel carModel;
    private int carYear;
    private CarColour carColour;
    private int price;
    private String regNum;

    public Car() {
    }

    public Car(int carID, CarBrand carBrand, CarModel carModel, int carYear, CarColour carColour, int price, String regNum) {
        this.carID = carID;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColour = carColour;
        this.price = price;
        this.regNum = regNum;
    }

    public int getCarID() {
        return carID;
    }

    public CarColour getCarColour() {
        return carColour;
    }

    public void setCarColour(CarColour carColour) {
        this.carColour = carColour;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        return "Автомобиль выбранной марки: [id=" + carID + ", марка = " + carBrand + ", модель = " + carModel + ", год выпуска = "
                + carYear + ", цена = " + price + ", цвет = " + carColour + ", номер = " + regNum + "]";
    }
}
