import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import services.TodolistServiceImplementasi;
import services.TodolistServices;
import view.TodolistView;

public class TodolistApp {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistServices todolistServices = new TodolistServiceImplementasi(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistServices);
        todolistView.showTodolist();
    }
}
