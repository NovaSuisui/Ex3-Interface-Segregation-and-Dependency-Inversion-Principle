public class CEO implements IAllEmployee, ICEO{
    @Override
    public void salary(){
        System.out.println("Getting the 'CEO' salary...");
    }

    @Override
    public void makeDecisions(){
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks(){
        System.out.println("Gettings shares of the company as bonus...");
    }

    @Override
    public void addBonus(){
        System.out.println("Getting the bonus at the end of the year...");
    }
}
