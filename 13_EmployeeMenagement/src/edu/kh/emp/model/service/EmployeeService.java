package edu.kh.emp.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.emp.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<Employee>();
	
	public EmployeeService() {
		empList.add(new Employee(10, "신아민", "970801", "qnrlgkals@naver.com", "010-4609-3721", "관리과", "대리", 200));
		empList.add(new Employee(20, "신아엘", "950109", "tlsdkdpf@naver.com", "010-2307-2795", "인사과", "차장", 300));
		empList.add(new Employee(30, "신정훈", "660915", "shin660915@naver.com", "010-9569-3721", "총무과", "부장", 400));
		empList.add(new Employee(40, "나희숙", "650515", "없음", "010-9943-3721", "비서과", "과장", 400));
	
	
	
	}
	
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone, 
			String departmentTitle, String jobName, int salay ) {

		Employee emp = new Employee(empId, empName, empNo, email, phone, departmentTitle, jobName, salay);
		
		return empList.add(emp);
		
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public List<Employee> empIdSelect(int empId) {
		List<Employee> resultList = new ArrayList<Employee>();
		
		for(Employee e : empList) {
			if(e.getEmpId() == empId) {
				resultList.add(e);
			}
		}
		return resultList;
	}
	
	public boolean updateEmployee(int idx, int empId, String empName, String empNo, String email, String phone, 
			String departmentTitle, String jobName, int salay) {
		
		if( idx != empId) {
			return false;
		} else {
			
			empList.get(idx).setEmpId(empId);
			empList.get(idx).setEmpName(empName);
			empList.get(idx).setEmpNo(empNo);
			empList.get(idx).setEmail(email);
			empList.get(idx).setPhone(phone);
			empList.get(idx).setDepartmentTitle(departmentTitle);
			empList.get(idx).setJobName(jobName);
			empList.get(idx).setSalary(salay);
			
			return true;
			
		}
		
		
	}
	
	public Employee removeEmployee(int idx) {
		if(idx < 0 || idx >= empList.size()) {
			return null;
		}else {
		
			return empList.remove(idx);
		}
		
		
	}
	
	
}
