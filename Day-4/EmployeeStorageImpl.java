package day4;
import java.util.ArrayList;

public class EmployeeStorageImpl implements EmployeeStorage{
	ArrayList<Employee> ea;
	static int count=0;
	public EmployeeStorageImpl() {
		super();
		ea=new ArrayList<Employee>();
		
	}
	@Override
	public int save(Employee e) {
		ea.add(e);
		System.out.println(e);
		return e.getId();
	}
	@Override
	public Employee findEmployee(int eid) throws EmployeeNotFoundException {
		Employee e1=null;
		int count=0;
		for(Employee e:ea) {
			if(eid==e.getId()) {
				return e1=new Employee(e.getId(),e.getName(),e.getSalary());
			}else {
				count++;
			}
		}
		if(count==ea.size()) {
			throw new EmployeeNotFoundException("Employee not present");
		}
		return e1;
	}
	@Override
	public Employee[] findEmployees() {
		Employee[]e=ea.toArray(new Employee[ea.size()]);
		return e;
	}
	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		if(ea.size()==0) {
			System.out.println("No Employee Data");
		} else {
			for(Employee e:ea) {
				if(id==e.getId()) {
					ea.remove(e);
					System.out.println(e+"removed");
					count--;
					break;
				}else {
					count++;
				}
			}
		}
		if(count==ea.size()) {
			throw new EmployeeNotFoundException();
		}
		
	}
	

}
