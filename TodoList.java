import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Queue<String> todoQueue = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int menuChoice;

            do {
                System.out.println("=== Aplikasi Todo List ===");
                System.out.println("1. Tambah Todo");
                System.out.println("2. Lihat Todo");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");
                menuChoice = scanner.nextInt();

                switch (menuChoice) {
                    case 1:
                        scanner.nextLine(); // Consume the leftover newline character
                        System.out.print("Masukkan todo baru: ");
                        String newTodo = scanner.nextLine();
                        todoQueue.add(newTodo);
                        System.out.println("Todo berhasil ditambahkan!");
                        break;
                    case 2:
                        System.out.println("Todo List:");
                        for (String todo : todoQueue) {
                            System.out.println("- " + todo);
                        }
                        break;
                    case 3:
                        System.out.println("Terima kasih. Sampai jumpa!");
                        break;
                    default:
                        System.out.println("Menu yang Anda pilih tidak valid.");
                }
                System.out.println();
            } while (menuChoice != 3);
        }
    }
}