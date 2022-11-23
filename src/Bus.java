public class Bus extends Transport {

    public Bus(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maxMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maxMovementSpeed);

    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + ", модель " + getModel() + ". Год выпуска - " + getYearOfRelease() +
                ". Страна производства - " + getCountryOfManufacture() + ". Цвет кузова - " + getBodyColor() +
                ". Максимальная скорость передвижения - " + getMaxMovementSpeed() + " км/ч!";
    }

    public void refill() {
        System.out.println("Автобусы заправляются бензином или дизелем на заправке!");
    }
}
