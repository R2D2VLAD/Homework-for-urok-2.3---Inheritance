public class Train extends Transport {
    private final int tripPrice; // Цена поездки
    private final int tripTime; // Время поездки
    private String departureStationName; // Название станции отбытия
    private String finalStop; // Конечная остановка
    private final int numberOfCars; // Количество вагонов

    public Train(String brand,
                 String model,
                 int yearOfRelease,
                 String countryOfManufacture,
                 int maxMovementSpeed,
                 String departureStationName,
                 String finalStop,
                 int tripPrice,
                 int numberOfCars,
                 int tripTime) {
        super (brand, model, yearOfRelease, countryOfManufacture, maxMovementSpeed);
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.departureStationName = departureStationName;
        this.finalStop = finalStop;
        this.numberOfCars = numberOfCars;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public int getTripTime() {
        return tripTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }


    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getYearOfRelease() +
                " год выпуска в " + getCountryOfManufacture() + ", скорость передвижения - "
                + getMaxMovementSpeed() + " км/ч, отходит от " + getDepartureStationName() +
                " и следует до станции " + getFinalStop() + ". Цена поездки - " + getTripPrice() +
                ", рублей, в поезде " + getNumberOfCars() + " вагонов. Время в пути - " + getTripTime() + " часов!";
    }

    public void refill() {
        System.out.println("Поезда заправляются дизелем!");
    }
}
