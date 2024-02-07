package uk.minersonline.java_college.w4.a10;

import java.util.ArrayList;
import java.util.List;

public class w4a10Main {
    public static void main(String[] args) {
        List<Weather> weathers = new ArrayList<>();
        weathers.add(new Rain());
        weathers.add(new Rain());
        weathers.add(new Sun());
        weathers.add(new Sun());

        for (Weather weather : weathers) {
            System.out.println(weather.getAdvice());
        }
    }
}
