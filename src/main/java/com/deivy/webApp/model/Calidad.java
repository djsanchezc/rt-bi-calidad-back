package com.deivy.webApp.model;

import jakarta.persistence.*;

@Entity
@Table(name="CALIDAD")
public class Calidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="quality")
    private int quality;

    @Column(name="rule")
    private int rule;

    @Column(name="type")
    private String type;

    @Column(name="state")
    private String state;

    public Calidad(){}

    public Calidad(String name, int quality, int rule, String type, String state){
        this.name = name;
        this.quality = quality;
        this.rule = rule;
        this.type = type;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getRule() {
        return rule;
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
