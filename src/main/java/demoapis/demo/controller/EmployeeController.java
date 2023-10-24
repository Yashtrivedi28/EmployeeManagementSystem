package demoapis.demo.controller;

import demoapis.demo.dto.CreateEmployeeRequest;
import demoapis.demo.dto.UpdateEmployeeRequest;
import demoapis.demo.service.EmployeeService;
import demoapis.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    //CRUD APIs:- Employee Management's
    //create
    //read
    //update
    //delete
    @Autowired
    EmployeeService employeeService;

    //insert  @Valid :- constraint doesn't catch by spring
    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody @Valid CreateEmployeeRequest request){
        return employeeService.create(request);
    }

    //specific emp get
     @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") String id){
        return employeeService.get(id);
     }

     //get all emp
    @GetMapping("/employee/all")
    public List<Employee> getEmployees(){
        return employeeService.get();
    }

    // Diff b/w Put and Patch
    @PutMapping("/employee/{empId}")
    public Employee updateEmployee(@PathVariable("empId") String employeeId,
                                   @RequestBody  UpdateEmployeeRequest request){
        return employeeService.update(employeeId, request);
    }
    @DeleteMapping("/employee")
    public Employee deleteEmployee(@RequestParam("id") String employeeId){
        return employeeService.delete(employeeId);
    }
//    Dont define similar APIs in the server   52| 61:lines
//    @PutMapping("/employee/{id}")
//    public Employee updateEmployee2(@RequestParam("employeeId") String employeeId,
//                                   @RequestBody UpdateEmployeeRequest request){
//        return employeeService.update(employeeId, request);
//    }
}
