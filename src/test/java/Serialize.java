import java.io.*;
 
public class Serialize {
  public static void main(String... args) throws Exception {
    try (var fos = new FileOutputStream("serial.data");
         var oos = new ObjectOutputStream(fos)) {
      oos.writeObject(new RangeClass(100, 1));
      oos.writeObject(new RangeRecord(100, 1));
    }
  }
}
