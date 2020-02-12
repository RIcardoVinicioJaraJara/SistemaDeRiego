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
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import panamahitek.PanamaHitek_Arduino;

/**
 *
 * @author Ricardo
 */
public final class ControladorArduino extends Thread {

    private static Persona persona;
    private static Riego riego;
    static int cont = 0;
    private final String puerto = "COM3";
    private static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    private static ControladorRiego controladorRiego = new ControladorRiego();
    private static SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {

            try {
                if (Arduino.isMessageAvailable()) {
                    String txt = Arduino.printMessage();
                    String humedad[] = txt.split("#");
                    String temperatura[] = txt.split("%");
                    String lluvia[] = txt.split("&");
                    String regadera[] = txt.split("@");

                    Calendar fe = Calendar.getInstance();
                    String fecha = fe.get(Calendar.YEAR) + "/" + (fe.get(Calendar.MONTH) + 1) + "/" + fe.get(Calendar.DAY_OF_MONTH);
                    String hora = fe.get(Calendar.HOUR) + ":" + fe.get(Calendar.MINUTE) + ":" + fe.get(Calendar.SECOND);
                    riego = new Riego(0, temperatura[1], humedad[1], regadera[1], lluvia[1], fecha, hora, persona);
                    if (cont >= 10) {
                        controladorRiego.createRiego(riego);
                        System.out.println("ingresado0000000000000000000oooooo");
                        cont = 0;
                    }

                    cont++;

                    System.out.println(txt);
                    Thread.sleep(1000);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    };

    ;

    public static Riego getRiego() {
        return riego;
    }

    public static void setRiego(Riego riego) {
        ControladorArduino.riego = riego;
    }

    public ControladorArduino(Persona persona) {

        // conectar();
        riego = new Riego();
        controladorRiego = new ControladorRiego();
        this.persona = persona;

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

    public static PanamaHitek_Arduino getArduino() {
        return Arduino;
    }

    public static void setArduino(PanamaHitek_Arduino Arduino) {
        ControladorArduino.Arduino = Arduino;
    }

    public static SerialPortEventListener getListener() {
        return listener;
    }

    public static void setListener(SerialPortEventListener listener) {
        ControladorArduino.listener = listener;
    }

}
