package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import services.TodolistServiceImplementasi;
import services.TodolistServices;
import view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
    testRemoveTodoList();
    }
    public static void testShowTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServices todolistServices = new TodolistServiceImplementasi(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistServices);
        todolistServices.addTodolist("Belajar Java");
        todolistServices.addTodolist("Belajar Php");
        todolistServices.addTodolist("Belajar Phyton");
        todolistView.showTodolist();
    }
    public static void testAddTodolist(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServices todolistServices = new TodolistServiceImplementasi(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistServices);
        todolistView.showTodolist();
    }
    public static void testRemoveTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServices todolistServices = new TodolistServiceImplementasi(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistServices);
        todolistView.showTodolist();
    }
}

