package PathsFiles.beispiel;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Pfad erstellen
        Path path = Paths.get("C:\\home\\user\\Desktop\\Test.txt");

        // Methoden
        /*System.out.println("toString: "+ path.toString());
        System.out.println("getFileName: "+path.getFileName());
        System.out.println("getName: "+path.getName(0)); // Erhalte den Anfang des Baumes
        System.out.println("getCountName: "+path.getNameCount());
        System.out.println("subPath: "+path.subpath(0,2)); // Anfang des Pfades und Ende(Root Element nicht dabei)

        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());

        System.out.println("absolutePath: "+ path.toAbsolutePath());
        System.out.println("normalize: "+ Paths.get("C:\\home\\\\user\\..\\Desktop\\\\Test.txt").normalize());*/

        // Filesystem
       FileSystem fileSystem = FileSystems.getDefault();
       System.out.println(fileSystem);

       File file = new File("C:\\01_Emre\\Txt_tester.txt");
       File file3 = new File("C:\\01_Emre\\Neue Dateien");
       File file2 = new File("C:\\01_Emre\\Test.jpg");

       /*boolean fileExists = file.exists();
       if (fileExists){
           System.out.println("Datei vorhanden");
       }else {
           System.out.println("Datei nicht vorhanden");
       }

        // File Länge/ Größe
        long laenge = file.length();
        System.out.println("Dateigröße in Byte: "+laenge);

        // Ist das File Objekt eine Datei oder ein Ordner (Verzeichnis)
        boolean isDic = file.isDirectory();
        if (isDic){
            System.out.println("Es ist ein Ordner");
        }else {
            System.out.println("Es ist nur eine Datei");
        }

        //Name ändern
        boolean changeName = file.renameTo(new File("C:\\01_Emre\\testNeu.txt"));

        if (changeName){
            System.out.println("Name geändert");
        }else {
            System.out.println("Name konnte nicht geändert werden");
        }*/

        // Datei erstellen
        /*try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        // mehrere Ordner erstellen
        /*File newDir = new File("C:\\01_Emre\\Neue Dateien1");
        boolean completeDir = newDir.mkdirs(); // erstellt kompletten Verzeichnis

        File newDir2 = new File("C:\\01_Emre\\Ordner2\\Ordner2.1");
        newDir2.mkdirs();

        if (completeDir){
            System.out.println("Verzeichnis erstellt");
        }else {
            System.out.println("Verzeichnis nicht erstellt");
        }*/

        // Ordner erstellen
        /*File newOrd = new File("C:\\01_Emre\\Udemy Projekte");
        newOrd.mkdir();*/


        // Liste von Dateien innerhalb eines Ordners anzeigen -> Entweder als String- oder File - Array
        /*String[] filenames = newDir.list();
        File[] files = newDir.listFiles();

        for (File fileN:files) {
            System.out.println("Name: "+fileN.getAbsolutePath());
            fileN.delete();
        }*/

        // Aus einem File den Path erhalten
       /* File file4 = new File("C:\\01_Emre\\TEST.txt");

        try {
            file4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path4 = file4.toPath();
        System.out.println(path4);*/

        //Aus einem Path eine File erstellen
        Path path5 = Paths.get("C:\\01_Emre\\\\BILD.png");
        File file5 = path5.toFile();

        try {
            file5.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // File Seperator
        String fileSeperator = System.getProperty("file.separator");
        System.out.println(fileSeperator);

        String absoluteFilePath = "C:" + fileSeperator + "01_Emre" + fileSeperator + "JAVATest.txt";
        System.out.println(absoluteFilePath);

        File file6 = new File(absoluteFilePath);
        try {
            file6.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
