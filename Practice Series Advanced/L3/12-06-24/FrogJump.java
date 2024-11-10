import java.util.Scanner;

public class FrogJump {
static int solve(int x1,int y1,int x2,int y2){
int count = 0;
int minX = Math.min(x1,x2);
int maxX = Math.max(x1,x2);
int minY = Math.min(y1,y2);
int maxY = Math.max(y1,y2);

for(int i =0;i<=4;i++){
for(int j =0;j<=4;j++){
if(i>=minX && i<=maxX && j>=minY && j<=maxY)
	count++;
}
}
return count;

        
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int x1 = scanner.nextInt();
int y1 = scanner.nextInt();
int x2 = scanner.nextInt();
int y2 = scanner.nextInt();
System.out.println(solve(x1,y1,x2,y2));
}
}
