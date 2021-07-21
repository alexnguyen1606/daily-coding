package designpattern.observerpattern.weathernotify;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 4:09 PM ,January 11,2021
 */
public interface Subjects {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObservers();
}
