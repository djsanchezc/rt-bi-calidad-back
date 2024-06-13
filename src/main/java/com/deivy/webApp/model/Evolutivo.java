package com.deivy.webApp.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Evolutivo")
public class Evolutivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEvolutivo;

    @Column(name="idCalidad")
    private long idCalidad;

    @Column(name="date")
    private Date date;

    @Column(name="valor")
    private int valor;

    public Evolutivo(){};

    public Evolutivo(long idEvolutivo, long idCalidad, Date date, int valor) {
        this.idEvolutivo = idEvolutivo;
        this.idCalidad = idCalidad;
        this.date = date;
        this.valor = valor;
    }

    public long getIdEvolutivo() {
        return idEvolutivo;
    }

    public void setIdEvolutivo(long idEvolutivo) {
        this.idEvolutivo = idEvolutivo;
    }

    public long getIdCalidad() {
        return idCalidad;
    }

    public void setIdCalidad(long idCalidad) {
        this.idCalidad = idCalidad;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
