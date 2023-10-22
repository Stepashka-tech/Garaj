package edu.itacademy.first.entity;

public enum CarBrand {
    SKODA("Skoda"),
    VW("Volkswagen"),
    LADA("Lada"),
    FORD( "Ford" );
    private final String brandName;

    CarBrand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}
