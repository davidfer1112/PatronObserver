package com.co.client;

import org.example.concreteSubscriber.EmergencyApp;
import org.example.concreteSubscriber.NewsApp;
import org.example.concreteSubscriber.SportsApp;
import org.example.publisher.WeatherStation;
import org.example.subscriber.InterfaceSubscriber;

public class ClientMain {
    public static void main(String[] args) {
        // Crear estación de clima (WeatherStation)
        WeatherStation weatherStation = new WeatherStation();

        // Crear las aplicaciones suscriptoras
        InterfaceSubscriber newsApp = new NewsApp("App de Noticias");
        InterfaceSubscriber sportsApp = new SportsApp("App de Deportes");
        InterfaceSubscriber emergencyApp = new EmergencyApp("App de Emergencias");

        // Suscribir las aplicaciones a la estación de clima
        weatherStation.subscribe(newsApp);
        weatherStation.subscribe(sportsApp);
        weatherStation.subscribe(emergencyApp);

        // Actualización del clima y notificación a las apps
        System.out.println("Notificando 'Tormenta severa':");
        weatherStation.setWeatherState("Tormenta severa");

        // Desuscribir una app
        weatherStation.unsubscribe(sportsApp);

        // Otra actualización del clima
        System.out.println("\nNotificando 'Clima despejado':");
        weatherStation.setWeatherState("Clima despejado");

        // Actualización de emergencia
        System.out.println("\nNotificando 'Emergencia':");
        weatherStation.setWeatherState("Emergencia");
    }
}

