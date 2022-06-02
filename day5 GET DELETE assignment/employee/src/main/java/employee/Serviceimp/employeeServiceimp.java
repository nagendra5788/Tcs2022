package employee.Serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee.Repository.MyEmployeeRepository;
import employee.Service.employeeService;
import employee.bean.Message;



@Service
public class employeeServiceimp implements employeeService {
	
	@Autowired
	MyEmployeeRepository myEmployeeRepository;

	
	public Message addmessage(Message Message) {
		// TODO Auto-generated method stub
		Message emp = myEmployeeRepository.save(Message);
		return emp;
	}

	
	public List<Message> getAllListemployee() {
		// TODO Auto-generated method stub
		List<Message> listOfemployees = myEmployeeRepository.findAll();
		return listOfemployees;
	}


	public Message updateMessage(Message Message, long id) {
		Message.setEmployeeid(id);
		Message updateMessage = myEmployeeRepository.save(Message);
		return updateMessage;
	}

	@Override
	public void deleteMessageByID(long id) {
		// TODO Auto-generated method stub
		myEmployeeRepository.deleteById(id);
		
	}

}
