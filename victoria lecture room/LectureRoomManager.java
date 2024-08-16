/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.lectureroommanager;

/**
 *
 * @author persy
 */
import java.util.Scanner;
public class LectureRoomManager {
   private static int studentsInRoom = 0;
   private static boolean[] lights = new boolean[3]; // Three lights (index 0, 1, 2)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Main Menu:");
            System.out.println("W: Add students to the room");
            System.out.println("X: Remove students from the room");
            System.out.println("Y: Turn on a light (1, 2, or 3)");
            System.out.println("Z: Turn off a light (1, 2, or 3)");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'W':
                    addStudents(scanner);
                    break;
                case 'X':
                    removeStudents(scanner);
                    break;
                case 'Y':
                    turnOnLight(scanner);
                    break;
                case 'Z':
                    turnOffLight(scanner);
                    break;
                case 'Q':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'Q');
    }

    private static void addStudents(Scanner scanner) {
        System.out.print("Enter the number of students to add: ");
        int numStudents = scanner.nextInt();
        studentsInRoom += numStudents;
        System.out.println("Added " + numStudents + " students. Total students in the room: " + studentsInRoom);
    }

    private static void removeStudents(Scanner scanner) {
        System.out.print("Enter the number of students to remove: ");
        int numStudents = scanner.nextInt();
        studentsInRoom = Math.max(0, studentsInRoom - numStudents);
        System.out.println("Removed " + numStudents + " students. Total students in the room: " + studentsInRoom);
    }
     private static void turnOnLight(Scanner scanner) {
        System.out.print("Enter the light number (1, 2, or 3): ");
        int lightNumber = scanner.nextInt();
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }
   private static void turnOffLight(Scanner scanner) {
        System.out.print("Enter the light number (1, 2, or 3): ");
        int lightNumber = scanner.nextInt();
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }
}     