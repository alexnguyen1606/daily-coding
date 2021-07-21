package designpattern.decoratorspattern.starbuckdecorator;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:28 PM ,March 23,2021
 */
public class BonusSunday extends Bonus {
    private Salary salary;
    @Override
    public Long getSalary() {
        return salary.getSalary();
    }
}
