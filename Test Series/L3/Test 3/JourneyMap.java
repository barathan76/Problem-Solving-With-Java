import java.util.List;
import java.util.ArrayList;
public class JourneyMap{

int arr[] = {0,0,1,0,0,2,0,0,3};
List<Toll> tolls;

public JourneyMap(){
tolls = new ArrayList<Toll>();
tolls.add(new Toll(1));
tolls.add(new Toll(2));
tolls.add(new Toll(3));
}


void displayStats(int id){
	Toll toll = tolls.get(id-1);
	toll.getVechilePassed();
}

void displayTolls(){
for(Toll toll : tolls)
	System.out.print("\tToll"+toll.getId());
System.out.println();
}

void displayMap(){
	for(int i = 0;i<arr.length;i++){
		if(arr[i] == 0){
			System.out.print("Place "+(i+1)+"\t");
		}else{
			System.out.print("TollGate "+arr[i]+"\t");
		}
	}
	System.out.println();
}


void navigate(int start,int stop,Vechile v){
	if(start< 0 || start>= arr.length || stop<0 || stop>=arr.length){
		System.out.println("Invalid path");
		return;
		
	}
	
	
	
	if(Math.abs(start-stop) < (start+stop-1)%arr.length){
		
	if(stop < start){
		for(int i = start-1;i>stop;i--){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]-1);
				toll.passToll(v);
			}
		}
		}
	else{
		for(int i = start-1;i<stop;i++){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]-1);
				toll.passToll(v);
			}
		}
	}
	}
	else{
	if(stop < start){
		for(int i = start-1;i<arr.length;i++){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]-1);
				toll.passToll(v);
			}
			start++;
		}
		
		for(int i = 0;i<stop;i++){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]);
				toll.passToll(v);
			}
		}
		}
	else{
		
		for(int i = start-1;i>=0;i--){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]);
				toll.passToll(v);
			}
		}
		for(int i = arr.length - 1 ;i>stop;i--){
			if(arr[i] == 0)
				continue;
			else{
				Toll toll = tolls.get(arr[i]-1);
				toll.passToll(v);
			}
		}
		
	}
	}	
		
		
	}
	

}