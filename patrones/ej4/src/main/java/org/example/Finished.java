package org.example;

public class Finished extends ToDoItemState{

    @Override
    public void start(ToDoItem item) {

    }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El item ya se encuentra finalizado");
    }

    @Override
    public void finish(ToDoItem item) {

    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return item.getWorkedTime();
    }

    @Override
    public void addComment(String comment, ToDoItem item) {

    }
}
