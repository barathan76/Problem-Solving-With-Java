class PointMap{
private int distance = 15;
private int duration = 1;
int getAmount(char a,char b){
int amount = 0;
int k = getDistance(a,b);
amount = 100;
k-=5;
amount = 100 + k*10;
return amount;
}

int getDistance(char a,char b){
int k = Math.abs((int) a - (int) b);
return k*distance;
}

int getDropTime(char a,char b,int pickupTime){
int k = Math.abs((int) a-(int)b);
if(pickupTime+k>24)
	return (pickupTime+k) - 24;
else
	return pickupTime+k;
}

}