public class Employee implements Comparable<Employee>{

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.id + " "+ this.name + " " + this.salary;
    }

    @Override
    public int compareTo(Employee o){
        if (this.id - o.id == 0){
            return this.name.compareTo(o.name); // compareTo string metodundan geliyor
        }
        return this.id - o.id;
    }
    
}




