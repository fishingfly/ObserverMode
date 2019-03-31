/**
 * @Auther: user
 * @Date: 2019/3/31 15:37
 * @Description:
 */
public class WeatherStatioMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10,20,30);
    }
}
