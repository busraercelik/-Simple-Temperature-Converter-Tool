package temp.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {

    @Autowired
    TemperatureConverterService temperatureConverterService;

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner in = new Scanner(System.in);

        String input="";
        do{
            System.out.println("Which temperature do you want to convert to? Type c - Celcius, f - Fahrenheit, exit - to quit");
            input = in.nextLine();
            if(input.equalsIgnoreCase("c")){
                System.out.println("Enter celcius to convert to fahrenheit: ");
                float celc  = in.nextFloat();
                in.nextLine();
                System.out.println(temperatureConverterService.convertCelciusToFahrenheit(celc));
            }
            if(input.equalsIgnoreCase("f")){
                System.out.println("Enter fahrenheit to convert to celcius: ");
                float fahr = in.nextFloat();
                in.nextLine();
                System.out.println(temperatureConverterService.convertFahrenheitToCelcius(fahr));
            }

        }
        while(!input.equals("exit"));
    }
}
