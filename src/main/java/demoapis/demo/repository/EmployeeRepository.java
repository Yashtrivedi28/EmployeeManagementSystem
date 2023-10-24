package demoapis.demo.repository;

import demoapis.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
@Repository   //or Compponent-> just for watching purpose
public class EmployeeRepository {  //DAO data access object (EmployeeDAO)-> EmployeeRepository
    //which DS we can use :-
    //List :(search costly) :-> O(n)
    //hashMap: key :empId, value: employee

    private HashMap<String, Employee> employeeHashMap= new HashMap<>();

    public Employee create(Employee employee){
         employeeHashMap.put(employee.getId(),employee);
         return employee;
    }

    public Employee get(String id) {
//        return  employeeHashMap.getOrDefault(id,null);
        return  employeeHashMap.get(id);
    }

    public List<Employee> get() {
        return employeeHashMap.values()
                .stream()
                .collect(Collectors.toList());
        //return null;
    }

    public Employee update(Employee employee) {

        Employee existingEmployee = employeeHashMap.get(employee.getId());
        if(existingEmployee != null){
            // merge existing as well as old data
            employee = merge(existingEmployee, employee);
            employeeHashMap.put(employee.getId(), employee) ;
        }
        return employee;
    }
    // You should some library / dependency to do merging of java / json objects
    private Employee merge(Employee oldData, Employee newData){
        newData.setCreatedOn(oldData.getCreatedOn());
        return newData;
    }

    public Employee delete(String employeeId) {

        return employeeHashMap.remove(employeeId);
    }
}
