//Valibarles  Huemedad
int ledTemCali = 2;
int ledTemNorm = 3;
int ledTemFrio = 4;
int rele = 10;
String lluviaa = "";
String humedadd = "";
String regadera = "INACTIVA";

float temperaturaC;


//Lluviia
int ledLluviaSi = 5;
int ledLluviaNo = 6;
int pinTempera =  A0;
//#define pinHumedad A5

int pinLluvia = 21;
int pinHumead = 20;
float lluvia;
int input;


void setup() {
  Serial.begin(9600);

  pinMode(ledTemCali, OUTPUT);
  pinMode(ledTemNorm, OUTPUT);
  pinMode(ledTemFrio, OUTPUT);
  pinMode(ledLluviaSi, OUTPUT);
  pinMode(rele, OUTPUT);
  pinMode(pinLluvia, INPUT);
  pinMode(pinHumead, INPUT);
  digitalWrite(rele , HIGH);

}

void loop() {
  
  temperaturaC = analogRead(pinTempera);
  lluvia = digitalRead(pinLluvia);
  int valorHumedad = digitalRead(pinHumead);

  if (lluvia == 0) {
    lluviaa = "SI";
    digitalWrite(ledLluviaSi , HIGH);
    digitalWrite(ledLluviaNo , LOW);
  } else {
    lluviaa = "NO";
    digitalWrite(ledLluviaNo , HIGH);
    digitalWrite(ledLluviaSi , LOW);
  }


  temperaturaC = (5.0 * temperaturaC * 100.0) / 1024.0;
  if (temperaturaC < 20 ) {
    digitalWrite(ledTemFrio , HIGH);
    digitalWrite(ledTemCali , LOW);
    digitalWrite(ledTemNorm , LOW);
  } else if (temperaturaC >= 20 && temperaturaC < 30) {
    digitalWrite(ledTemNorm , HIGH);
    digitalWrite(ledTemCali , LOW);
    digitalWrite(ledTemFrio , LOW);
  } else {
    digitalWrite(ledTemCali , HIGH);
    digitalWrite(ledTemFrio , LOW);
    digitalWrite(ledTemNorm , LOW);
  }

  if (valorHumedad == 0) {
    humedadd = "SI";
  } else {
    humedadd = "NO";
  }

 
  
  Serial.println("Temperatura %" + String(temperaturaC) + "% + Lluvia &" + lluviaa + "&  Humedad #" + humedadd + "# Reigo @" + regadera + "@ .");
  delay(1000);

  if (Serial.available() > 0) {
    input = Serial.read();

    if (input == '1') {
        digitalWrite(rele , LOW);
        regadera =  "ACTIVO";
    }

    if (input == '2') {
        digitalWrite(rele , HIGH);
        regadera =  "INACTIVO";
    }
  }
}
