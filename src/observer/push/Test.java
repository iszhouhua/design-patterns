package observer.push;

public class Test {
    public static void main(String[] args) {
        //创建主题
        WeatherData weatherData = new WeatherData();
        //显示当前天气状态的布告板
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        //进行天气预报的布告板
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //更新数据
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        //删除进行天气预报的布告板
        weatherData.removeObserver(forecastDisplay);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
