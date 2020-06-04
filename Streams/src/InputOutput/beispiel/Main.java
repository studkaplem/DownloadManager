package InputOutput.beispiel;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // IputStream = Lesen einer Datei
        // OutputStream = Schreiben in eine Datei

        InputStream inputStream = null;

        File file  = new File("C:\\01_Emre\\JAVATest.txt");

        /*int i;
        char c;

        try {
            inputStream = new FileInputStream(file);
            *//* read() untersucht jedes Zeichen in Byte und
             gibt -1 zurück wenn letztes Zeichen erreicht wurde
             und danach nichts mehr kommt *//*
            while ((i = inputStream.read()) != -1){ // Solange es Inhalt hat
                c = (char) i; // Byte in Zeichen umwandeln
                System.out.print(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally { // Wird immer ausgeführt
            // Stream wird nach Ausführung immer geschlossen geschlosssen
            inputStream.close();
        }*/


        OutputStream outputStream = null;
        String name = "Max Mustermann";

        try{
            outputStream = new FileOutputStream(file);
            outputStream.write(name.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            outputStream.close();
        }


        // Mehrere Dateien lesen
        File file1 = new File("C:\\01_Emre\\text1.txt");
        File file2 = new File("C:\\01_Emre\\text2.txt");

        InputStream iStream1 = null;
        InputStream iStream2 = null;
        SequenceInputStream sInputStream = null;

        OutputStream fOutputStream = new FileOutputStream("C:\\01_Emre\\text3.txt");

        int i;
        char c;

        try {
            iStream1 = new FileInputStream(file1);
            iStream2 = new FileInputStream(file2);

            sInputStream = new SequenceInputStream(iStream1, iStream2);

            while ((i = sInputStream.read()) != -1){
                c = (char)i;
                System.out.print(c);
                fOutputStream.write(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            iStream1.close();
            iStream2.close();
            sInputStream.close();
            fOutputStream.close();
        }
    }
}
