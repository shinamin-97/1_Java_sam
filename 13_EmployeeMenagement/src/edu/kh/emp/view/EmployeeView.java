package edu.kh.emp.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.emp.model.service.EmployeeService;
import edu.kh.emp.model.vo.Employee;

public class EmployeeView {
	
	private Scanner sc = new Scanner(System.in);
	
	private EmployeeService service = new EmployeeService();
	
	public void Imformation() {
		
		int input = 0;
		
		do {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			
		try {
			
			System.out.println("메뉴 선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(input) {
			
			case 1 : addEmployee(); break;
			case 2 : selectAll(); break;
			case 3 : empIdSelect(); break;
			case 4 : updateEmployee(); break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 8 : break;
			case 0 : break;
			default : System.out.println("잘못 입력하셨습니다.");
			
			
			}
			
			System.out.println();
			
			
		} catch(InputMismatchException e) {
			
			
		}
			
			
		} while (input != 0);
		
		
	}
	
	public void addEmployee() {
		
		System.out.println("===== 새로운 사원 추가 =====");
		
		System.out.print("사원 번호 : ");
		int empId = sc.nextInt();
		
		System.out.print("이름 : ");
		String empName = sc.next();
		
		System.out.print("주민등록번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.print("부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("직급명 : ");
		String jobName = sc.next();
		
		System.out.print("급여 : ");
		int salay = sc.nextInt();
		
		if(service.addEmployee(empId, empName,empNo, email, phone, departmentTitle, jobName, salay)) {
			System.out.println("[추가 완료]");
		}else {
			System.out.println("[error] 사원 정보 추가 실패");
			
		}
	
	}
	
	private void selectAll () {
		
		List<Employee> empList = service.getEmpList();
		
		for(int i = 0 ; i < empList.size() ; i++) {
			
			System.out.println(empList.get(i));
		}
		
	}
	
	public void empIdSelect () {
		
		System.out.println("[사원 번호 조회]");
		
		System.out.println("사원 번호 : ");
		int empId = sc.nextInt();
		
		List<Employee> resultList = service.empIdSelect(empId);
		
		if(resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(Employee e : resultList) {
				System.out.println(e);
			}
		}
		
		
	}
	
	public void updateEmployee () {
		System.out.println("[사원 정보 수정]");
		
		System.out.print("사원 번호 : ");
		int idx = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 사원 번호 : ");
		int empId = sc.nextInt();
		
		System.out.print("수정할 이름 : ");
		String empName = sc.next();
		
		System.out.print("수정할 주민등록번호 : ");
		String empNo = sc.next();
		
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		System.out.print("수정할 전화번호 : ");
		String phone = sc.next();
		
		System.out.print("수정할 부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("수정할 직급명 : ");
		String jobName = sc.next();
		
		System.out.print("수정할 급여 : ");
		int salay = sc.nextInt();
		
		if(service.updateEmployee(idx, empId, empName, empNo, email, phone, departmentTitle, jobName, salay)) {
			
			System.out.println("성공");
		}else {
			System.out.println("실패(사원 번호 불일치)");
		}
		
		
	}
	
	public void removeEmployee () {
		
		System.out.println("[학생 정보 제거]");
		
		System.out.println("사원 ");
		
	}
	
	
	
	
	
	
	
	

}
