import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        String filepath = "newfile.txt";
        BufferedReader br= new BufferedReader(new FileReader(filepath));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
            }
            br.close();
    }
}