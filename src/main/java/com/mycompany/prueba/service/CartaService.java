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
import java.util.Arrays;
import java.util.List;

public class CartaService implements Repository<Carta>{
    private Connection conn;

    public CartaService(Connection conn) {
        this.conn = conn;
    }

//    @Override
//    public List<Carta> listar() throws SQLException {
//        List<Carta> cartas = new ArrayList<>();
//        try(Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select *from carta")){
//            while (rs.next()) {
//                Carta carta = new Carta();
//                carta.setId(rs.getInt(1));
//                carta.setNombre(rs.getString(2));
//                carta.setAltura(rs.getString(3));
//                carta.setPeso(rs.getString(4));
//                carta.setFuerza(rs.getInt(5));
//                carta.setVelocidad(rs.getInt(6));
//                carta.setAtaqueEspecial(rs.getString(7));
//                carta.setAtaqueEspecialDaño(rs.getInt(8));
//                carta.setResistencia(rs.getInt(9));
//                carta.setIq(rs.getInt(10));
//                carta.setImagen(rs.getString(11));
//                //carta.setCate(rs.getString(12));
//                cartas.add(carta);
//            }
//
//        }
        //return cartas;
                 @Override  
                public List<Carta> listar() {
                return Arrays.asList(new Carta(1, "notebook"),new Carta(2, "mesa escritorio"));
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