package org.example;

public class Pending extends ToDoItemState{

    @Override
    public void start(ToDoItem item) {
        item.setState(new InProgress());
    }

    @Override
    public void togglePause(ToDoItem item) {
        throw new RuntimeException("Solo se puede pausar en estado in-progress o paused");
    }

    @Override
    public void finish(ToDoItem item) {

    }

    @Override
    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("Todavia no se inicio el item");
    }

    @Override
    public void addComment(String comment, ToDoItem item) {
        item.setComentario(comment);
    }

}
