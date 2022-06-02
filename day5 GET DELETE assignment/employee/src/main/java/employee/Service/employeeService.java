package employee.Service;

import java.util.List;

import employee.bean.Message;

public interface employeeService {
	Message addmessage(Message Message);
	
	List<Message> getAllListemployee();
	Message updateMessage(Message Message,long id);
	void deleteMessageByID(long id);

}
