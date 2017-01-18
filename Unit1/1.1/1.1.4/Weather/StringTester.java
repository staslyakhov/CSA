
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(){
        WeatherConditionals day1 = new WeatherConditionals();
        WeatherConditionals day2 = new WeatherConditionals();
        WeatherConditionals day3 = new WeatherConditionals();
        WeatherConditionals day4 = new WeatherConditionals();
        WeatherConditionals day5 = new WeatherConditionals();
        WeatherConditionals day6 = new WeatherConditionals();
        WeatherConditionals day7 = new WeatherConditionals();
        WeatherConditionals day8 = new WeatherConditionals();
        
        System.out.println(day1.getHikingAdvice(101,50,90,"fog"));
        System.out.println(day2.getHikingAdvice(30,30,0,"snow"));
        System.out.println(day3.getHikingAdvice(111,100,70,"sunny"));
        System.out.println(day4.getHikingAdvice(52,45,20,"hurricane"));
        System.out.println(day5.getHikingAdvice(50,49,20,"haze"));
        System.out.println(day6.getHikingAdvice(79,50,90,"windy"));
        System.out.println(day7.getHikingAdvice(69,87,20,"showers"));
        System.out.println(day8.getHikingAdvice(67,55,15,"drizzle"));
    }
}