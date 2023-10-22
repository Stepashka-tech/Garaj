package edu.itacademy.first.main;

import edu.itacademy.first.entity.Car;
import edu.itacademy.first.entity.CarBrand;
import edu.itacademy.first.entity.CarModel;
import edu.itacademy.first.entity.CarColour;

public class ProjectMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(1, CarBrand.VW, CarModel.VOLKSWAGEN_GOLF, 2015, CarColour.BLACK, 50000, "AB1234");
        cars[1] = new Car(2, CarBrand.LADA, CarModel.LADA_VESTA, 2019, CarColour.GREY, 60000, "CD5678");
        cars[2] = new Car(3, CarBrand.VW, CarModel.VOLKSWAGEN_PASSAT, 2013, CarColour.WHITE, 41000, "EF9101");
        cars[3] = new Car(4, CarBrand.FORD, CarModel.FORD_MONDEO, 2016, CarColour.RED, 30000, "GH1213");
        cars[4] = new Car(5, CarBrand.SKODA, CarModel.SKODA_KODIAQ, 2019, CarColour.BLACK, 70000, "IJ1415");

        CarBrand searchBrand = CarBrand.VW;
        for (Car car : cars) {
            if (car.getCarBrand() == searchBrand) {
                System.out.println(car);
            }
        }

        CarModel model = CarModel.VOLKSWAGEN_PASSAT;
        int n = 5;
        System.out.println("Список автомобилей модели " + model + ", которые эксплуатируются больше " + n + " лет:");
        for (Car car : cars) {
            if (car.getCarModel() == model && (2023 - car.getCarYear()) > n) {
                System.out.println(car);
            }
        }
        int year = 2013;
        double price = 40000;
        System.out.println("Список автомобилей года выпуска " + year + ", цена которых больше " + price + ":");
        for (Car car : cars) {
            if (car.getCarYear() == year && car.getPrice() > price) {
                System.out.println(car);
            }
        }
    }
}

