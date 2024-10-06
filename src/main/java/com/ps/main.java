package com.ps;

import java.util.Scanner;
public class main {
    static Scanner scanner = new Scanner(System.in);
    static Book[] inventory = new Book[20];
    static int nextEmptyIndex = 0;

    public static void main(String[] args) {
        Book book1 = new Book(35683746,346927472713L,"Red Rose","Checked In");
        Book book2 = new Book(45876352, 9783453274802L, "The Curse of Hollow Hill", "Checked Out");
        Book book3 = new Book(52948723, 9781453295642L, "Whispers in the Dark", "Checked In");
        Book book4 = new Book(63284956, 9782334873257L, "The Forgotten Crypt", "Checked In");
        Book book5 = new Book(74892012, 9783547892390L, "Shadows of the Undead", "Checked Out");
        Book book6 = new Book(89374562, 9781457629841L, "The Midnight Howl", "Checked In");
        Book book7 = new Book(98567231, 9781264932874L, "Beneath the Black Lake", "Checked Out");
        Book book8 = new Book(10764592, 9782364958431L, "The Vanishing Fog", "Checked In");
        Book book9 = new Book(11837658, 9783426789812L, "Terror at Raven's Peak", "Checked In");
        Book book10 = new Book(12946758, 9784357829123L, "The Phantom's Lullaby", "Checked Out");
        Book book11 = new Book(13457628, 9785467920134L, "Echoes of the Dead", "Checked In");
        Book book12 = new Book(14567293, 9781236458792L, "Blood Moon Rising", "Checked Out");
        Book book13 = new Book(15678231, 9781347564832L, "The Dollmaker's Curse", "Checked In");
        Book book14 = new Book(16789325, 9781458965423L, "The Witch's Grimoire", "Checked In");
        Book book15 = new Book(17894562, 9781567345872L, "Night of the Living Shadows", "Checked Out");
        Book book16 = new Book(18936271, 9782348563249L, "The Demon Within", "Checked In");
        Book book17 = new Book(19467582, 9781456372490L, "The Eyes of Madness", "Checked In");
        Book book18 = new Book(20678953, 9782356789342L, "The Cursed Asylum", "Checked Out");
        Book book19 = new Book(21784562, 9781567932489L, "The Widow's Web", "Checked In");
        Book book20 = new Book(22897452, 9782436784903L, "The Cemetery Gates", "Checked In");

        Book[] invetory = new Book[20];
        inventory[0] = book1;
        inventory[1] = book2;
        inventory[2] = book3;
        inventory[3] = book4;
        inventory[4] = book5;
        inventory[5] = book6;
        inventory[6] = book7;
        inventory[7] = book8;
        inventory[8] = book9;
        inventory[9] = book10;
        inventory[10] = book11;
        inventory[11] = book12;
        inventory[12] = book13;
        inventory[13] = book14;
        inventory[14] = book15;
        inventory[15] = book16;
        inventory[16] = book17;
        inventory[17] = book18;
        inventory[18] = book19;
        inventory[19] = book20;

        int mainMenuCommand = 4;

        do {
            System.out.println("Store Home Screen");
            System.out.println("1-Available Books");
            System.out.println("2-Checked Out Books");
            System.out.println("4-Checked In a Book");
            System.out.println("-Exit");

            System.out.print("Select Option");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand) {
                case 1:
                    break:listAllAvailablebooks
                case 2:
                    break:listCheckedOutbooks
                case 3:
                    :break: checkInAbook
                case 4:
                    break: Exit
                default:
                    System.out.println("Incorrect selection. Try again!");
            }
        } while(mainMenuCommand != 4);

    }
    public static void listAllAvailablebooks(){}
    public static void listCheckedOutbooks(){}
    public static void checkInAbook(){}
    public static void Exit(){}



}
