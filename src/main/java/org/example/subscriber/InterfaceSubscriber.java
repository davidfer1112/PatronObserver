package org.example.subscriber;

public interface InterfaceSubscriber {
    void update(String weatherUpdate);
    boolean shouldNotify(String weatherUpdate); // Nuevo método para definir los criterios
}