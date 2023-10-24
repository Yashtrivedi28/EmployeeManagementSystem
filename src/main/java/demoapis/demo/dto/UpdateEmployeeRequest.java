package demoapis.demo.dto;

import demoapis.demo.model.Address;
import demoapis.demo.model.Department;
import demoapis.demo.model.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UpdateEmployeeRequest {
   // @NotBlank
    private String name;


    @Min(18)
    @Max(60)
    private int age;

    @NotNull
    private Department department;

    private Address address;
    public Employee to(String employeeId) {
//        Employee employee = new Employee();
//        employee.setName(this.name);
//        employee.setAddress(this.address);
//        employee.setAge(this.age);
//        employee.setDepartment(this.department);
//
//       // employee.setCreatedOn(System.currentTimeMillis());
//        employee.setUpdatedOn(System.currentTimeMillis());
//        employee.setId(employeeId);
//       // employee.setId(UUID.randomUUID().toString());//unique
        //@builder action required here
        Employee employee=Employee.builder().build();

        return employee ;
    }
//    public Employee to(String employeeId){
//
//        return Employee.builder()
//                .name(this.name)
//                .age(this.age)
//                .department(this.department)
//                .address(this.address)
//                .updatedOn(System.currentTimeMillis())
//                //.id(employeeId)
//                .build();
//    }
}
