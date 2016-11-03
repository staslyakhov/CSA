
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(){
        String weatherCondition = "scattered thunderstorms";
        System.out.println(weatherCondition.indexOf("thunder")); 
        WeatherConditionals test = new WeatherConditionals();
        System.out.println(test.getWeatherAdvice(120,"snow"));
        
    }
}