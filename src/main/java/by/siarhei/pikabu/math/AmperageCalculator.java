package by.siarhei.pikabu.math;

public class AmperageCalculator implements BaseCalculator {
    @Override
    public double calculate(double diameter, double length) {
        return ((Math.PI * diameter * (length + diameter / 2)) / 10000) * 55;
    }
}
