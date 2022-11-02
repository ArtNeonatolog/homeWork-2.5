import com.sun.jdi.connect.Transport;
import drivers.DriverB;
import drivers.DriverC;
import drivers.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");

        Car car1 = new Car("Porsche", "911", 3.5f);
        System.out.println(car1.toString());
        car1.informationOfTheCar();
        car1.startMoving();
        car1.finishMoving();
        car1.PitStop();
        car1.theBestTimeOfLap();
        System.out.println(car1.maxSpeed().toString());
        System.out.println();

        Car car2 = new Car("Лада", "Калина", 2.0f);
        System.out.println(car2.toString());
        car2.informationOfTheCar();
        car2.startMoving();
        car2.finishMoving();
        car2.PitStop();
        car2.theBestTimeOfLap();
        System.out.println(car2.maxSpeed().toString());
        System.out.println();

        Car car3 = new Car("Бугатти", "Вейрон", 8.0f);
        System.out.println(car3.toString());
        car3.informationOfTheCar();
        car3.startMoving();
        car3.finishMoving();
        car3.PitStop();
        car3.theBestTimeOfLap();
        System.out.println(car3.maxSpeed().toString());
        System.out.println();

        Car car4 = new Car("Феррари", "458", 4.5f);
        System.out.println(car4.toString());
        car4.informationOfTheCar();
        car4.startMoving();
        car4.finishMoving();
        car4.PitStop();
        car4.theBestTimeOfLap();
        System.out.println(car4.maxSpeed().toString());
        System.out.println();

        Bus bus1 = new Bus("Нефаз", "x3456", 4.0f);
        System.out.println(bus1.toString());
        bus1.informationOfTheBus();
        bus1.startMoving();
        bus1.finishMoving();
        bus1.PitStop();
        bus1.theBestTimeOfLap();
        System.out.println(bus1.maxSpeed().toString());
        System.out.println();

        Bus bus2 = new Bus("Икарус", "dr678", 4.5f);
        System.out.println(bus2.toString());
        bus2.informationOfTheBus();
        bus2.startMoving();
        bus2.finishMoving();
        bus2.PitStop();
        bus2.theBestTimeOfLap();
        System.out.println(bus2.maxSpeed().toString());
        System.out.println();

        Bus bus3 = new Bus("ПАЗ", "С45", 3.5f);
        System.out.println(bus3.toString());
        bus3.informationOfTheBus();
        bus3.startMoving();
        bus3.finishMoving();
        bus3.PitStop();
        bus3.theBestTimeOfLap();
        System.out.println(bus3.maxSpeed().toString());
        System.out.println();

        Bus bus4 = new Bus("Мерседес", "О303", 3.8f);
        System.out.println(bus4.toString());
        bus4.informationOfTheBus();
        bus4.startMoving();
        bus4.finishMoving();
        bus4.PitStop();
        bus4.theBestTimeOfLap();
        System.out.println(bus4.maxSpeed().toString());
        System.out.println();

        Truck truck1 = new Truck("Камаз", "4326", 18.0f);
        System.out.println(truck1.toString());
        truck1.informationOfTheTrucks();
        truck1.startMoving();
        truck1.finishMoving();
        truck1.PitStop();
        truck1.theBestTimeOfLap();
        System.out.println(truck1.maxSpeed().toString());
        System.out.println();

        Truck truck2 = new Truck("Вольво", "см65", 16.0f);
        System.out.println(truck2.toString());
        truck2.informationOfTheTrucks();
        truck2.startMoving();
        truck2.finishMoving();
        truck2.PitStop();
        truck2.theBestTimeOfLap();
        System.out.println(truck2.maxSpeed().toString());
        System.out.println();

        Truck truck3 = new Truck("Рено", "348", 15.0f);
        System.out.println(truck3.toString());
        truck3.informationOfTheTrucks();
        truck3.startMoving();
        truck3.finishMoving();
        truck3.PitStop();
        truck3.theBestTimeOfLap();
        System.out.println(truck3.maxSpeed().toString());
        System.out.println();

        Truck truck4 = new Truck("Форд", "654", 17.5f);
        System.out.println(truck4.toString());
        truck4.informationOfTheTrucks();
        truck4.startMoving();
        truck4.finishMoving();
        truck4.PitStop();
        truck4.theBestTimeOfLap();
        System.out.println(truck4.maxSpeed().toString());
        System.out.println();

        System.out.println("Задание 4");
        DriverB driverB = new DriverB("Пирожков Антон Сергеевич", true, 6, car1);
        System.out.println(driverB.toString());
        driverB.informationOfDriver();
        driverB.driverDriving();
        System.out.println();

        DriverC driverC = new DriverC("Сватов Игорь Александрович", true,8, truck4);
        System.out.println(driverC.toString());
        driverC.informationOfDriver();
        driverC.driverDriving();
        System.out.println();

        DriverD driverD = new DriverD("Алимбеков Айдар Анварович", true, 10, bus1);
        System.out.println(driverD.toString());
        driverD.informationOfDriver();
        driverD.driverDriving();

    }
}
