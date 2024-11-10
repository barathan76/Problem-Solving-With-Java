package Train;

public class Coach{
public enum CoachType{AC,NonAC}
private int coachNo;
private CoachType type;
private Seat seats[];
Coach(CoachType type,seats){
this.coachNo = coachNo;
this.type = type;
this.seats = seats;
}
}

public class Seat{
public enum SeatType{Upper,Lower,Middle}
private int SeatNo;
private SeatType type;
Seat(int SeatNo,SeatType type){
this.no = no;
this.type = type;
}

}

public class Train{
private String trainName;
private String trainNo;
private String source;
private String destination;
private Time departTime;
private Coach[] coaches;
public Train(String trainName,String trainNo,String source,String destination,Time departTime,Coach[] coaches){
this.trainName  = trainName;
this.trainNo = trainNo;
this.source = source;
this.destination = destination;
}

public void setCoaches(Coach[] coaches){
this.coaches = coaches;
}
public void setDepartTime(Time departTime){
this.departTime = departTime;
}

}

public class Time{
public enum Meridiem{AM,PM}
private int hour;
private int minutes;
private Meridiem meridiem;
public Time(int hour,int minutes,Meridiem meridiem){
this.hour = hour;
this.minutes = minutes;
this.meridiem = meridiem;
}
}



}

