package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 12.10.15.
 */
public class Sqrt extends UnaryOperation{
    @Override
    public double execute(double firstnumber) {
        return Math.sqrt(firstnumber);
    }
}
