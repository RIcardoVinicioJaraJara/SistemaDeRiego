const int rele = 10;

/***   Setup  ***/
void setup() {
    pinMode(rele,OUTPUT);
    Serial.begin(9600);
}

/***   Loop  ***/
void loop() {
     delay(5000);
     digitalWrite(rele, HIGH);
     delay(5000);
    digitalWrite(rele, LOW);
    Serial.println("Humedad:");
    
}
