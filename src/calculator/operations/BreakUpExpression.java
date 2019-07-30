package calculator.operations;

public class BreakUpExpression {

    public double[] getDistances(String expression){
        String separator="[cmk+\\-]+";
        String[] stringDistances=expression.split(separator);
        double[] doubleDistance=new double[stringDistances.length];
        for (int i=0;i<stringDistances.length;i++){
            doubleDistance[i]=Double.parseDouble(stringDistances[i]);
            System.out.println(doubleDistance[i]);
        }
        return doubleDistance;
    }

    public String[] getUnitMeasures(String expression){
        String separator="[1234567890+\\-]+";
        String[] stringUnitMeasures=expression.split(separator);
        for (String i:stringUnitMeasures){
            System.out.println(i);
        }
        return stringUnitMeasures;
    }

    public String[] getoperators(String expression){
        String separator="[1234567890mcdk]+";
        String[] stringOperators=expression.split(separator);
        for (String i:stringOperators){
            System.out.println(i);
        }
        return stringOperators;
    }
}
