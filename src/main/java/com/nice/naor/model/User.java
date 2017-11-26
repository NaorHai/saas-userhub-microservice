package com.nice.naor.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Haimov on 25/11/2017.
 */

@Entity
@Table(name = "USER")
public class User implements Serializable {
    private int _id;
    private String _name;
    private String _email;
    private String _address;
    private Date _join_date;


    public User(int _id, String _name, String _email, String _address) {
        this._id = _id;
        this._name = _name;
        this._email = _email;
        this._address = _address;
    }

    protected User(){}

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    @NotEmpty
    @Size(min=1, max=100)
    @Column(name = "name", nullable = false)
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    @NotEmpty
    @Size(min=5, max=100)
    @Column(name = "email")
    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    @NotEmpty
    @Size(min=2, max=100)
    @Column(name = "address")
    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    @Column(name = "join_date")
    @NotNull
    public Date get_join_date() {return _join_date;}

    public void set_join_date(Date _join_date) {
        this._join_date = _join_date;
    }
}
