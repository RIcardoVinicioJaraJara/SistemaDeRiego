const int rele = 2;
const int rele1 = 3;

/***   Setup  ***/
void setup() {
    pinMode(rele,OUTPUT);
    pinMode(rele1,OUTPUT);
    Serial.begin(9600);
}

/***   Loop  ***/
void loop() {
    digitalWrite(rele, HIGH);
    digitalWrite(rele1, LOW);
    Serial.println("Humedad:");
     delay(2000);
     digitalWrite(rele1, HIGH);
    digitalWrite(rele, LOW);
    Serial.println("Humedad:");
    delay(2000);
}
