package fr.tyrolium.tyromod.security;

import fr.tyrolium.tyromod.Global;
import org.apache.logging.log4j.Logger;

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

    private static int countLog = 0;

    public static void Token() {

        try {
            File myJson = new File(TokenUserFile);
            File myJsonA2F = new File(TokenUserOldFile);

            Scanner myReaderJson = new Scanner(myJson);
            while (myReaderJson.hasNextLine()) {
                TokenUser = myReaderJson.nextLine();
            }
            myReaderJson.close();

            Scanner myReaderJsonA2F = new Scanner(myJsonA2F);
            while (myReaderJsonA2F.hasNextLine()) {
                TokenUserOld = myReaderJsonA2F.nextLine();
            }
            myReaderJsonA2F.close();

            if (!Global.DEBUG_TOKEN) {
                Path pathJson = Paths.get(TokenUserFile);
                Files.delete(pathJson);

                Path pathJsonA2F = Paths.get(TokenUserOldFile);
                Files.delete(pathJsonA2F);
            }

//            System.out.println("----- TOKEN LAUNCHER -----");
//
//            System.out.println("TokenUser : " + TokenUser);
//            System.out.println("TokenUserOld : " + TokenUserOld);

            if (countLog == 0) {
                TyroLogger.logClientBase("✅ Récupération du Token Réussi");
            }
            countLog = countLog + 1;

        } catch (FileNotFoundException e) {
            if (countLog == 0) {
                TyroLogger.logClientBase("❌ Erreur de récupération du Token (FileNotFound)");
            }
            countLog = countLog + 1;

            e.printStackTrace();
        } catch (IOException e) {

            if (countLog == 0) {
                TyroLogger.logClientBase("❌ Erreur de récupération du Token (IOException)");
            }
            countLog = countLog + 1;

            e.printStackTrace();
        }

    }

    public static String getTokenUser() {
        return TokenUser;
    }

    public static String getTokenUserOld() {
        return TokenUserOld;
    }
}


