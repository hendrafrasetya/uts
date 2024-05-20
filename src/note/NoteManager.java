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
public class NoteManager {
    private Note[] notes;
    private int noteCount;
    private final Scanner scanner;

    public NoteManager(int capacity) {
        notes = new Note[capacity];
        noteCount = 0;
        scanner = new Scanner(System.in);
    }

    public void addNote() {
        if (noteCount >= notes.length) {
            System.out.println("Data Sudah Penuh");
            return;
        }
        System.out.println("\nMenambahkan Data Bokingan");
        System.out.println("----------------------");
        System.out.print("Isi Catatan: ");
        String content = scanner.nextLine();
        notes[noteCount] = new Note(content);
        noteCount++;
        System.out.println("Bokingan berhasil ditambahkan!\n");
    }

    public void displayNotes() {
        System.out.println("\nDaftar Bokingan");
        System.out.println("--------------");
        if (noteCount == 0) {
            System.out.println("Tidak ada catatan yang tersedia.\n");
        } else {
            for (int i = 0; i < noteCount; i++) {
                System.out.println((i + 1) + ". " + notes[i].getContent());
            }
            System.out.println();
        }
    }

    public void updateNote() {
        System.out.println("\nMengubah Data Catatan");
        System.out.println("---------------------");
        displayNotes();
        System.out.print("Pilih nomor catatan yang ingin diubah: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (index < 1 || index > noteCount) {
            System.out.println("Nomor catatan tidak valid.\n");
            return;
        }
        System.out.print("Isi catatan baru: ");
        String newContent = scanner.nextLine();
        notes[index - 1].setContent(newContent);
        System.out.println("Catatan berhasil diubah!\n");
    }

    public void deleteNote() {
        System.out.println("\nMenghapus Data Catatan");
        System.out.println("----------------------");
        displayNotes();
        System.out.print("Pilih nomor catatan yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (index < 1 || index > noteCount) {
            System.out.println("Nomor catatan tidak valid.\n");
            return;
        }
        for (int i = index - 1; i < noteCount - 1; i++) {
            notes[i] = notes[i + 1];
        }
        notes[noteCount - 1] = null;
        noteCount--;
        System.out.println("Catatan berhasil dihapus!\n");
    }
}

    

