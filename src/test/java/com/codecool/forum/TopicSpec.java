package test.java.com.codecool.forum;

import main.java.com.codecool.forum.Comment;
import main.java.com.codecool.forum.Topic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopicSpec {

    private Topic topic;

    @BeforeEach
    public void before() {
        this.topic = new Topic("Topic", "Message");
    }

    @Test
    public void whenInstantiatedThenMessageAndTitleIsSet() {
        assertEquals("Topic", topic.getTitle());
        assertEquals("Message", topic.getMessage());
    }

    @Test
    public void whenAddCommentThenCommentIsAdded() {
        Comment comment = new Comment("Comment1");
        this.topic.addComment(comment);
        assertEquals(1, topic.getComments().size());
    }

    @Test
    public void whenGetModeratedCommentsThenReturnCommentsWhichAreModerated() {
        Comment comment1 = new Comment("Comment1");
        Comment comment2 = new Comment("Comment2");
        Comment comment3 = new Comment("Comment3");
        comment1.toggleModeration();
        comment3.toggleModeration();
        List<Comment> moderatedComments = Arrays.asList(comment1, comment3);
        topic.addComment(comment1);
        topic.addComment(comment2);
        topic.addComment(comment3);
        assertArrayEquals(moderatedComments.toArray(), topic.getModeratedComments().toArray());
    }
}
