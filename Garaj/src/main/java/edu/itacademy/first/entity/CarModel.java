package edu.itacademy.first.entity;

public enum CarModel {
    VOLKSWAGEN_PASSAT(CarBrand.VW, "Passat"),
    FORD_MONDEO(CarBrand.FORD, "Mondeo"),
    VOLKSWAGEN_GOLF(CarBrand.VW, "Golf"),
    VOLKSWAGEN_TURAN(CarBrand.VW, "Turan"),
    LADA_VESTA(CarBrand.LADA, "Vesta"),
    SKODA_KODIAQ(CarBrand.SKODA,"Kodiaq"),
    SKODA_SUPERB(CarBrand.SKODA, "Superb");
    private final CarBrand brand;
    private final String modelName;

    CarModel(CarBrand brand, String modelName) {
        this.brand = brand;
        this.modelName = modelName;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }
}

