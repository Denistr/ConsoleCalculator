package ru.ncedu.istratenko.CC;

import ru.ncedu.istratenko.CC.operations.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by denis on 12.10.15.
 */

/**
 * It is responsible for data input and arithmetic operations / functions from the keyboard</br>
 * @author Denis Istratenko
 */
public class DataInput {

    ConfigurationSign alloperations = new ConfigurationSign();
    public static final String opclassnameprefix = "ru.ncedu.istratenko.CC.operations.";

    /**
     * Enter number from the keyboard.</br>
     * The string must contain only numbers.</br>
     * @return The number that entered from the keyboard
     */

    public double inputNumber(){
        while (true) {
            try {
                System.out.println("Enter the number:");
                Scanner sc = new Scanner(System.in); //прочитать про класс Scanner
                return Double.valueOf(sc.nextLine());
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Incorrect input. Try again.");
            }
        }
    }

    /**
     * Enter and process introduced from the keyboard arithmetic sign or function</br>
     * It can be entered only proposed symbols</br>
     * @return The operation to be performed by the calculator
     */

    public Operation inputOperation() {
        Scanner sc = new Scanner(System.in);
        Operation sign=null;
        while (true) {
            try {

                System.out.println("Enter the sign of operation:" );

                alloperations.availableOperations();

                sign = getOperationBySign(sc.nextLine());
                if (sign != null) {
                    return sign; //возвращает ссылку на объект экземпляра класса в зависимости от знака
                } else System.out.println("Incorrect input");
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Incorrect input. Try again.");
            }
        }
    }

    /**
     * Checks whether to use the calculation result as the first number</br>
     * @return true if you want use result, like first number and false, if no
     */

    public boolean saveResult(){
        System.out.println("If you want use result like first number-enter 'y', else 'n'");
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                String inputChar = sc.nextLine();
                if (inputChar.compareTo("y")==0 || (inputChar.compareTo("Y")==0)) {
                    return true;
                } else if (inputChar.compareTo("n")==0 || (inputChar.compareTo("N")==0))
                    return false;
                else System.out.println("Incorrect input. Try again");
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Incorrect input. Try again.");
            }
        }
    }

    private Operation getOperationBySign(String sign){
        try{
            Operation myclass = null;
            StringBuilder sb = new StringBuilder();
            sb.append(opclassnameprefix);
            sb.append(alloperations.getClassNameBySign(sign));
            if (Class.forName(sb.toString())==null){
                return null;
            }

            myclass = (Operation)Class.forName(sb.toString()).newInstance();
            return myclass;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
