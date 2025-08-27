package java_advanced_01.day22.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance =(int) ois.readObject();
    }
}
