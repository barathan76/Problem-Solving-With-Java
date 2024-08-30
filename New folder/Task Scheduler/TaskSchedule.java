import java.util.Map;
import java.util.HashMap;
class TaskSchedule{
	Map<String,Map<String,Map<String,Task>>> map;
	TaskSchedule(){
		map = FileHandler.getDayWiseSchedule();
	}
	public boolean addTasks(Props.Role userRole, String taskName, String taskId, String deadline, String userId){
		if(userRole != Props.Role.Manager)
			return false;
		Task task = new Task(taskId,userId,taskName,deadline);
		if(map.containsKey(deadline)){
			if(!map.containsKey(userId)){
				map.get(deadline).put(userId, new HashMap<String,Task>());
			}else{
				map.get(deadline).get(userId).put(taskId,task);		
			}
		}else{
			map.put(deadline,new HashMap<>());
			map.get(deadline).put(userId,new HashMap<String,Task>());
			map.get(deadline).get(userId).put(taskId,task);	
		}
		return false;
	}
	public void removeTask(Props.Role role,String userId,String taskId,String day){
		map.get(day).get(userId).remove(taskId);
	}
	
	public Map<String,Task> getTaskInDay(String userId,String day){
		if(!map.containsKey(day)){
			return new HashMap<String,Task>();
		}
		return map.get(day).getOrDefault(userId, new HashMap<String,Task>());
	}
	
}