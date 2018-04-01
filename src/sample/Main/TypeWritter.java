package sample.Main;

import java.io.*;

public class TypeWritter {

    private File file;
	private final String baseDir = "dbs/";
    
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

    public boolean crearCarpeta(String s){
		file = new File(baseDir + s);
		return file.mkdirs();
	}
	
	public boolean borrarCarpeta(String s){
		file = new File(baseDir + s);
		return file.delete();
	}
	
	public boolean renombrarCarpeta(String sOld, String sNew){
		file = new File(baseDir + sOld);
		return file.renameTo(new File(baseDir + sNew));
	}
	
	public boolean crearArchivo(String s, String aditionalPath){
            file = new File(baseDir + aditionalPath + s);
            try {
                    return file.createNewFile();
            } catch (IOException e) {
                    return false;
            } 
	}
	
	public boolean borrarArchivo(String s, String aditionalPath){
		file = new File(baseDir + aditionalPath + s);
		return file.delete();
	}
	
	public boolean renombrarArchivo(String sOld, String sNew, String aditionalPath){
		file = new File(baseDir + aditionalPath + sOld);
		return file.renameTo(new File(baseDir + aditionalPath + sNew));
	}
	
	
	public boolean escribirArchivo(String s, String aditionalPath, String text){
		PrintWriter writer;
		try {
			writer = new PrintWriter(baseDir + aditionalPath + s, "UTF-8");
			writer.println(text);
			writer.close();
			return true;
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			return false;
		}
		
	}
	
	public ArrayList<String> getAllFolders(){
		ArrayList<String> a = new ArrayList<>();
		File folder = new File(baseDir);
		File[] listOfFiles = folder.listFiles();

            for (File listOfFile : listOfFiles) {
                if (listOfFile.isDirectory()) {
                    a.add(listOfFile.getName());
                }
            }
		return a;
	}
	
	public ArrayList<String> getAllFiles(String aditionalPath){
		ArrayList<String> a = new ArrayList<>();
		File folder = new File(baseDir + aditionalPath);
		File[] listOfFiles = folder.listFiles();

                for (File listOfFile : listOfFiles) {
                    if (listOfFile.isFile()) {
                        a.add(listOfFile.getName());
                    }
                }
		return a;
	}
	
	public String leerArchivo(String s, String aditionalPath){
            BufferedReader br = null;
            String text = "";
            try {
                    String sCurrentLine;
                    br = new BufferedReader(new FileReader(baseDir + aditionalPath + s));

                    while ((sCurrentLine = br.readLine()) != null) {
                            text += sCurrentLine;
                    }

            } catch (IOException e) {
            } finally {
                    try {
                            if (br != null)br.close();
                    } catch (IOException ex) {
                    }
            }
            return text;
	}

}
