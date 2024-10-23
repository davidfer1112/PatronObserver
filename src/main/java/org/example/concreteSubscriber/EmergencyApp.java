package org.example.concreteSubscriber;

import org.example.subscriber.InterfaceSubscriber;

public class EmergencyApp implements InterfaceSubscriber {
    private String appName;

    public EmergencyApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String weatherUpdate) {
        System.out.println(appName + " activó notificaciones de emergencia debido al clima: " + weatherUpdate);
    }

    @Override
    public boolean shouldNotify(String weatherUpdate) {
        return weatherUpdate.contains("tormenta severa") || weatherUpdate.contains("emergencia");
    }
}
