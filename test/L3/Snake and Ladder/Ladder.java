public class Ladder{
int id;
int start;
int end;
Ladder(int id,int start,int end){
this.id = id;
this.start = start;
this.end = end;
}
public int transfer(){
return start;
}
}