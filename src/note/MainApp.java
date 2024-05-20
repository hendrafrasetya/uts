/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package note;
import java.util.Scanner;

/**
 *
 * @author hendra frasetya
 */
public class MainApp {
    

    public static void main(String[] args) {
        NoteManager noteManager = new NoteManager(10);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Aplikasi Catatan Boking Tenda ===");
            System.out.println("1. Tambah Bokingan");
            System.out.println("2. Tampilkan Bokingan");
            System.out.println("3. Ubah Bokingan");
            System.out.println("4. Hapus Bokingan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (pilihan) {
                case 1:
                    noteManager.addNote();
                    break;
                case 2:
                    noteManager.displayNotes();
                    break;
                case 3:
                    noteManager.updateNote();
                    break;
                case 4:
                    noteManager.deleteNote();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi catatan.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        }
    }
}

    

