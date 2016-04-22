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
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float newVal = ((value * 9) / 5) + 32;
        Temperature obj = new Celsius(newVal);
        return obj;
    }


    public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " C";
        }
}
