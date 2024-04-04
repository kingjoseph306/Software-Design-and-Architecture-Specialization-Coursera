/**
 * @author Joseph on 12/14/2023
 */

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}