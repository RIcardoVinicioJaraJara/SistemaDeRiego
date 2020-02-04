/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Riego;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import panamahitek.PanamaHitek_Arduino;

/**
 *
 * @author Ricardo
 */


public final class ControladorArduino {
    private Riego riego;
    private final String puerto = "COM3";
    private static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    private static final SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (Arduino.isMessageAvailable()) {
                    //Se imprime el mensaje recibido en la consola
                    System.out.println(Arduino.printMessage());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    };
    public ControladorArduino() {
        riego = new Riego();
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
