package com.example.demo.students;

import javax.persistence.*;

@Entity
@Table(name = "Student")
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

    public Student() {
    }

    public Student(Long id, String fName, String lName, Long passWord, Long latitude, Long longitude, boolean isActiveAm, boolean isActivePm) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isActiveAm = isActiveAm;
        this.isActivePm = isActivePm;
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

    public boolean getisActiveAm() {
        return isActiveAm;
    }

    public void setActiveAm(boolean activeAm) {
        this.isActiveAm = activeAm;
    }

    public boolean getisActivePm() {
        return isActivePm;
    }

    public void setActivePm(boolean activePm) {
        this.isActivePm = activePm;
    }
}
