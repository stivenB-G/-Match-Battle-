/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.service;

/**
 *
 * @author Aprendiz
 */
import com.mycompany.prueba.models.Carta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartaService implements Repository<Carta>{
    private Connection conn;

    public CartaService(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Carta> listar() throws SQLException {
        List<Carta> cartas = new ArrayList<>();
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select c.car_id,c.car_nombre,c.car_altura,c.car_peso,c.car_fuerza,c.car_velocidad,c.car_ataqueEspecial,c.car_ataqueEspecialDaño,c.car_resistencia,c.car_iq,c.car_img,ca.cat_nombre from carta where c.cat_id=ca.cat_id")){
            while (rs.next()) {
                Carta carta = getCarta(rs);
                cartas.add(carta);
            }

        }
        return cartas;
    }

   
   

    private Carta getCarta(ResultSet rs) throws SQLException {
        Carta carta = new Carta();
        carta.setId(rs.getInt(1));
        carta.setNombre(rs.getString(2));
        carta.setAltura(rs.getString(3));
        carta.setPeso(rs.getString(4));
        carta.setFuerza(rs.getInt(5));
        carta.setVelocidad(rs.getInt(6));
        carta.setAtaqueEspecial(rs.getString(7));
        carta.setAtaqueEspecialDaño(rs.getInt(8));
        carta.setResistencia(rs.getInt(9));
        carta.setIq(rs.getInt(10));
        carta.setImagen(rs.getString(11));
        carta.setCate(rs.getString(12));
        
        return carta;
    }

    @Override
    public Carta porId(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardar(Carta t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}