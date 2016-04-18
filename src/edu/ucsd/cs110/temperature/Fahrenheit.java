package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }


    @Override
    public Temperature toCelsius() {
        float newVal = (value - 32) * (5/9);
        Temperature obj = new Fahrenheit(newVal);
        return obj;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature obj = new Fahrenheit(value);
        return obj;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" + value;
    }
}

