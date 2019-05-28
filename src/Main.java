/**
 * program ma umożliwiać przepływ informacji o statusie i priorytecie zamówienia
 * pomiędzy działem księgowości, produkcji oraz managerem sprzedaży.
 * Przykład z życia wzięty.
 *
 */

import Notification.AccountigDept;
import Notification.ManufactureDept;
import Notification.SalesManager;
import Order.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order zamowienie = new Order(001L, OrderPriory.NORMALYNY, OrderStatus.OPŁACONE);

        AccountigDept accountigDept = new AccountigDept();
        SalesManager salesManager = new SalesManager();
        ManufactureDept manufactureDept = new ManufactureDept();

        zamowienie.registerObservator(accountigDept);
        zamowienie.registerObservator(salesManager);
        zamowienie.registerObservator(manufactureDept);

        zamowienie.notifyObservers();
    }
}
