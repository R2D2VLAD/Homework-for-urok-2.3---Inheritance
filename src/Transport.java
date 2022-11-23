public abstract class Transport {
    private String brand;
    private String model;
    private final int yearOfRelease;
    private final String countryOfManufacture;
    private String bodyColor;
    private int maxMovementSpeed;

    public abstract void refill();

    public Transport(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maxMovementSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (yearOfRelease == 0) {
            this.yearOfRelease = 2000;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (countryOfManufacture == null) {
            this.countryOfManufacture = "Default";
        } else {
            this.countryOfManufacture = countryOfManufacture;
        }
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        }
            this.maxMovementSpeed = maxMovementSpeed;
    }

    public Transport(String brand, String model, int yearOfRelease, String countryOfManufacture, int maxMovementSpeed) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (yearOfRelease == 0) {
            this.yearOfRelease = 2000;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (countryOfManufacture == null) {
            this.countryOfManufacture = "Default";
        } else {
            this.countryOfManufacture = countryOfManufacture;
        }
        this.maxMovementSpeed = maxMovementSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor != null && !bodyColor.isEmpty() && !bodyColor.isBlank()) {
            this.bodyColor = bodyColor;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        this.maxMovementSpeed = maxMovementSpeed;
    }
}

