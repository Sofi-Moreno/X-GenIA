/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Usuario;
import View.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sofia Moreno
 */ 
public class Controlador implements ActionListener, MouseListener{
    Login log = new Login();
    Usuario user = new Usuario();
    
    
    public int validacionLogin(String usuario, String pass){
        int validar=0;
        boolean u=false, p=false, total=false;
        u = user.validarUsuarioContraseña(usuario,"usuario");
        p = user.validarUsuarioContraseña(pass,"contraseña");
        if(u==true){
           validar = 1;
            
        } else if(p==true) {
            validar = 2;
        }
        if(u==true && p==true){
            validar = 3;
        }
        return validar;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
