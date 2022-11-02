package transport;

import java.util.Objects;

public class Car extends PassengerCar implements Competing{

    public enum bodyType {BODY_TYPE ("Седан", "Хетчбек", "Купе", "Универсал", "Внедорожник",
            "Кроссовер", "Пикап", "Фургон", "Минивэн");

        private final String type1;

        private final String type2;

        private final String type3;

        private final String type4;

        private final String type5;

        private final String type6;

        private final String type7;

        private final String type8;

        private final String type9;

        bodyType(String type1, String type2, String type3, String type4,
                 String type5, String type6, String type7, String type8, String type9) {
            this.type1 = type1;
            this.type2 = type2;
            this.type3 = type3;
            this.type4 = type4;
            this.type5 = type5;
            this.type6 = type6;
            this.type7 = type7;
            this.type8 = type8;
            this.type9 = type9;
        }
    }

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public final int MAX_SPEED = 300;

    @Override
    public void startMoving() {
        System.out.println("Начало движения с быстрого старта, затем максимальный разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финиша путем быстрой остановки");
    }

    public void informationOfTheCar() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }

    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 30 кругов или если начнется дождь, также при поломке");

    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 5 мин. 36 сек.");
    }
    @Override
    public String maxSpeed() {
        return "Максимальная скорость легковой машины в гоночных соревнованиях - " + MAX_SPEED+ " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return MAX_SPEED == car.MAX_SPEED;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}