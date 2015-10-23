package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 12.10.15.
 */
public class Sum implements Operation {
    @Override
    public double execute(double firstnumber, double secondnumber) {
        return firstnumber+secondnumber;
    }
}
