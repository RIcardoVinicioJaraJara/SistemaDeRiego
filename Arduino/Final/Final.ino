//Valibarles  Huemedad
const int ledTemCali = 2;
const int ledTemNorm = 3;
const int ledTemFrio = 4;
const int pinTempera = A0;
float temperaturaC;
int lluvia;

//Lluviia
const int ledLluviaSi = 5;
const int ledLluviaNo = 6;
const int pinLluvia = A1;



void setup() {
  Serial.begin(9600);

  pinMode(ledTemCali, OUTPUT);
  pinMode(ledTemNorm, OUTPUT);
  pinMode(ledTemFrio, OUTPUT);
  pinMode(ledLluviaSi, OUTPUT);
  pinMode(ledLluviaNo, OUTPUT);


}

void loop() {
  temperaturaC = analogRead(pinTempera);
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
  Serial.println("Temperatura: " + String(temperaturaC));

  lluvia = analogRead(pinLluvia);
  Serial.print("Lluvia: " + String(lluvia));
  if (lluvia < 500) {
  Serial.println(" Si Hay lluvia");
  digitalWrite(ledLluviaSi , HIGH);
    digitalWrite(ledLluviaNo , LOW);
  }else{
  Serial.println(" No Hay lluvia");
  digitalWrite(ledLluviaNo , HIGH);
    digitalWrite(ledLluviaSi , LOW);
  }


  delay(1000);

}
