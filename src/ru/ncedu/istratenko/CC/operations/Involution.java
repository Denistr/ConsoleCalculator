package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 12.10.15.
 */
public class Involution implements Operation {
    @Override
    public double execute(double firstnumber, double secondnumber) {
        return Math.pow(firstnumber,secondnumber);
    }
}
