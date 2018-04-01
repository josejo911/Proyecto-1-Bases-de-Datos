package sample.Main;

import java.io.*;

public class TypeWritter {

    public static StringBuilder reader(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return sb ;
    }
    public static void metadataBuilderDB(String name, String cantidad ) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("METADATA.txt","UTF-8");
        printWriter.println("METADATA"+"\n"+"Nombre:"+name+"\n"+"Tablas:"+cantidad+"\n"+"salu2");
        printWriter.close();

    }
    public static void metadataBuilderTable(String name, String registros, String restricciones ) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("METADATA.txt","UTF-8");
        printWriter.println("METADATA"+"\n"+"Nombre:"+name+"\n"+"Registros:"+registros+"\n"+"Restricciones:"+restricciones+"\n"+"salu2");
        printWriter.close();
    }



}
