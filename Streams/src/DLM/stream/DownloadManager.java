package DLM.stream;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadManager implements Runnable {
    private String link;
    private File outputFile; // speichern von Heruntergeladenen Sachen

    private String fileSeperator = System.getProperty("file.separator");
    private String downloadFolderPath = "C:"+fileSeperator+"BenutzerJava"
            +fileSeperator+"EmreJava-"+fileSeperator+"DesktopJava"+fileSeperator+"Downloads";
    // C:\BenutzerJava\EmreJava\DesktopJava\Downloads

    // StandartFolder wo alles gespeichert werden soll was heruntergeladen wird
    private File defaultDownloadFolder = new File(downloadFolderPath);

    public DownloadManager(String link){
        this.link = link;

        if (!defaultDownloadFolder.exists()){
            defaultDownloadFolder.mkdirs();
        }
    }

    @Override
    public void run() {
        try{
            URL url = new URL(link);
            // im Hintergrund öffnen
            HttpURLConnection hConnection =(HttpURLConnection) url.openConnection();

            // Inputstream arbeiter immer mit Byte
            BufferedInputStream bufferedInputStream = new BufferedInputStream(hConnection.getInputStream());

            // Datei schreiben / erstellen
            outputFile = new File(defaultDownloadFolder, "datei.mp3");
            OutputStream outputStream = new FileOutputStream(outputFile);
            BufferedOutputStream bOutputStream = new BufferedOutputStream(outputStream,1024);

            byte[] buffer = new byte[1024];
            int downloaded = 0;


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
