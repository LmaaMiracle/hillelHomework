package yarchuk;

public class Main {

    public static void main(String[] args) {

        //Car mercedes = new Car(60, 50, 5);
        //заправляем полный бак
        //System.out.println(mercedes.fullFuelTank());

        //рассчитываем остаток бензина, после Н км
        //System.out.println(mercedes.getFuelRemainingAfterDistance(425));

        //System.out.println(mercedes.neededAmountOfFuelToFillFullTankAfterDistance(200));

        Car carToKievFromOdessa = new Car(58, 50, 9.4);

        //Одесса - Кривой Рог = 308, Кривой Рог - Жашков 341км, Жашков - Киев = 151км
        //Одесса - Кривой Рог
        System.out.println(carToKievFromOdessa.neededAmountOfFuelToFillFullTankAfterDistance(308));
        System.out.println("Остаток в баке по приезду составляет: ");
        System.out.println(carToKievFromOdessa.getFuelRemaining());
        carToKievFromOdessa.fullFuelTank();
        System.out.println("\n");

        //Кривой Рог - Жашков
        System.out.println(carToKievFromOdessa.neededAmountOfFuelToFillFullTankAfterDistance(341));
        System.out.println("Остаток в баке по приезду составляет: ");
        System.out.println(carToKievFromOdessa.getFuelRemaining());
        carToKievFromOdessa.fullFuelTank();
        System.out.println("\n");


        //Жашков - Киев
        System.out.println(carToKievFromOdessa.neededAmountOfFuelToFillFullTankAfterDistance(151));
        System.out.println("Остаток топлива в пункте назначения: ");
        System.out.println(carToKievFromOdessa.getFuelRemaining());
        System.out.println("Общая сумма поездки составляет: " + Car.sumOfTrip);



    }
}
