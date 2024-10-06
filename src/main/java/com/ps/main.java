package com.ps;

import java.util.Scanner;
public class main {
    static Scanner scanner = new Scanner(System.in);
    static Book[] inventory = new Book[20];
    static int currentNumberofBooks;


    public static void main(String[] args) {
        Book book1 = new Book(35683746,"34692747","Red Rose");
        Book book2 = new Book(45876352, "97834532", "The Curse of Hollow Hill");
        Book book3 = new Book(52948723, "97814532", "Whispers in the Dark");
        Book book4 = new Book(63284956, "97823348", "The Forgotten Crypt");
        Book book5 = new Book(74892012, "97835478", "Shadows of the Undead");
        Book book6 = new Book(89374562, "97814576", "The Midnight Howl");
        Book book7 = new Book(98567231, "97812649", "Beneath the Black Lake");
        Book book8 = new Book(10764592, "97823649", "The Vanishing Fog");
        Book book9 = new Book(11837658, "97834267", "Terror at Raven's Peak");
        Book book10 = new Book(12946758,"97843578", "The Phantom's Lullaby");
        Book book11 = new Book(13457628, "97854679", "Echoes of the Dead");
        Book book12 = new Book(14567293, "97812364", "Blood Moon Rising");
        Book book13 = new Book(15678231, "97813475", "The Dollmaker's Curse");
        Book book14 = new Book(16789325, "97814565", "The Witch's Grimoire");
        Book book15 = new Book(17894562, "97815673", "Night of the Living Shadows");
        Book book16 = new Book(18936271, "97823485", "The Demon Within");
        Book book17 = new Book(19467582, "97814567", "The Eyes of Madness");
        Book book18 = new Book(20678953, "97823578", "The Cursed Asylum");
        Book book19 = new Book(21784562, "97815679", "The Widow's Web");
        Book book20 = new Book(22897452, "97824367", "The Cemetery Gates");

        Book[] inventory = new Book[20];
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
        currentNumberofBooks = 20;

        int mainMenuCommand;

        do {
            System.out.println("Store Home Screen");
            System.out.println("1-Available Books");
            System.out.println("2-Checked Out Books");
            System.out.println("3-Checked In a Book");
            System.out.println("4-Exit");

            System.out.print("Select Option");

            mainMenuCommand = scanner.nextInt();

            switch(mainMenuCommand) {
                case 1:
                    allAvailablebooks();
                    break;
                case 2:
                    SearchlistAllCheckedOutbooks();
                    break;
                case 3:
                    checkInAbook();
                    break;
                case 4:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("Incorrect selection. Try again!");
            }
        } while(mainMenuCommand != 4);

    }
    public static void allAvailablebooks (){
        for (Book book: inventory){
                System.out.println(book);
            }
        }
    public static void SearchlistAllCheckedOutbooks(){}
    public static void checkInAbook(){}
    public static void Exit(){}

}