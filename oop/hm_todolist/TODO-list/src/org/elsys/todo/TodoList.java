package org.elsys.todo;

import java.util.ArrayList;
import java.util.List;

public interface TodoList {

	/**
	 * Parses the input String and creates new instance of TodoList.
	 * @param input
	 * @return new instance of TodoList
	 */
	static TodoList parse(String input) {
		// TODO implement me!
		List<String> taskList = new ArrayList<String>();
		String[] splitedTasks = input.split("\n");
		for(String task: splitedTasks){
			taskList.add(task);
		}
		SimpleTodoList toDoListObject = new SimpleTodoList(taskList);
		return toDoListObject;
	}

	/**
	 * Checks if the TodoList is completed.
	 * @return
	 */
	Boolean isCompleted();

	/**
	 * Percentage of completed tasks.
	 * @return Double, with 2-digits precision.
	 */
	Double percentageCompleted();

	/**
	 * @return all tasks in the to-do list.
	 */
	List<Task> getTasks();

	/**
	 * Returns new to-do list, filtered by the provided criteria.
	 * @param criteria
	 * @return
	 */
	TodoList filter(Criteria criteria);

	/**
	 * Joins two instances of TodoList, removing the duplicating tasks.
	 * @param other
	 * @return
	 */
	TodoList join(TodoList other);
	
	// Added methods for debugging purpose
	public void printTasks();
}
