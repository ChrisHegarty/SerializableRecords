import java.io.*;
import static java.lang.System.out;
 
public class Deserialize {
  public static void main(String... args) throws Exception {
    try (var fis = new FileInputStream("serial.data");
         var ois = new ObjectInputStream(fis)) {
      out.println(ois.readObject());
      out.println(ois.readObject());
    }
  }
}
