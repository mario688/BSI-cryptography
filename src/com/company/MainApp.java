package com.company;

import com.company.Algorithms.AES;
import com.company.Algorithms.DES;
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

                break;
            case 2:
                final String secretKey = "ssshhhhhhhhhhh!!!!";

                String originalString = "howtodoinjava.com";
                String encryptedString = AES.encrypt(originalString, secretKey) ;
                String decryptedString = AES.decrypt(encryptedString, secretKey) ;

                System.out.println(originalString);
                System.out.println(encryptedString);
                System.out.println(decryptedString);
                break;
            case 3:
                String text = "123456ABCD1325361";
                String key = "AABB09182736CCDD";

                DES cipher = new DES();
                System.out.println("Encryption:\n");
                text = cipher.encrypt(text, key);
                System.out.println(
                        "\nCipher Text: " + text.toUpperCase() + "\n");
                System.out.println("Decryption\n");
                text = cipher.decrypt(text, key);
                System.out.println(
                        "\nPlain Text: "
                                + text.toUpperCase());
                break;
            default:
                System.out.println("Invalid selection");
                break; // This break is not really necessary
        }


    }

}
