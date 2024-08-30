class Task{
	String taskId;
	String task;
	String deadline;
	String userId;
	boolean checked;
	Task(String taskId,String task,String deadline,String userId){
		this.taskId = taskId;
		this.task = task;
		this.deadline = deadline;
		this.userId = userId;
	}
	public void setChecked(){
		this.checked = true;
	}
	public void unCheck(){
		this.checked = false;
	}
}