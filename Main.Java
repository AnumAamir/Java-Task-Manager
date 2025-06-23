import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice;

        do {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(title, desc);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    manager.markTaskCompleted(completeIndex);
                    break;
                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    manager.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}