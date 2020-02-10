#define PIN_ANALOG_RAIN_SENSOR A5  // Entrada analógica para la señal del sensor lluvia
#define PIN_DIGITAL_RAIN_SENSOR 5  // Entrada digital para la señal del sensor de lluvia
 
void setup(){
   Serial.begin(9600);
}
void loop(){
   int sensorValue = analogRead(PIN_ANALOG_RAIN_SENSOR); // Leer datos del puerto analógico
   Serial.print("Analog value: "); 
   Serial.println(sensorValue); // Salida de valor analógico al monitor de puerto
 
   sensorValue = digitalRead(PIN_DIGITAL_RAIN_SENSOR); // Leer datos del puerto digital
   Serial.print("Digital value: "); 
   Serial.println(sensorValue); // Salida del valor digital al monitor del puerto
 
   delay(1000); // Retardo entre mediciones
}
