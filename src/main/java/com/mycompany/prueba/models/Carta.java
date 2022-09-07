/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.models;

/**
 *
 * @author Aprendiz
 */
public class Carta {
private int id;
private String nombre;
private String altura;
private String peso;
private int fuerza;

    
private int velocidad;
private String ataqueEspecial;
private int ataqueEspecialDaño;
private int Resistencia;
private int iq;
private String imagen;
private String categoria; 

    public Carta(int i, String shaka) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Carta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getAtaqueEspecialDaño() {
        return ataqueEspecialDaño;
    }

    public void setAtaqueEspecialDaño(int ataqueEspecialDaño) {
        this.ataqueEspecialDaño = ataqueEspecialDaño;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getCate() {
        return this.categoria;
    }

    public void setCate(String categoria) {
        this.categoria = categoria;
    }
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


}
