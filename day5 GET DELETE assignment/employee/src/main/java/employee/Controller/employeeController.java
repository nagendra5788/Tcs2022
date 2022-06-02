package employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employee.Service.employeeService;
import employee.bean.Message;

@RestController
public class employeeController {
	
	
	
	@Autowired
	employeeService EmployeeService;
	
	
	@PostMapping(value="/createemployee")
	Message createemployee(@RequestBody Message Mess) {
		Message M= EmployeeService.addmessage(Mess);
		System.out.println(" employeename ->>>>>>>>" + M.getEmployeename());
		System.out.println(" employeesalary ->>>>>>>>" + M.getEmployeesalary());
		return M;
		
	}
	
	@GetMapping(value="/viewallofemployees")
	List<Message> viewAllListOfEmployees() {
		return EmployeeService.getAllListemployee();
	}
	
	@PutMapping(value = "/updateemployee/{id}")
	Message updateemployee(@RequestBody Message udateemployee,@PathVariable long id) {
		Message updatedDetails = EmployeeService.updateMessage(udateemployee, id);
		return updatedDetails;
	}
	@DeleteMapping(value = "/deleteemployeebyid/{employeeid}")
	ResponseEntity<String> deleteMesaageBy(@PathVariable long employeeid) {
		
		
		
		try {
			if(employeeid ==0) {
				return ResponseEntity.ok("pls enter in proper id" + employeeid);
			}
			EmployeeService.deleteMessageByID(employeeid);
			return ResponseEntity.ok("Sucessfully deleted " + employeeid);
		} catch (Exception e) {
			return ResponseEntity.ok(" employee id does not exsists " + employeeid);
		}
	}
}
