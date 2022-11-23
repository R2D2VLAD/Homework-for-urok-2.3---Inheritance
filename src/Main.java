public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Car lada = new Car("Lada", "Granta", 2015, "России",
                "жёлтого цвета", 300, 2.5, "МКПП", "седан",
                "x125xx900", 4, true);
        System.out.println(lada);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии",
                "чёрный цвет кузова", 270,3.0, "АКПП", "седан",
                "x120xx90", 4, true);
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", 2021, "Германии",
                "чёрный цвет кузова", 220, 3.0, "АКПП", "купе",
                "x110xx256", 2, true);
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018,
                "Южной Корее", "цвет кузова - красный", 280, 2.4, "МКПП", "универсал",
                "x100xx200", 4, true);
        System.out.println(kia);

        Car hyundai = new Car("Hyundai", "Avante", 2016,
                "Южной Корее", "цвет кузова - оранжевый", 200, 1.6, "МКПП", "седан",
                "x456xx34", 4, true);
        System.out.println(hyundai);
        hyundai.refill();
        System.out.println();

        System.out.println("Задание 2");
        //Поезд «Ласточка», модель B-901, 2011 год выпуска в России, скорость передвижения — 301 км/ч,
        //отходит от Белорусского вокзала и следует до станции Минск-Пассажирский.
        // Цена поездки — 3500 рублей, в поезде 11 вагонов.
        //Поезд «Ленинград», модель D-125, 2019 год выпуска в России, скорость передвижения — 270 км/ч,
        //отходит от Ленинградского вокзала и следует до станции Ленинград-Пассажирский.
        // Цена поездки — 1700 рублей, в поезде 8 вагонов.

        Train one = new Train("<<Ласточка>>", "B-901", 2011, "России",
                301, "Белорусского вокзала", "Минск-Пассажирский",
                3500, 11, 46);
        System.out.println(one);
        Train two = new Train("<<Ленинград>>", "D-125", 2019, "России",
                270, "Ленинградского вокзала", "Ленинград-Пассажирский",
                1700, 8, 30);
        System.out.println(two);
        two.refill();
        System.out.println();

        System.out.println("Задание 3");
        Bus ikarus = new Bus("ikarus", "66", 1972, "США",
                "бежевый", 80);
        System.out.println(ikarus);
        Bus Mercedes = new Bus("Mercedes-Benz", "O321H", 1957, "Германия",
                "бордовый", 95);
        System.out.println(Mercedes);
        Bus ZIL = new Bus("ЗИЛ", "3250AO", 1980, "Россия",
                "белый с синим", 100);
        System.out.println(ZIL);
        ZIL.refill();

    }
}