#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>

//you access our database if you want, here's the host and secret :p 
#define FIREBASE_HOST "shaghir-8e17a.firebaseio.com"
#define FIREBASE_AUTH "Xb8AVaNZdwPy3kAJdvcxvvGSrftsnlTFgHHOnus6"

//put yours if you're intrested to test it out :))))
#define WIFI_SSID "**********"
#define WIFI_PASSWORD "*****"


int SensorPin = 2;     
int state = 0;

void setup() {
  Serial.begin(9600);

  // connect to wifi.
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.println("connecting");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }

  Serial.println("connected: ");
  Serial.println(WiFi.localIP());
  
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);

  pinMode(SensorPin, INPUT);  
  
}

void loop() {

  state = digitalRead(SensorPin);

  if (state == LOW) {        
      Firebase.setFloat("B1A1", 1); 
      Serial.println("seat is not availabe"); 
  } 
  else if (state == HIGH) {
    digitalWrite(ledPin, LOW);     //for test
      Firebase.setFloat("B1A1",0);
      Serial.println("seat is not availabe");   
  }
  delay(1000);
}
