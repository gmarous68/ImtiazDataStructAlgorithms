package Generics;

import java.util.ArrayList;
import java.util.List;

public class App2 {
	public static void main(String[] args) {

		Employee e = new Employee();
		Accountant a = new Accountant();
		e = a;

		ArrayList<?> emp = new ArrayList<>();
		ArrayList<Accountant> acc = new ArrayList<>();
		emp = acc;
		
		ArrayList<Employee> emp1 = new ArrayList<>();
		emp1.add(new Employee());
		ArrayList<Accountant> acc1 = new ArrayList<>();
		acc1.add(new Accountant());

		ArrayList<? extends Employee> emp2 = new ArrayList<>();
		ArrayList<Accountant> acc2 = new ArrayList<>();
		emp2 = acc2;
		
		ArrayList<? super Employee> emp3 = new ArrayList<>();
		ArrayList<Object> acc3 = new ArrayList<>();
		emp3 = acc3;

		makeEmpWork(acc1);
	}

	public static void makeEmpWork(List<? extends Employee> item) {
		for (Employee e : item)
			e.work();
	}
}
