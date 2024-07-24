package calc;
public class BMICalculator
{
private float weight;
private float height;

public void setHeightInFeetInch(int feet,int inch){
this.height = (feet*12)+inch;
}
public void setHeight(float height){
this.height = height;
}

public void setWeight(float weight){
this.weight = weight;
}

public float calculateInStandard(){
return (float) 703 * (weight/(height*height));
}
public float calculateInMetrics(){
return (float) 10000 * (weight/(height*height));
}
}

