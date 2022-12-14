/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.controllers;

import com.mycompany.prueba.models.Carta;
import com.mycompany.prueba.service.CartaService;
import com.mycompany.prueba.util.ConexionBaseDatos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/index")
public class IndexController extends HttpServlet {
    ConexionBaseDatos conn=new ConexionBaseDatos();
   
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CartaService cs=new CartaService((Connection) conn);
        List<Carta> cartas=new ArrayList<>();
        cartas=cs.listar();
        req.setAttribute("cartas", cartas);
        req.setAttribute("titulo", "Hola mundo");
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}