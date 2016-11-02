
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WeatherConditionals
{
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
        boolean windy = false;
        boolean snow = false;
        boolean rain = false;
        boolean showers = false;
        boolean storm = false;
        boolean fog = false;
        boolean drizzle = false;
        if(description.indexOf("windy") != -1) windy = true;
        if(description.indexOf("drizzle") != -1) drizzle = true;
        if(description.indexOf("snow") != -1) snow = true;
        if(description.indexOf("rain") != -1) rain = true;
        if(description.indexOf("showers") != -1) showers = true;   
        if(description.indexOf("hurricane") != -1 || description.indexOf("tor") != -1|| description.indexOf("thunder") != -1) storm = true; 
        if(description.indexOf("fog")!= -1 || description.indexOf("haz")!= -1 || description.indexOf("smok")!= -1) fog = true; 
        if(temperature >= 100 && humidity >= 80) return "It's too hot and humid for a hike.";
        if(temperature >= 110) return "It's too hot, wait for a cooler day.";
        if(storm)return "Dangerous weather possible; best to stay sheltered.";
        if(temperature <= 40 || windchill <= 35 )return "It's too cold outside; wait for it to warmup.";
        if((showers) || (rain) )return "Rain or showers forecast; not a good hiking day.";
        if((fog))return "Might be too smoky for a hike; best to check first.";
        if((drizzle))return "There may be drizzle; maybe take a rain coat.";
        else return "Weather is good.  Looks like another great day for a hike!";
        }
}

