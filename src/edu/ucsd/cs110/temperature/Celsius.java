package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        Temperature obj = new Celsius(value);
        return obj;
    }

    @Override
    public Temperature toFahrenheit() {
        float newVal = (value * (9/5)) + 32;
        Temperature obj = new Celsius(newVal);
        return obj;
    }


    public String toString()
        {
            // TODO: Complete this method
            return "" + value;
        }
}
