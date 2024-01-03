package com.code.model;

import jakarta.persistence.*;

@Entity // możliwość przypisania klasy do sqla oraz niby oraz tak w sumie ta reszta znaczników @table itp jest opcjonalna
@Table(name = "ToDo") // inaczej będzie się nazywać Student bez name
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // w sensie że musi być primary key
    private int id; //status tytuł opis data dodania, data do wykonania

    private boolean status;
    private String tytul;
    private String opis;

    private String data_dodania;

    private String data_do_wykonania;
   // private int courseId; // nazwa pola = nazwa wpisywana do postmana dosłownie to samo
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getData_dodania() {
        return data_dodania;
    }

    public void setData_dodania(String data_dodania) {
        this.data_dodania = data_dodania;
    }

    public String getData_do_wykonania() {
        return data_do_wykonania;
    }

    public void setData_do_wykonania(String data_do_wykonania) {
        this.data_do_wykonania = data_do_wykonania;
    }


   /* public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public int getCourseId() {
        return courseId;
    }*/
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    /*private String name;
    private String mobileNo;

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
    }*/


}
