package ru.ncedu.istratenko.CC.operations;

/**
 * Created by denis on 12.10.15.
 */

public abstract class UnaryOperation implements Operation {
    @Override
    public  double execute(double firstnumber, double secondnumber) {
        return execute(firstnumber);
    }

    public abstract double execute(double firstnumber);
}
