package com.codegym.model;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    @Size(min = 2, max = 30)
    private String firstName;
    @Size(min = 2,max = 30)
    private String lastName;

    @Min(18)
    private int age;
    @Pattern(regexp="(^$|[0-9]{10,11})*$",message = "must has 10 or 11 number")
    private String phoneNumber;
    @Pattern(regexp = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$",message = "not validator")
    private String email;
    @OneToMany(targetEntity = User.class)
    private List<User> users;
    public User(){

    }
    public User(String firstName,String lastName,int age,String phoneNumber,String email) {
        this.firstName=firstName;
        this.lastName =lastName;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
