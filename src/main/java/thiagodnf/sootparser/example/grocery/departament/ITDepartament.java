package thiagodnf.sootparser.example.grocery.departament;

import java.util.ArrayList;
import java.util.List;

import thiagodnf.sootparser.example.grocery.employee.Employee;

public class ITDepartament {
	
	protected List<Employee> employees;
	
	protected long creationDate;
	
	protected long nextMaintanenceDate;
	
	public int numberOfComputers;
	
	public ITDepartament(){
		this.employees = new ArrayList<>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}

	public long getNextMaintanenceDate() {
		return nextMaintanenceDate;
	}

	public void setNextMaintanenceDate(long nextMaintanenceDate) {
		this.nextMaintanenceDate = nextMaintanenceDate;
	}	
}
