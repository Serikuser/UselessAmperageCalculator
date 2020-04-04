package by.siarhei.pikabu.math;

public class AmperageCalculator implements BaseCalculator {
    @Override
    public double calculate(double diameter, double length,double amper) {
        return ((Math.PI * diameter * (length + diameter / 2)) / 10000) * amper;
    }
}
