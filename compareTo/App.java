import java.util. Arrays;

public class App {
    public static void main(String[] args) throws Exception{

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ali", 123, 10000);
        employees[1] = new Employee("Veli", 3213, 20000);
        employees[2] = new Employee("Seher", 34511, 15000);
        employees[3] = new Employee("Elif", 5422, 14000);
        employees[4] = new Employee("Sema", 435, 33000);
        Arrays.sort(employees);
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }


}