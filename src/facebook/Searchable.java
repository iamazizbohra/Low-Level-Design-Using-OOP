package facebook;

import facebook.user.Member;

import java.util.List;

public interface Searchable {
    public List<Member> searchMember(String name);

    public List<Group> searchGroup(String name);

    public List<Page> searchPage(String name);

    public List<Post> searchPost(String word);
}
