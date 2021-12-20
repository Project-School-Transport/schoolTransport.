package com.example.demo.Drive;

import com.example.demo.School.School;
import com.example.demo.User.User;
import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Drives")
public class Drive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String fname;
    private String lname;
    private Long passWord;
    private Long phoneNumber;
    private Long platNumber;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "drive")
    private List<Student> student = new ArrayList<>();


    @ManyToOne(fetch = FetchType.EAGER ,optional = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="school_id")
    private School school;
    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    public Drive() {

    }

    public Drive(Long id, String fname, String lname, Long passWord, Long phoneNumber, Long platNumber, List<Student> student, School school, User user) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.platNumber = platNumber;
        this.student = student;
        this.school = school;
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Long getPassWord() {
        return passWord;
    }

    public void setPassWord(Long passWord) {
        this.passWord = passWord;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPlatNumber() {
        return platNumber;
    }

    public void setPlatNumber(Long platNumber) {
        this.platNumber = platNumber;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
