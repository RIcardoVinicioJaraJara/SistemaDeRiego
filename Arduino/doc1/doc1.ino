
const int LED = 8;
const int RELE = 2;
int inByte = 0;
 
void setup(){
    Serial.begin(9600); //Open the serial port
    pinMode(LED, OUTPUT);
    pinMode(RELE, OUTPUT);
}
 
void loop(){
 digitalWrite(RELE, HIGH);
    if(Serial.available() > 0){
 
        inByte = Serial.read(); //read the incoming byte
 
        if(inByte == '1')
            digitalWrite(LED, HIGH); //turn the LED on
        
            
            
        if(inByte == '2')
            digitalWrite(LED, LOW); //turn the LED on
    }
}
