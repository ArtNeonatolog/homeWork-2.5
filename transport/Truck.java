package transport;

import java.util.Objects;

public class Truck extends PassengerCar implements Competing {

    public enum carrying {CARRYING ("N1 (с полной массой до 3,5 тонн)", "N2 (с полной массой свыше 3,5 до 12 тонн)", "N3 (с полной массой свыше 12 тонн)");

        private final String N1;

        private final String N2;

        private final String N3;

        carrying(String n1, String n2, String n3) {
            N1 = n1;
            N2 = n2;
            N3 = n3;
        }
    }
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public final int MAX_SPEED = 150;

    @Override
    public void startMoving() {
        System.out.println("Начало движения - постепенный старт, затем быстрый разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты медленным торможением");

    }

    public void informationOfTheTrucks() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }


    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 20 кругов или если начнется дождь, также при поломке");
    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 9 мин. 58 сек.");

    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость грузовой машины в гоночных соревнованиях - " + MAX_SPEED + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return MAX_SPEED == truck.MAX_SPEED;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}