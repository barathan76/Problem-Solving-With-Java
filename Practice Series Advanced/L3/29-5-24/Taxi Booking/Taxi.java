class Taxi{
int taxiNumber;
char currentPosition;
int earned;
int freeTime = 0;
Taxi(int taxiNumber,char currentPosition){
this.taxiNumber = taxiNumber;
this.currentPosition = currentPosition;
this.earned = 0;

}
void setCurrentPosition(char c){
currentPosition = c;
}

char getCurrentPosition(){
return currentPosition;
}
void updateEarned(int amount){
earned+=amount;
}
int getEarned(){
return earned;
}

int getTaxiNumber(){
	return taxiNumber;
}

void setFreeTime(int dropTime){
freeTime = dropTime;
}


}