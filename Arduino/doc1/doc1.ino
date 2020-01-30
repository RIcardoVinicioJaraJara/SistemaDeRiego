
const int LED = 8; //LED connected to digital pin 13
int inByte = 0;
 
void setup(){
    Serial.begin(9600); //Open the serial port
    pinMode(LED, OUTPUT); //Set the digital pin as output
}
 
void loop(){
 
    if(Serial.available() > 0){
 
        inByte = Serial.read(); //read the incoming byte
 
        if(inByte == '1')
            digitalWrite(LED, HIGH); //turn the LED on
        if(inByte == '2')
            digitalWrite(LED, LOW); //turn the LED on
    }
}
