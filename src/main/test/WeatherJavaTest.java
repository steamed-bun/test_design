import com.coocaa.weatherJava.Temper2Dispaly;
import com.coocaa.weatherJava.TemperDispaly;
import com.coocaa.weatherJava.WeatherData;
import org.junit.Test;

public class WeatherJavaTest {

    @Test
    public void test(){
        WeatherData weatherData = new WeatherData();
        TemperDispaly temperDispaly = new TemperDispaly(weatherData);
        Temper2Dispaly temper2Dispaly = new Temper2Dispaly(weatherData);

        weatherData.setData(12f,54.0f,23.43f);
        weatherData.setData(23f,78.9f,21.93f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
        weatherData.setData(45f,59.23f,33.66f);
    }

}
