public class Main {
    public static void main(String[] args) {
        // DO NOT MODIFY THIS FILE!

        // 1. Create a standard Employee
        Employee worker = new Employee("John Doe", 50000.0);
        System.out.println(worker.getName() + " earns $" + worker.getSalary());

        // 2. Create a Manager (Notice they have 3 arguments!)
        Manager boss = new Manager("Jane Smith", 80000.0, 15000.0);
        
        // 3. The boss inherits getName() from Employee, but uses its own compensation method!
        System.out.println(boss.getName() + " earns a total of $" + boss.calculateTotalCompensation());
    }
}
