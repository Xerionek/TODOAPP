package com.code.model;

import jakarta.persistence.*;

@Entity // możliwość przypisania klasy do sqla oraz niby oraz tak w sumie ta reszta znaczników @table itp jest opcjonalna
@Table(name = "student") // inaczej będzie się nazywać Student bez name
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // w sensie że musi być primary key
    private int id;
    private String name;
    private String mobileNo;
    private int courseId; // nazwa pola = nazwa wpisywana do postmana dosłownie to samo
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


}
