package org.js.Reacttutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import java.util.Objects;

@Entity
public class Employee {

    private @Id
    @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee(){}

    public Employee(String firstName, String lastName, String description){
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee)  o;
        return Objects.equals(id, emp.id) &&
                Objects.equals(firstName, emp.firstName) &&
                Objects.equals(lastName, emp.lastName) &&
                Objects.equals(description, emp.description);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, firstName, lastName, description);
    }

    public Long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Employee{" +
                ", firstMame ='" + firstName + "'" +
                ", lastName='" + lastName + "'" +
                ", description ='" + description + "'" +
                "}";
    }
}
