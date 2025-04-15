package org.example;

import java.sql.Timestamp;

public class ToDoItem {
    private String name;
    private ToDoItemState estado;
    private String comentario;
    private Duration workedTime;

    public ToDoItem (String name){
        this.estado = new Pending();
        this.name = name;
        this.workedTime = new Duration();
    }

    public void start() {
        this.estado.start(this);
    }

    public void togglePause() {
        this.estado.togglePause(this);
    }

    public void finish() {
        this.estado.finish(this);
    }

    public Duration workedTime() {
        return this.estado.workedTime(this);
    }

    public void addComment(String comment) {
        this.estado.addComment(comment, this);
    }

    public void setState(ToDoItemState estado){
        this.estado = estado;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public Duration getWorkedTime(){
        return this.workedTime;
    }
}
