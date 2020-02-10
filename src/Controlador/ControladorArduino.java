/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.Riego;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Date;
import panamahitek.PanamaHitek_Arduino;

/**
 *
 * @author Ricardo
 */


public final class ControladorArduino {
    private Riego riego;
    private final String puerto = "COM3";
    private static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    private static SerialPortEventListener listener ;
    public ControladorArduino(Persona persona) {
        riego = new Riego();
        listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (Arduino.isMessageAvailable()) {
                    String txt = Arduino.printMessage();
                    int loc = txt.indexOf("Humedad");
                    
                    String humedad = txt.substring(loc,5);
                    loc = txt.indexOf("Lluvia");
                    
                    String lluvia = txt.substring(loc,5);
                    loc = txt.indexOf("Luz");
                    String temperatura = txt.substring(loc,5);
                    
                    Date fecha = new Date();
                    String fe = fecha.getYear() +"/" + fecha.getMonth() + "/" + fecha.getDay();
                    Riego riego = new Riego(0,temperatura,humedad,"0","0",lluvia,fe,persona);
                    System.out.println();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    };
    }

    public boolean conectar() {
        try {
            Arduino.arduinoRXTX(puerto, 9600, listener);
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
