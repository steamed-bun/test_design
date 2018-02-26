import com.coocaa.weather.Temper2Dispaly;
import com.coocaa.weather.TemperDispaly;
import com.coocaa.weather.WeatherData;
import org.junit.Test;

public class WeatherTest {

    @Test
    public void test(){
        WeatherData weatherData = new WeatherData();
        TemperDispaly temperDispaly = new TemperDispaly(weatherData);
        Temper2Dispaly temper2Dispaly = new Temper2Dispaly(weatherData);

        weatherData.setData(12f,54.0f,23.43f);
        weatherData.setData(23f,78.9f,21.93f);
        weatherData.setData(45f,59.23f,33.66f);
    }

}
