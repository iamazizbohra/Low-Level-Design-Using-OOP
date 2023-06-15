package facebook;

import facebook.user.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchIndex {
    HashMap<String, List<Member>> memberNames;
    HashMap<String, List<Group>> groupNames;
    HashMap<String, List<Page>> pageTitles;
    HashMap<String, List<Post>> posts;

    public void addMember(Member member) {
        if(memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), new ArrayList<Member>());
        }
    }

    public void addGroup(Group group){}
    public void addPage(Page page){}
    public void addPost(Post post){}

    public List<Member> searchMember(String name) {
        return memberNames.get(name);
    }

    public List<Group> searchGroup(String name) {
        return groupNames.get(name);
    }

    public List<Page> searchPage(String name) {
        return pageTitles.get(name);
    }

    public List<Post> searchPost(String word) {
        return posts.get(word);
    }
}
