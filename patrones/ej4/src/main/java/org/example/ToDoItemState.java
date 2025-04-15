package org.example;

public abstract class ToDoItemState {
    public abstract void start(ToDoItem item);
    public abstract void togglePause(ToDoItem item);
    public abstract void finish(ToDoItem item);
    public abstract Duration workedTime(ToDoItem item);
    public abstract void addComment(String comment, ToDoItem item);
}
