package org.elsys.todo;

import java.util.regex.Pattern;

public class SimpleTask implements Task{
	
	private String status;
	private String description;
	private String priority;
	private String[] tags;
	
	public static final int P_STATUS = 0;
	public static final int P_DESCRIPTION = 1;
	public static final int P_PRIORITY = 2;
	public static final int P_TAGS = 3;
	
	public SimpleTask(String task){
		String args[] = task.split(Pattern.quote("|"));

		for(int i = 0; i < args.length; i++){
			String trimmed = args[i].trim();
			args[i] = trimmed;
		}
		
		this.status = args[P_STATUS];
		this.description = args[P_DESCRIPTION];
		this.priority = args[P_PRIORITY];
		
		String tags[] = args[P_TAGS].split(",");
		
		for(int i = 0; i < tags.length; i++){
			String trimmed = tags[i].trim();
			tags[i] = trimmed;
		}
		
		this.tags = tags;
		
	}

	@Override
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

	@Override
	public String getDescription() {
		return description;
	}

	@Override
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

	@Override
	public String[] getTags() {
		return tags;
	}
	
}
