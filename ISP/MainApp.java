public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mng = new Manager();
        CEO ceo = new CEO();
        System.out.println("Normal Employee");
        emp.salary();
        System.out.println("Manager");
        mng.salary();
        mng.hire();
        mng.train();
        mng.addBonus();
        System.out.println("CEO");
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();
        ceo.addBonus();
    }
}
