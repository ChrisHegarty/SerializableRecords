import java.io.*;
 
public class Serialize {
  public static void main(String... args) throws Exception {
    try (var fos = new FileOutputStream("serial.data");
         var oos = new ObjectOutputStream(fos)) {
      oos.writeObject(new SerializableRangeClass(100, 1));
      oos.writeObject(new SerializableRangeRecord(100, 1));
    }
  }
}
