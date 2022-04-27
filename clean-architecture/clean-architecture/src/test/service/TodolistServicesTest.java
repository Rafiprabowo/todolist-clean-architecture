package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import services.TodolistServiceImplementasi;
import services.TodolistServices;

public class TodolistServicesTest {
    public static void main(String[] args) {
        testRemoveTodolist();
    }
    public static void testShowTodolist(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        TodolistServices todolistServices = new TodolistServiceImplementasi(todolistRepository);
        todolistRepository.data[0] = new Todolist("Belajar java dasar");
        todolistRepository.data[1] = new Todolist("Belajar java oop");
        todolistRepository.data[2] = new Todolist("Belajar java database");
        todolistServices.showTodolist();
    }
    public static void testAddTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServiceImplementasi todolistService = new TodolistServiceImplementasi(todolistRepository);
        todolistService.addTodolist("Belajar Java Spring");
        todolistService.showTodolist();
    }
    public static void testRemoveTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServiceImplementasi todolistServiceImplementasi = new TodolistServiceImplementasi(todolistRepository);
        todolistServiceImplementasi.addTodolist("Belajar Spring");
        todolistServiceImplementasi.addTodolist("Belajar Java");
        todolistServiceImplementasi.addTodolist("Belajar PHP");
        todolistServiceImplementasi.removeTodolist(3);
        todolistServiceImplementasi.showTodolist();
        todolistServiceImplementasi.removeTodolist(2);
        todolistServiceImplementasi.showTodolist();
        todolistServiceImplementasi.removeTodolist(1);
        todolistServiceImplementasi.showTodolist();
    }
}
