package main.java.com.codecool.forum;

public class Forum {

    private static Forum instance = null;

    private Forum() {}

    public static Forum getInstance() {
        if (instance == null) {
            instance = new Forum();
        }
        return instance;
    }
}
