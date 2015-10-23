package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 16.10.15.
 */
public class Sin extends UnaryOperation {
    @Override
    public double execute(double firstnumber) {
        return Math.sin(firstnumber);
    }
}
