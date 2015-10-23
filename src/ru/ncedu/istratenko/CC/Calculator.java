package ru.ncedu.istratenko.CC;

import ru.ncedu.istratenko.CC.operations.Operation;
import ru.ncedu.istratenko.CC.operations.UnaryOperation;

import java.io.IOException;

/**
 * Created by denis on 21.10.15.
 * It provides a mechanism calculator
 */
public class Calculator {

    /**
     * Entering numbers, the arithmetic sign of the operation / function and output results</br>
     * @throws IOException
     */
    public  void runCalculator()  throws IOException {

        double result=0;

        double firstnumberD=0;
        double secondnumberD=0;
        Operation typesign = null;
        DataInput number=new DataInput();
        DataInput sign=new DataInput();

        while(true) {
            if (firstnumberD == 0) {
                firstnumberD = number.inputNumber();
            }
            typesign = sign.inputOperation(); //в зависимости от этого знака меняется поведение метода execute
            if (typesign instanceof UnaryOperation) {
                result = ((UnaryOperation) typesign).execute(firstnumberD);
            } else {
                secondnumberD = number.inputNumber();
                result = typesign.execute(firstnumberD, secondnumberD); //pattern State
            }

            System.out.println(result);
            firstnumberD = 0;
            if (!Double.isInfinite(result)) {
                if (number.saveResult()) {
                    firstnumberD = result;
                }
            }

        }
    }
}
