package org.elsys.todo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SimpleTodoList implements TodoList{
	
	private List<String> taskListString = new ArrayList<String>();
	private List<Task> taskListTask = new ArrayList<Task>();
	
	public SimpleTodoList(List<String> taskList){
		for(String task: taskList){
			this.taskListString.add(task);
		}
		
		for(String task: taskList){
			taskListTask.add(new SimpleTask(task));
		}
	}
	@Override
	public Boolean isCompleted() {
		for(Task task: taskListTask){
			if(!task.getStatus().equals(Status.DONE)){
				return false;
			}
		}
		return true;
	}

	@Override
	public Double percentageCompleted() {
		// TODO Auto-generated method stub
		int allTasks = taskListTask.size();
		int doneTasks = 0;
		for(Task task: taskListTask){
			if(task.getStatus().equals(Status.DONE)){
				doneTasks++;
			}
		}
		Double percentageDone = (double) (((double)doneTasks / (double)allTasks) * 100.0d);
	
		return percentageDone;
	}

	@Override
	public List<Task> getTasks() {
		return taskListTask;
	}

	@Override
	public TodoList filter(Criteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoList join(TodoList other) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void printTasks(){
		System.out.println("-------------------------------------------------------");
		for(String task: taskListString){
			System.out.println(task);
		}
		System.out.println("-------------------------------------------------------");
	}

}
