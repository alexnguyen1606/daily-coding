package designpattern.adapter.simplifyadapter;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 5:15 PM ,January 20,2021
 */
public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WIldTurkey();
        Duck duck = new DuckAdapter(turkey);
        duck.fly();
        duck.quack();
    }
}
