public class Manager implements IAllEmployee, IManager {
    @Override
    public void salary(){
        System.out.println("Getting the 'Manager' salary...");
    }

    @Override
    public void hire(){
        System.out.println("hire");
    }

    @Override
    public void train(){
        System.out.println("train");
    }

    @Override
    public void addBonus(){
        System.out.println("Getting the bonus at the end of the year...");
    }
}
