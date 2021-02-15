package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> postList;

    public PostFinder(List<Post> postList) {
        this.postList = new ArrayList<>(postList);
    }

    public List<Post> findPostsFor(String user) {
        List<Post> resultList = new ArrayList<>();
        for (Post post : postList) {
            if (post.getContent().isEmpty() && post.getTitle().isEmpty()) {
                throw new IllegalArgumentException("Wrong parameters!");
            }
            if (post.getOwner().equals(user) && post.getPublishedAt().isBefore(LocalDate.now())) {
                resultList.add(post);
            }
        }
        return resultList;
    }
}
