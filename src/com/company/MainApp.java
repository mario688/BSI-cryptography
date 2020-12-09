package com.company;

import com.company.Menu.Keyin;
import com.company.Menu.TextColor;

public class MainApp {

    public static void main(String[] args) {


        int swValue;

        // Display menu graphics
        System.out.println(TextColor.BLUE + "=====================================================");
        System.out.println("|         BSI-Project-Calculator                    |");
        System.out.println("=====================================================");
        System.out.println("| Options:                                          |");
        System.out.println("|        1. AES encryption/decryption               |");
        System.out.println("|        2. DES encryption/decryption               |");
        System.out.println("|        3. 3DES encryption/decryption              |");
        System.out.println("|        4. EXIT                                    |");
        System.out.println("=====================================================");
        swValue = Keyin.inInt(TextColor.GREEN + " Select option: ");

        // Switch construct
        switch (swValue) {
            case 1:
                //
                break;
            case 2:
               //
                break;
            case 3:
               //
                break;
            default:
                System.out.println("Invalid selection");
                break; // This break is not really necessary
        }


    }

}
