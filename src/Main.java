public class Main {
    public static void main(String[] args) {

        String[] capitals = {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"};

        double[][] temperatures = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int highTemperature = 0, lowTemperature = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i][0] < temperatures[lowTemperature][0])
                lowTemperature = i;
            if (temperatures[i][1] > temperatures[highTemperature][1])
                highTemperature = i;

        }

        System.out.println("Highest temperature city is " + capitals[highTemperature]);
        System.out.println("Lowest temperature city is " + capitals[lowTemperature]);
    }
}