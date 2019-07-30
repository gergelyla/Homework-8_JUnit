package calculator.objectDefinitions;

import calculator.UnitMeasures;

public class Distance {
    private double distanceValue;
    private String distanceUnitMeasure;

    public Distance(double distanceValue,String distanceUnitMeasure){
        this.distanceValue=distanceValue;
        this.distanceUnitMeasure=distanceUnitMeasure;
    }

    public double getDistanceValue() {
        return distanceValue;
    }

    public void setDistanceValue(double distanceValue) {
        this.distanceValue = distanceValue;
    }

    public String getDistanceUnitMeasure() {
        return distanceUnitMeasure;
    }

    public void setDistanceUnitMeasure(String distanceUnitMeasure) {
        this.distanceUnitMeasure = distanceUnitMeasure;
    }
}
