package practice.leetcode;

import java.util.HashMap;
import java.util.List;

public class EmployeeImportance690 {
	HashMap<Integer, Employee> emps = new HashMap<Integer, Employee>();

	public int getImportance(List<Employee> employees, int id) {
		int sum = 0;
		Employee employee = null;
		for (Employee emp : employees) {
			emps.put(emp.id, emp);
			if (emp.id == id)
				employee = emp;
		}
		sum = sum + employee.importance + getSubImp(employee.subordinates);
		return sum;
	}

	public int getSubImp(List<Integer> subId) {
		int sum = 0;
		if (subId == null)
			return sum;
		for (int id : subId) {
			sum = sum + emps.get(id).importance + getSubImp(emps.get(id).subordinates);
		}
		return sum;
	}
}

class Employee {
	// It's the unique id of each node;
	// unique id of this employee
	public int id;
	// the importance value of this employee
	public int importance;
	// the id of direct subordinates
	public List<Integer> subordinates;
};