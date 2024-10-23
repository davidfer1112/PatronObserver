package org.example.concreteSubscriber;

import org.example.subscriber.InterfaceSubscriber;

public class NewsApp implements InterfaceSubscriber {
    private String appName;

    public NewsApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println(appName + " recibió la actualización del clima: " + weatherUpdate);
    }

    @Override
    public boolean shouldNotify(String weatherUpdate) {
        return true; // Siempre notificar
    }
}
