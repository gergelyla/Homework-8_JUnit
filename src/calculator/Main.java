package calculator;


import static calculator.UnitMeasures.M;

import calculator.objectDefinitions.Calculator;

public class Main {
    public static void main(String[] args){
        Calculator distance=new Calculator("12m+30cm-10mm",M);
        System.out.println("The calculated distance is: "+distance.calculateDistance()+" "+distance.getResultUnitMeasure());

    }

}
