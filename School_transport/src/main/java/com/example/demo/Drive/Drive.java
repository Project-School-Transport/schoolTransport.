package com.example.demo.Drive;

import com.example.demo.School.School;
import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Drives")
public class Drive {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fName;
    private String lName;
    private Long passWord;
    private Long phoneNumber;
    private Long platNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students = new ArrayList<>();

//    @ManyToOne(cascade = CascadeType.ALL, mappedBy = "drive")
//    private List<School> school = new ArrayList<>();
    public Drive() {
    }

    public Drive(Long id, String fName, String lName, Long passWord, Long phoneNumber, Long platNumber, Collection<Student> students) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.platNumber = platNumber;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
