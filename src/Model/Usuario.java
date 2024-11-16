/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia Moreno
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    protected boolean acceso;

//    public static void main(String[] args){
//        Usuario us = new Usuario();
//        us.setNombre("Ricardo");
//        us.setApellido("Barrios");
//        us.setUsuario("rabarrios");
//        us.setContraseña("w4r5g");
//        us.imprimirUsuario();
//    }
    
    public Usuario(){
        nombre = "";
        apellido = "";
        usuario = "";
        contraseña="";
        acceso=false;
        System.out.println("Usuario creado con exito.");
    }
    
    public boolean validarUsuarioContraseña(String user, String colum){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        Statement stmt;
        ResultSet rs;
        boolean bol = false;
        String sql = "SELECT * FROM usuario";
        try{
            stmt = conex.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                if(user == rs.getString(colum)){
                    bol = true;
                }
            }
        }catch(SQLException ex){
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return bol;
    }
    
    
    public void registrarUsuario(){
        
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }
    
    
}
