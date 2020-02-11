/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorArduino;
import Controlador.ControladorRiego;
import java.util.List;

/**
 *
 * @author vinic
 */
public class NewClass {

    public static void main(String[] args) {
        ControladorRiego conri = new ControladorRiego();
        List lista = conri.findCout();
        System.out.println(lista.get(0));
        
    }

}
