package ru.ncedu.istratenko.CC;

import ru.ncedu.istratenko.CC.operations.Operation;
import ru.ncedu.istratenko.CC.operations.UnaryOperation;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by denis on 11.10.15.
 */
public class Program {

    public static void main (String[] args) throws IOException {
        Calculator calc = new Calculator();
        calc.runCalculator();
    }


}
