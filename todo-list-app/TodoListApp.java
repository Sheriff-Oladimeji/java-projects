
// import java.util.Scanner;
import java.util.ArrayList;

public class TodoListApp {
    static void addTodo(ArrayList<String> todos, String name) {
        todos.add(name);
    }

    static void getAllTodos(ArrayList<String> todos) {
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(todos.get(i));
        }
    }

    static void getTodo(ArrayList<String> todos, int index) {
        if (index >= todos.size()) {
            System.out.println("Index out of bounds");
        } else {
            System.out.println(todos.get(index));
        }
    }

    static void removeTodo(ArrayList<String> todos, int index) {
        if (index >= todos.size()) {
            System.out.println("Index out of bounds");
        } else {
            todos.remove(index);
            System.out.println("Todo at index " + index + " has been removed");
        }
    }

    static void editTodo(ArrayList<String> todos, int index, String newName) {
        if (index >= todos.size()) {
            System.out.println("Index out of bounds");
        } else {
            todos.set(index, newName);
            System.out.println("Todo at index " + index + " has been updated to " + newName);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        addTodo(todos, "Go to the gym");
        addTodo(todos, "wash the dishes");
        addTodo(todos, "do laundry");
        addTodo(todos, "buy groceries");
        getAllTodos(todos);
        getTodo(todos, 2);
        getTodo(todos, 20);
        editTodo(todos, 0, "Workout");
        removeTodo(todos, 2);

    }
}