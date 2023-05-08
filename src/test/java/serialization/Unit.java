package serialization;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import run.Main;
import main.java.filesandapi.serialization.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit {

    @Test
    public void testando() throws IOException, ClassNotFoundException {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            Person p  = Main.callDeserialization();

        });
    }
}
