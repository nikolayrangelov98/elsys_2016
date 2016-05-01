package org.elsys.todo;

import java.util.List;

public class Main {
	public static void main(String[] args){
		
		TodoList l1 = TodoList.parse("DONE    | Do OOP homework              | Low    | school, programming\n"
				+ "DONE    | Get 8 hours of sleep.        | Low    | health\n"
				+ "TODO | Party hard.                  | Normal | social\n"
				+ "TODO    | Netflix and chill.           | Normal | tv shows\n"
				+ "DONE    | Find missing socks.          | Low    | meh"
				+ "DONE    | Find missing socks.          | Low    | meh"
				+"DONE    | Find missing socks.          | Low    | meh"
				+ "DONE    | Find missing socks.          | Low    | meh");
		System.out.println(l1.percentageCompleted());
		//l1.printTasks();
		//SimpleTask task = new SimpleTask("TODO    | Do OOP homework              | Low    | school, programming");
		//String hi = " s dfs";
		//System.out.println(hi.trim());
		//List<Task> list = l1.getTasks();
		
		/*for(Task task: list){
			String tags[] = task.getTags();
			for(String tag: tags){
				System.out.print(tag + " ");
			}
			System.out.print("\n");
		}*/
		
		
	}
	
	// Added method for debugging purpose.
	public void printTasks(List<String> tasks){
		System.out.println("-------------------------------------------------------");
		for(String task: tasks){
			System.out.println(task);
		}
		System.out.println("-------------------------------------------------------");
	}
}
