package demoapis.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Employee {
    private String id;
    private String name;
    private int age;
    private Department department;
    private Address address;
    private Long createdOn;
    private Long updatedOn;
//    public Long getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(Long createdOn) {
//        this.createdOn = createdOn;
//    }
//
//    public Long getUpdatedOn() {
//        return updatedOn;
//    }
//
//    public void setUpdatedOn(Long updatedOn) {
//        this.updatedOn = updatedOn;
//    }
//

//
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
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

//    public Employee(String id, String name, int age, Department department, Address address, Long createdOn, Long updatedOn) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.department = department;
//        this.address = address;
//        this.createdOn = createdOn;
//        this.updatedOn = updatedOn;
//    }

//public Employee(){
//
//}
}
