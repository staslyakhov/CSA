
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        boolean snow = false;
        if(description.indexOf("windy") != -1) windy = true;
        if (temperature < 30 || (windy))return "Too windy or too cold!";
        if(description.indexOf("snow") != -1) snow = true;
        if (temperature > 100 && (snow))return "Are you sure????";
        else return "It is safe to go outside";
    }
}

