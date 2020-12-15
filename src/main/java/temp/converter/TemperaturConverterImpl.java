package temp.converter;

import org.springframework.stereotype.Service;

@Service
public class TemperaturConverterImpl implements TemperatureConverterService{
    @Override
    public float convertCelciusToFahrenheit(float degree) {
        float fahrenheit = (float) ((degree * 1.8) + 32);
        return fahrenheit;
    }

    @Override
    public float convertFahrenheitToCelcius(float fahrenheit) {
        float celcius = (float) ((fahrenheit - 32) / 1.8);
        return celcius;
    }
}
