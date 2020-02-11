int out1 = 0;
int out2 = 0;

void setup() {
  // inicializar puerto serie
  Serial.begin(9600);
  pinMode(A0, INPUT);
  pinMode(21, INPUT);
}

void loop() {
  // leer pines
  out1 = analogRead(A0);
  delay(100);
  out2 = digitalRead(21);
  // enviar
  Serial.print(out1);
  Serial.print(",");
  Serial.println(out2);
  // esperar
  delay(100);
}
