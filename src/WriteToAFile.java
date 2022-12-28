import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/poem.txt");
            // FileWriter needs to be inside try catch block

            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}
