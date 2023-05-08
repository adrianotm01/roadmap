package main.java.filesandapi.exception;

public class NameSerivce {

    public void changeName(String name){
        if (name == null) {
            throw new InvalidNameException("Name is invalid");
        }
    }

}
