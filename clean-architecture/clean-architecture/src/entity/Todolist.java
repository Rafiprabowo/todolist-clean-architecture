package entity;

public class Todolist {
    private  String todo;
    public Todolist(String todo){
        this.todo = todo;
    }
    Todolist(){

    }
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
