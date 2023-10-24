package demoapis.demo.service;

import demoapis.demo.dto.UpdateEmployeeRequest;
import demoapis.demo.repository.EmployeeRepository;
import demoapis.demo.dto.CreateEmployeeRequest;
import demoapis.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    //DAO : data access object
   @Autowired
    EmployeeRepository employeeRepository;
    public Employee create(CreateEmployeeRequest createEmployeeRequest){
        Employee employee = createEmployeeRequest.to();
        return  employeeRepository.create(employee);
    }

    public Employee get(String id) {
        return  employeeRepository.get(id);
    }

    public List<Employee> get() {
        return employeeRepository.get();
    }

    public Employee update(String employeeId, UpdateEmployeeRequest request) {
        Employee employee = request.to(employeeId);
        return employeeRepository.update(employee);
    }

    public Employee delete(String employeeId) {
        return employeeRepository.delete(employeeId);
    }
}
