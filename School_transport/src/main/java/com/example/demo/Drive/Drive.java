package com.example.demo.Drive;

import com.example.demo.School.School;
import com.example.demo.student.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String fname;
    private String lname;
    private Long passWord;
    private Long phoneNumber;
    private Long platNumber;
    private boolean isActiveAm ;
    private boolean isActivePm ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "drive")
    private List<Student> student = new ArrayList<>();


    @ManyToOne(fetch = FetchType.EAGER ,optional = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="school_id")
    private School school;

    public Drive() {
    }

    public Drive(Long id, String fname, String lname, Long passWord, Long phoneNumber, Long platNumber, boolean isActiveAm, boolean isActivePm, List<Student> student, School school) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.platNumber = platNumber;
        this.isActiveAm = isActiveAm;
        this.isActivePm = isActivePm;
        this.student = student;
        this.school = school;
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

    public boolean isActiveAm() {
        return isActiveAm;
    }

    public void setActiveAm(boolean activeAm) {
        isActiveAm = activeAm;
    }

    public boolean isActivePm() {
        return isActivePm;
    }

    public void setActivePm(boolean activePm) {
        isActivePm = activePm;
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

    @Override
    public String toString() {
        return "Drive{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", passWord=" + passWord +
                ", phoneNumber=" + phoneNumber +
                ", platNumber=" + platNumber +
                ", isActiveAm=" + isActiveAm +
                ", isActivePm=" + isActivePm +
                ", school=" + school +
                '}';
    }
}
