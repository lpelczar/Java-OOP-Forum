package main.java.com.codecool.forum;

public class Comment extends Entry {

    private boolean moderated = false;

    public Comment(String message) {
        super.setMessage(message);
    }

    public void toggleModeration() {
        this.moderated = true;
    }

    public boolean isModerated() {
        return moderated;
    }

    @Override
    public String toString() {
        return super.toString() + " Moderated: " + moderated;
    }
}
