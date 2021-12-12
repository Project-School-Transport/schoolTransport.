package com.example.demo.Drive;

import javax.persistence.*;

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

    public Drive() {
    }

    public Drive(Long id, String fName, String lName, Long passWord, Long phoneNumber, Long platNumber) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.platNumber = platNumber;
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
}
