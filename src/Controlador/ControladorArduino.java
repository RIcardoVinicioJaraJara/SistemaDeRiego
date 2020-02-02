/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import panamahitek.PanamaHitek_Arduino;

/**
 *
 * @author Ricardo
 */


public final class ControladorArduino {

    private final String puerto = "COM3";
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();

    public ControladorArduino() {
    }

    public boolean conectar() {
        try {
            Arduino.arduinoTX(puerto, 9600);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean desconetar() {
        try {
            Arduino.killArduinoConnection();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean enviarDatos(String dato) {
        try {
            Arduino.sendData(dato);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
