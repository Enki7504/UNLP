package org.example;

import java.sql.Timestamp;

public class Paused extends ToDoItemState{

    @Override
    public void start(ToDoItem item) {

    }

    @Override
    public void togglePause(ToDoItem item) {
        item.setState(new InProgress());
    }

    @Override
    public void finish(ToDoItem item) {
        item.setState(new Finished());
        item.getWorkedTime().setFin(new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public Duration workedTime(ToDoItem item) {
        return new Duration(item.getWorkedTime().getInicio(), new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void addComment(String comment, ToDoItem item) {
        item.setComentario(comment);
    }
}
