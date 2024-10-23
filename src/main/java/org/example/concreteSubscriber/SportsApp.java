package org.example.concreteSubscriber;

import org.example.subscriber.InterfaceSubscriber;

public class SportsApp implements InterfaceSubscriber {
    private String appName;

    public SportsApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println(appName + " actualizó sus eventos deportivos según el clima: " + weatherUpdate);
    }

    @Override
    public boolean shouldNotify(String weatherUpdate) {
        return weatherUpdate.contains("tormenta");
    }
}
