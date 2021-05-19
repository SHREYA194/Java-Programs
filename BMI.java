package Welcome;
import java.util.Scanner;
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double kilo_per_pound=0.435;
    public static final double meter_per_inch=0.254;
    public BMI(String name,int age,double weight,double height)
    {
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.name=name;
    }
    public BMI(String name,double weight,double height)
    {
        this(name,20,weight,height);
    }
    public double getBMI()
    {
        double bmi=weight*kilo_per_pound/(height*meter_per_inch*height*meter_per_inch);
        return Math.round(bmi*100)/100.0;
    }
    public String getStatus()
    {
        double bmi=getBMI();
        if(bmi<18.5)
            return "Underweight";
        else if(bmi<25)
            return "Normal";
        else if(bmi<30)
            return "Overweight";
        else
            return "Obese";
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getHeight()
    {
        return height;
    }
    }

