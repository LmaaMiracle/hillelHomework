package yarchuk;

public class Car {

    public static double sumOfTrip;

    private int fuelTankVolume;
    private double fuelRemaining;
    private double fuelConsumptionFor100km;

    public Car(int fuelTankVolume, double fuelRemaining, double fuelConsumptionFor100km) {
        this.fuelTankVolume = fuelTankVolume;
        this.fuelRemaining = fuelRemaining;
        this.fuelConsumptionFor100km = fuelConsumptionFor100km;
    }


    public double fullFuelTank() {
        System.out.println("Зполняем бак полностью");
        return this.fuelRemaining += (fuelTankVolume - fuelRemaining);
    }

    public double getFuelRemainingAfterDistance(int distance) {
        double fullFuelConsumption = (distance / 100d) * fuelConsumptionFor100km;

        if ((fuelRemaining - fullFuelConsumption) < 0) {
            System.out.println("Not enough fuel for this ride! " +
                    "\nYou need " + Math.abs(fuelRemaining - fullFuelConsumption) + " extra litres of fuel.");
            return 0;
        }
        return fuelRemaining - fullFuelConsumption;
    }

    //как я понимаю в условии "определить сколько надо дозаправить топлива при преодолении N км" --
    // нужно определить сколько нужно литров до полного бака, после поездки на N км
    public double neededAmountOfFuelToFillFullTankAfterDistance(int distance) {
        double fullFuelConsumption = (distance / 100d) * fuelConsumptionFor100km;
        if (fullFuelConsumption > fuelRemaining) {
            System.out.println("Not enough fuel for this ride!");
            return 0;
        }

        //то, сколько нужно будет дозаправить;
        double neededAmountOfFuel = fuelTankVolume - (fuelRemaining - fullFuelConsumption);
        System.out.println("The price of needed fuel: " + neededAmountOfFuel * 27.99 + "\nYou'll need to fill (litres): ");

        //данные модификации уже делал для задания с поездкой в Киев с Одессы, но по логике вещей этот метод не должен
        //сразу тратить бенизн, а только расчитывать сколько его понадобится для заправки полного бака, после поездки
        this.fuelRemaining -= fullFuelConsumption;
        sumOfTrip += neededAmountOfFuel * 27.99;
        return neededAmountOfFuel;
    }

    public double getFuelRemaining() {
        return fuelRemaining;
    }


}
