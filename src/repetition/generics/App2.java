package repetition.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        ArrayList<Accountant> acc = new ArrayList<>();
        emp.add(new Employee());
        acc.add(new Accountant());
        makeEmpWork(emp);
        makeEmpWork(acc);
    }

    public static void makeEmpWork(List<? extends Employee> emp) {
        Iterator<? extends Employee> empIt = emp.iterator();
        while(empIt.hasNext())
            empIt.next().work();
    }
}