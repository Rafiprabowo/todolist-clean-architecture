package view;

import entity.Todolist;
import services.TodolistServiceImplementasi;
import services.TodolistServices;
import util.Utility;

public class TodolistView {
   private TodolistServices todolistServices;

    public TodolistView(TodolistServices todolistServices) {
        this.todolistServices = todolistServices;
    }

    public void showTodolist(){
        while (true){
            todolistServices.showTodolist();

            System.out.println("Menu");
            System.out.println("1. Menambah Todolist");
            System.out.println("2. Menghapus Todolist");
            System.out.println("3. Keluar");
            var input = Utility.input("Pilih");
            if(input.equals("1")){
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            }else if(input.equals("3")){
              break;
            }else {
                System.out.println("Pilihan Tidak dimengerti");
            }
        }
    }
    public void addTodolist(){
        System.out.println("Menambah Todo List");
        var todo = Utility.input("Todo : (Tekan 3 jika batal)");
        if(todo.equals("x")){
            //batal
        }else {
            todolistServices.addTodolist(todo);
        }

    }
    public void removeTodolist(){
        System.out.println("Menghapus Todo List");
        var todo = Utility.input("input no Todo yang dihapus : (Tekan 3 jika batal)");
        todolistServices.removeTodolist(Integer.valueOf(todo));


    }
}
