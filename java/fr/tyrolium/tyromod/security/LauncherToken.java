package fr.tyrolium.tyromod.security;

import jdk.nashorn.internal.parser.Token;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LauncherToken {

    private static String TokenUser = null;
    private static String TokenUserOld = null;

    private static String TokenUserFile = "usercachetyroserv.json";
    private static String TokenUserOldFile = "usercachetyroserva2f.json";

    public static void Token() {

        try {
            File myJson = new File(TokenUserFile);
            File myJsonA2F = new File(TokenUserOldFile);

            Scanner myReaderJson = new Scanner(myJson);
            while (myReaderJson.hasNextLine()) {
                TokenUser = myReaderJson.nextLine();
//                System.out.println("Token : " + TokenUser);
            }
            myReaderJson.close();

            Scanner myReaderJsonA2F = new Scanner(myJsonA2F);
            while (myReaderJsonA2F.hasNextLine()) {
                TokenUserOld = myReaderJsonA2F.nextLine();
//                System.out.println("Token A2F : " + TokenUserOld);
            }
            myReaderJsonA2F.close();

//            Path pathJson = Paths.get(TokenUserFile);
//            Files.delete(pathJson);
//
//            Path pathJsonA2F = Paths.get(TokenUserOldFile);
//            Files.delete(pathJsonA2F);

        } catch (FileNotFoundException e) {
            System.out.println("Token Error");
            e.printStackTrace();
        } /*catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public static String getTokenUser() {
        return TokenUser;
    }

    public static String getTokenUserOld() {
        return TokenUserOld;
    }
}
