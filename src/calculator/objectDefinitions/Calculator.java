package calculator.objectDefinitions;

import calculator.UnitMeasures;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements ICalculator {
    private String expression;
    private UnitMeasures resultUnitMeasure;

    public Calculator(String expression, UnitMeasures resultUnitMeasure){
        this.expression=expression;
        this.resultUnitMeasure=resultUnitMeasure;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public UnitMeasures getResultUnitMeasure() {
        return resultUnitMeasure;
    }

    public void setResultUnitMeasure(UnitMeasures resultUnitMeasure) {
        this.resultUnitMeasure = resultUnitMeasure;
    }

    @Override
    public void add() {

    }

    @Override
    public void substract() {

    }

    public double calculateDistance(){
        List<Distance> listOfDistances=new ArrayList<>();
        double calculatedDistance=0;
        double[] doubleDistance=getDistances(expression);
        String[] stringUnitMeasure=getUnitMeasures(expression);
        String[] stringOperators=getOperators(expression);
        for (int i=0;i<doubleDistance.length;i++){
            Distance distance=new Distance(doubleDistance[i],stringUnitMeasure[i]);
            listOfDistances.add(distance);
        }
        transformDistancesToResultUM(listOfDistances,this.resultUnitMeasure);
        return calculatedDistance;
    }

    private void transformDistancesToResultUM(List<Distance> listOfDistances, UnitMeasures resultUnitMeasure){
        
    }

    private double[] getDistances(String expression){
        String separator="[cmk+\\-]+";
        String[] stringDistances=expression.split(separator);
        double[] doubleDistance=new double[stringDistances.length];
        for (int i=0;i<stringDistances.length;i++){
            doubleDistance[i]=Double.parseDouble(stringDistances[i]);
            System.out.println(doubleDistance[i]);
        }
        return doubleDistance;
    }

    private String[] getUnitMeasures(String expression){
        String separator="[1234567890+\\-]+";
        String[] stringUnitMeasures=expression.split(separator);
        for (String i:stringUnitMeasures){
            System.out.println(i);
        }
        return stringUnitMeasures;
    }

    private String[] getOperators(String expression){
        String separator="[1234567890mcdk]+";
        String[] stringOperators=expression.split(separator);
        for (String i:stringOperators){
            System.out.println(i);
        }
        return stringOperators;
    }

    public boolean isDouble() throws NumberFormatException{
        boolean isDouble=false;
        String exp="65";
        double numberString = Double.parseDouble(exp);
        isDouble=true;
        return isDouble;
    }
}
