package designpattern.observerpattern;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * January 11,2021
 */
public interface Subject extends Observer {
    void registerObserver();
    void removerObserver();
    void notifyObservers();
}
