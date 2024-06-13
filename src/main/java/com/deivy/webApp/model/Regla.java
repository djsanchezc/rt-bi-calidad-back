package com.deivy.webApp.model;

import jakarta.persistence.*;

@Entity
@Table(name="REGLA")
public class Regla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="control")
    private String control;

    @Column(name="universe")
    private String universe;

    @Column(name="variation")
    private String variation;

    @Column(name="oc")
    private String oc;

    @Column(name="quality")
    private String quality;

    public Regla(){};

    public Regla(String name, String type, String control, String universe, String variation, String oc, String quality) {
        this.name = name;
        this.type = type;
        this.control = control;
        this.universe = universe;
        this.variation = variation;
        this.oc = oc;
        this.quality = quality;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
