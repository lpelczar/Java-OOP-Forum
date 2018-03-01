package main.java.com.codecool.forum;

public class App {

    public static void main(String... args) {

        Forum forum = Forum.getInstance();
        Comment comment1 = new Comment("Comment1");
        Comment comment2 = new Comment("Comment2");
        Comment comment3 = new Comment("Comment3");
        comment2.toggleModeration();
        System.out.println(comment1);
        System.out.println(comment2);
        System.out.println(comment3);

        Topic topic = new Topic("Title", "Message");
        System.out.println();
        System.out.println(topic);

        topic.addComment(comment1);
        topic.addComment(comment2);
        topic.addComment(comment3);
        forum.addTopic(topic);

        System.out.println();
        for (Topic t : forum.getTopics()) {
            System.out.println(t);
        }

        System.out.println();
        for (Comment c : topic.getComments()) {
            System.out.println(c);
        }

        System.out.println();
        for (Comment c : topic.getModeratedComments()) {
            System.out.println(c);
        }
    }
}
