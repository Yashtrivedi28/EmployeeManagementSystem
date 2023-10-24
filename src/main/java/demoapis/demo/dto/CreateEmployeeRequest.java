package demoapis.demo.dto;

import demoapis.demo.model.Address;
import demoapis.demo.model.Department;
import demoapis.demo.model.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.UUID;
//@RestController
@Getter
@Setter
public class CreateEmployeeRequest {  //DTO
    @NotEmpty
    @NotBlank
    private String name;
    @Min(18)
    @Max(60)
    private int age;
    @NotNull
    private Department department;
    private Address address;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//convert DTO -> MODEL
    public Employee to() {
//        Employee employee = new Employee();
//        employee.setName(this.name);
////        Address add = new Address();
////        add.se
//        employee.setAddress(this.address);
//        employee.setAge(this.age);
//        employee.setDepartment(this.department);
//
//        employee.setCreatedOn(System.currentTimeMillis());
//        employee.setUpdatedOn(System.currentTimeMillis());
//        employee.setId(UUID.randomUUID().toString());//unique

        //@builder action
        //Employee employee=Employee.builder().build();
        //return employee;
        //or
        return Employee.builder()
                .name(this.name)
                .age(this.age)
                .address(this.address)
                .department(this.department)
                .createdOn(System.currentTimeMillis())
                .updatedOn(System.currentTimeMillis())
                .id(UUID.randomUUID().toString())
                .build();


    }
}
