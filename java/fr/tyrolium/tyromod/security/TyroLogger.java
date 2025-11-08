package fr.tyrolium.tyromod.security;

import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TyroLogger {

    private static Logger logger;

    /******************
     *
     *  SERVEUR ACTION
     *
     * ****************/


    private static final Path PLAYER_DIR = Paths.get("tyromod", "security");
    private static final Path SERVER_DIR = Paths.get("tyromod", "server");

    // Initialise les dossiers serveur au démarrage
    public static void init_SERVER() {
        try {
            if (!Files.exists(PLAYER_DIR)) {
                Files.createDirectories(PLAYER_DIR);
                logger.info("ℹ️ Dossier de logs créé : " + PLAYER_DIR.toAbsolutePath());
            }
        } catch (IOException e) {
            logger.info("❌ Erreur lors de la création du dossier de logs serveur");
        }
    }

    // Fonction principale pour écrire dans un log
    public static void logServerPlayer(String playerName, String message) {
        try {
            if (!Files.exists(PLAYER_DIR)) {
                Files.createDirectories(PLAYER_DIR);
            }

            // Format de date pour le fichier : Maxime-08-11-2025.log
            String dateForFile = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            Path logFile = PLAYER_DIR.resolve(playerName + "-" + dateForFile + ".log");

            // Format de temps dans le log : [08-11-2025 16:30:12]
            String time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            String logMessage = "[" + time + "] " + message + System.lineSeparator();

            Files.write(
                    logFile,
                    logMessage.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (IOException e) {
            logger.info("❌ Impossible d'écrire dans le log serveur pour " + playerName);
        }
    }

    /******************
     *
     *  CLIENT ACTION
     *
     * ****************/

    private static final Path LOG_DIR = Paths.get("tyromod", "log");

    // Initialise les dossiers client au démarrage
    public static void init_CLIENT() {
        try {
            if (!Files.exists(LOG_DIR)) {
                Files.createDirectories(LOG_DIR);
                logger.info("ℹ️ Dossier de logs créé : " + LOG_DIR.toAbsolutePath());
            }
        } catch (IOException e) {
            logger.info("❌ Erreur lors de la création du dossier de logs");
        }
    }

    public static void logClientBase(String message) {
        try {
            if (!Files.exists(LOG_DIR)) {
                Files.createDirectories(LOG_DIR);
            }

            // Format de date pour le fichier : Maxime-08-11-2025.log
            String dateForFile = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            Path logFile = LOG_DIR.resolve("base-" + dateForFile + ".log");

            // Format de date/heure
            String time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            String logMessage = "[" + time + "] " + message + System.lineSeparator();

            // Append au fichier
            Files.write(
                    logFile,
                    logMessage.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (IOException e) {
            logger.info("❌ Impossible d'écrire dans le fichier log de base");
        }
    }

    public static void logClientConnection(String message) {
        try {
            if (!Files.exists(LOG_DIR)) {
                Files.createDirectories(LOG_DIR);
            }

            // Format de date pour le fichier : Maxime-08-11-2025.log
            String dateForFile = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            Path logFile = LOG_DIR.resolve("connexion-" + dateForFile + ".log");

            // Format de date/heure
            String time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            String logMessage = "[" + time + "] " + message + System.lineSeparator();

            // Append au fichier
            Files.write(
                    logFile,
                    logMessage.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

        } catch (IOException e) {
            logger.info("❌ Impossible d'écrire dans le fichier log de connexion");
        }

        logClientBase(message);
    }





}