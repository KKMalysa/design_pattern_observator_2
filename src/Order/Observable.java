package Order;

import Notification.Observer;

public interface Observable {

     void registerObservator(Observer observer);
     void unregisterObservator(Observer observer);
     void notifyObservers();
}
