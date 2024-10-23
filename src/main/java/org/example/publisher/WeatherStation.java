package org.example.publisher;

import org.example.subscriber.InterfaceSubscriber;

import java.util.ArrayList;
import java.util.List;

// Publisher class
public class WeatherStation {
    private List<InterfaceSubscriber> subscribers = new ArrayList<>();
    private String weatherState;

    // Suscribir a un observador
    public void subscribe(InterfaceSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Desuscribir a un observador
    public void unsubscribe(InterfaceSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notificar a todos los suscriptores que cumplan con los criterios
    public void notifySubscribers() {
        for (InterfaceSubscriber subscriber : subscribers) {
            if (subscriber.shouldNotify(weatherState)) {
                subscriber.update(weatherState);
            }
        }
    }

    // Cambiar el estado del clima y notificar a los suscriptores
    public void setWeatherState(String newWeatherState) {
        this.weatherState = newWeatherState;
        notifySubscribers();
    }
}
