
#define sensor 20
 
void setup(){
  Serial.begin(9600);
}
 
void loop(){
  
  //Se hace la lectura analoga del pin A0 (sensor) y se pasa por la funcion
  //map() para ajustar los valores leidos a los porcentajes que queremos utilizar   
  int valorHumedad = digitalRead(sensor);
  
  Serial.print("Humedad: ");
  Serial.print(valorHumedad);
  Serial.println("%");
 
  delay(100);
}
