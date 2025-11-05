public class Main {

    // вернуть все машины нужного бренда
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(brend)) count++;
        }
        Car[] res = new Car[count];
        int x = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(brend)) {
                res[x++] = cars[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Car[] mass = {
            new Car(1, "Toyota", "Camry", 2020, "Серебристый", 22000.0, "T100TC"),
            new Car(2, "Honda", "Civic", 2021, "Синий", 19000.0, "H200HC"),
            new Car(3, "Ford", "Focus", 2019, "Красный", 15000.0, "F300FF"),
            new Car(4, "Toyota", "Corolla", 2022, "Белый", 21000.0, "T400TC"),
            new Car(5, "Honda", "Accord", 2018, "Чёрный", 18000.0, "H500HA"),
            new Car(6, "Ford", "Fiesta", 2023, "Жёлтый", 17000.0, "F600FF"),
            new Car(7, "Toyota", "RAV4", 2021, "Серый", 28000.0, "T700TR")
        };

        Car[] toyotas = getCarByBrend(mass, "Toyota");
        System.out.println("Найдено Toyota: " + toyotas.length);
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        int cyear = java.time.Year.now().getValue();

        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            int carAge = cyear - cars[i].getYear();
            if (cars[i].getBrand().equals(brend) && carAge > years) count++;
        }
        Car[] result = new Car[count];
        int in = 0;
        for (int i = 0; i < cars.length; i++) {
            int carAge = cyear - cars[i].getYear();
            if (cars[i].getBrand().equals(brend) && carAge > years) {
                result[in++] = cars[i];
            }
        }
        return result;
    }
        Car[] oldToyotas = getCarByBrendAndYearOperational(mass, "Toyota", 3);
        System.out.println("Toyota старше 3 лет: " + oldToyotas.length);

        Car[] oldHondas = getCarByBrendAndYearOperational(mass, "Honda", 4);
        System.out.println("Honda старше 4 лет: " + oldHondas.length);

        Car[] oldFords = getCarByBrendAndYearOperational(mass, "Ford", 2);
        System.out.println("Ford старше 2 лет: " + oldFords.length);
    }
}
