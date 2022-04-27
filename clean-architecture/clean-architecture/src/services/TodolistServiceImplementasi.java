package services;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImplementasi implements TodolistServices{
    private TodolistRepository todolistRepository;
    public TodolistServiceImplementasi(TodolistRepository todolistRepository){
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodolist() {
        Todolist[] model = todolistRepository.getAll();
        System.out.println("TODOLIST");
        for (int i = 0; i <model.length ; i++) {
         var todo = model[i];
         var no = i+1;
         if(todo!=null){
             System.out.println(no+". "+todo.getTodo());
         }
        }

    }

    @Override
    public void addTodolist(String todo) {
    Todolist todolist = new Todolist(todo);
    todolistRepository.add(todolist);
        System.out.println("Sukses Menambahkan Todo: "+todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean succes = todolistRepository.remove(number);
        if(succes){
            System.out.println("Sukses menghapus todolist ke "+number);
        }else {
            System.out.println("Gagal Menghapus todolist ke "+number);
        }
    }
}
