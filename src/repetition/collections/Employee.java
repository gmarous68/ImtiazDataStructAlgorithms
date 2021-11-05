package repetition.collections;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private String dep;

    public Employee(String name, int salary, String dep) {
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dep='" + dep + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary < o.salary)
            return -1;
        else if(this.salary > o.salary)
          return 1;
        return 0;
    }
}