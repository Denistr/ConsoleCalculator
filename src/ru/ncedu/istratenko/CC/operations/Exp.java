package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 16.10.15.
 */
public class Exp extends UnaryOperation {
    @Override
    public double execute(double firstnumber) {
        return Math.exp(firstnumber);
    }
}
