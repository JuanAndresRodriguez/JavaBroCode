package Deserialization.deserializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class MainDeserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        * Steps to Deserialize
        * ------------------------------------------------------------
        * 1. Declare your object (don't instantiate)
        * 2. Your class should implement Serializable interface
        * 3. Add import java.io.Serializable;
        * 4. FileInputStream fileIn = new FileInputStream(file path);
        * 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        * 6. objectNam = (Class) in.readObject();
        * 7. in.close(); fileIn.close();
        * ------------------------------------------------------------
        */

        User user = new User();
        FileInputStream fileIn = new FileInputStream("src/Serialization/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
