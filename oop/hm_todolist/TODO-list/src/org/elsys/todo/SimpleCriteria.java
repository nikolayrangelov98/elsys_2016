package org.elsys.todo;

public class SimpleCriteria implements Criteria{
	
	private String status;
	private String priority;
	private String[] tags;
	
	public SimpleCriteria(){
		// empty constructor
	}
	
	public SimpleCriteria(SimpleCriteria c){
		this.status = c.status;
		this.priority = c.priority;
		this.tags = c.tags;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setPriority(String priority){
		this.priority = priority;
	}
	public void setTags(String[] tags){
		this.tags = tags;
	}
	
	
	public Status getStatus() {
		switch(status){
			case "TODO": 
				return Status.TODO;
			case "DOING":
				return Status.DOING;
			case "CURRENT":
				return Status.DOING;
			case "DONE":
				return Status.DONE;
			default:
				return null;
		}
	}

	public Priority getPriority() {
		switch(priority){
			case "High": 
				return Priority.HIGH;
			case "Normal":
				return Priority.NORMAL;
			case "Low":
				return Priority.LOW;
			default:
				return null;
		}
	}
	
	public String[] getTags() {
		return tags;
	}
	
	
	@Override
	public Criteria and(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria or(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria not() {
		// TODO Auto-generated method stub
		return null;
	}

}
