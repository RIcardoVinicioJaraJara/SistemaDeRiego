int luzValue = 0;
int lluvValue = 0;
int humeValue = 0;
int lluvia;
int luz;
int humedad;
int regarPin = 2;
int sensorHumedad = A5;
int sensorLuz = A0;
int sensorLluvia = A15;
void setup() {
pinMode(regarPin, OUTPUT);
Serial.begin(9600); 
}
void loop() {
luzValue = analogRead(sensorLuz);
lluvValue = analogRead(sensorLluvia);
humeValue = analogRead(sensorHumedad);
delay(1500);
// ----------------------------------------------------
// Imprimir valores
// ----------------------------------------------------
lluvia=(100.0*lluvValue)/1024;
Serial.print("Lluvia:");
Serial.print(lluvia);
Serial.println(" C");
luz=(100.0*luzValue)/1024;
Serial.print("Luz:");
Serial.print(luz);
Serial.println("%");
humedad=(100.0*humeValue)/1024;
Serial.print("Humedad:");
Serial.println(humedad);
Serial.println("=======================================================================");
// ----------------------------------------------------
// Chequeo si debo regar
// ----------------------------------------------------
if (lluvia == HIGH) {
      Serial.println("NO Detectada lluvia");
  
if( humedad <= 50 && luz > 70 ) {
digitalWrite(regarPin, HIGH);
Serial.println("Debe regar");
}
}
else{
digitalWrite(regarPin, LOW);
Serial.println("NO debe regar");
}
Serial.println("=======================================================================");
}
