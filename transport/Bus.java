package transport;

import java.util.Objects;

public class Bus extends PassengerCar implements Competing {

    public enum capacityType {CAPACITY_TYPE ("особо малая (до 10 мест)", "малая (до 25 мест)", "средняя (40–50 мест)",
            "большая (60–80 мест)", "особо большая (100–120 мест)");

        private final String especiallySmall;

        private final String small;

        private final String middle;

        private final String big;

        private final String especiallyBig;

        capacityType(String especiallySmall, String small, String middle, String big, String especiallyBig) {
            this.especiallySmall = especiallySmall;
            this.small = small;
            this.middle = middle;
            this.big = big;
            this.especiallyBig = especiallyBig;
        }
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public final int MAX_SPEED = 100;

    @Override
    public void startMoving() {
        System.out.println("Начало движения - медленный старт, затем плавный разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты постепенной остановкой");

    }

    public void informationOfTheBus() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }

    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 15 кругов или если начнется дождь, также при поломке");

    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 15 мин. 42 сек.");
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость автобуса в гоночных соревнованиях - " + MAX_SPEED + " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return MAX_SPEED == bus.MAX_SPEED;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}
