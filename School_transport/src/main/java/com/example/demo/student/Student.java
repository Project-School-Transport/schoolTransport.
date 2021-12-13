package com.example.demo.student;

import com.example.demo.Drive.Drive;
import com.example.demo.School.School;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fName;
    private String lName;
    private Long passWord;
    private Long latitude;
    private Long longitude;
    private boolean isActiveAm = true;
    private boolean isActivePm = true;

    @ManyToOne(fetch = FetchType.LAZY ,optional = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="drive_id")
    private  Drive  drive;





//    @JsonIgnore
//    @ManyToMany(mappedBy = "students")
//    private Collection<Drive> drives = new ArrayList<>();


    @ManyToOne (fetch = FetchType.EAGER,optional = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="school_id")
    private School school;

    public Student() {
    }

    public Student(Long id, String fName, String lName, Long passWord, Long latitude, Long longitude, boolean isActiveAm, boolean isActivePm, Drive drive, School school) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isActiveAm = isActiveAm;
        this.isActivePm = isActivePm;
        this.drive = drive;
        this.school = school;
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

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public boolean isActiveAm() {
        return isActiveAm;
    }

    public void setActiveAm(boolean activeAm) {
       this.isActiveAm = activeAm;
    }

    public boolean isActivePm() {
        return isActivePm;
    }

    public void setActivePm(boolean activePm) {
        this.isActivePm = activePm;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", passWord=" + passWord +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", isActiveAm=" + isActiveAm +
                ", isActivePm=" + isActivePm +
                ", school=" + school +
                '}';
    }
}
