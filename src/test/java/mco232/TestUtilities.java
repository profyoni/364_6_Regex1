package mco232;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUtilities {

    double TOLERANCE = 0.000_001;

    @Test
    public void fToC() {
        double actual = Utilities.convert(32, TemperatureUnit.Fahrenheit, TemperatureUnit.Celsius);
        assertEquals(0, actual, TOLERANCE);
    }
    @Test
    public void fToK() {
        double actual = Utilities.convert(0, TemperatureUnit.Fahrenheit, TemperatureUnit.Kelvin);
        assertEquals(255.37222222, actual, TOLERANCE);
    }
    @Test
    public void fToF() {
        double actual = Utilities.convert(0, TemperatureUnit.Fahrenheit, TemperatureUnit.Fahrenheit);
        assertEquals(0, actual, TOLERANCE);
    }
    
    @Test
    public void cToC() {
        double actual = Utilities.convert(0, TemperatureUnit.Celsius, TemperatureUnit.Celsius);
        assertEquals(0, actual, TOLERANCE);
    }
    @Test
    public void cToK() {
        double actual = Utilities.convert(0, TemperatureUnit.Celsius, TemperatureUnit.Kelvin);
        assertEquals(273.15, actual, TOLERANCE);
    }
    @Test
    public void cToF() {
        double actual = Utilities.convert(0, TemperatureUnit.Celsius, TemperatureUnit.Fahrenheit);
        assertEquals(32, actual, TOLERANCE);
    }
    
    @Test
    public void kToC() {
        double actual = Utilities.convert(0, TemperatureUnit.Kelvin, TemperatureUnit.Celsius);
        assertEquals(-273.15, actual, TOLERANCE);
    }
    @Test
    public void kToK() {
        double actual = Utilities.convert(0, TemperatureUnit.Kelvin, TemperatureUnit.Kelvin);
        assertEquals(0, actual, TOLERANCE);
    }
    @Test
    public void kToF() {
        double actual = Utilities.convert(255.37222222, TemperatureUnit.Kelvin, TemperatureUnit.Fahrenheit);
        assertEquals(0, actual, TOLERANCE);
    }
    
    // error conditions
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTemperatureUnitTo() {
        double actual = Utilities.convert(255.37222222, null, TemperatureUnit.Fahrenheit);
    }  
    
    @Test(expected = IllegalArgumentException.class)
    public void nullTemperatureUnitFrom() {
        double actual = Utilities.convert(255.37222222, null, TemperatureUnit.Fahrenheit);
    }

}
