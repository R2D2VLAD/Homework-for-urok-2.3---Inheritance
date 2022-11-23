
    public class Car extends Transport {

        private double engineVolume;
        private String gears;
        private final String typeOfBody;
        private String regNumber;
        private final int seatsCount;
        private boolean summerTyres;

        public Car(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor,
                   int maxMovementSpeed, double engineVolume, String gears, String typeOfBody, String regNumber,
                   int seatsCount, boolean summerTyres) {
            super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maxMovementSpeed);


            if (Double.compare(engineVolume, 0) == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
            if (gears == null) {
                this.gears = "МКПП";
            } else {
                this.gears = gears;
            }
                this.regNumber = "x000xx000";
            if (typeOfBody == null) {
                this.typeOfBody = "седан";
            } else {
                this.typeOfBody = typeOfBody;
            }
                this.seatsCount = seatsCount;
                this.summerTyres = true;
        }




        public double getEngineVolume() {
            return this.engineVolume;
        }

        public String getTypeOfBody() {
            return typeOfBody;
        }

        public int getSeatsCount() {
            return seatsCount;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }

        public String getGears() {
            return gears;
        }

        public void setGears(String gears) {
            if (gears == null) {
                this.gears = "МКПП";
            } else {
                this.gears = gears;
            }
        }

        public String getRegNumber() {
            return regNumber;
        }

        public void setRegNumber(String regNumber) {
            if (regNumber == null) {
                this.regNumber = "x000xx000";
            } else {
                this.regNumber = regNumber;
            }
        }

        public void setSummerTyres(boolean summerTyres) {
            this.summerTyres = summerTyres;
        }

        public void changeTyres() {
            summerTyres = !summerTyres;
        }

        public boolean isCorrectRegNumber() {
            //x000xx000
            if (regNumber.length() != 9) {
                return false;
            }
            char[] chars = regNumber.toCharArray();
            if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                return false;
            }
            return (Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                    Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]));
            }

        @Override
        public String toString() {
            return "Автомобиль " + getBrand() +
                    " " + getModel() +
                    ". Год производства - " + getYearOfRelease() +
                    ". Страна производства - " + getCountryOfManufacture() +
                    ". Цвет автомобиля - " + getBodyColor() +
                    ". Максимальная скорость - " + getMaxMovementSpeed() + " км/ч" +
                    ". Объём двигателя - " + getEngineVolume() +
                    ". Коробка передач - " + getGears() +
                    ". Тип кузова - " + getTypeOfBody() +
                    ". Регистрационный номер - " + getRegNumber() +
                    ". Количество мест - " + getSeatsCount() +
                    ". Резина - " + summerTyres;
        }

        public void refill() {
            System.out.println("Автомобили заправляются бензином или дизелем на заправке. " +
                    "Электрокары заряжаются на специальных электропарковках!");
        }
    }
