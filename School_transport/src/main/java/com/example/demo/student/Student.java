package com.example.demo.student;

import com.example.demo.Drive.Drive;
import com.example.demo.School.School;
import com.example.demo.User.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String fName;
    private String lName;
    private Long passWord;
    private float latitude;
    private float longitude;
    private boolean isActiveAm = true;
    private boolean isActivePm = true;

    @ManyToOne(fetch = FetchType.LAZY ,optional = true)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="drive_id")
    private  Drive  drive;


    @ManyToOne (fetch = FetchType.EAGER,optional = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="school_id")
    private School school;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    public Student() {
    }


    public Student(Long id, String username, String fName, String lName, Long passWord, float latitude, float longitude, boolean isActiveAm, boolean isActivePm, Drive drive, School school, User user) {
        this.id = id;
        this.username = username;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isActiveAm = isActiveAm;
        this.isActivePm = isActivePm;
        this.drive = drive;
        this.school = school;
        this.user = user;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
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
}
