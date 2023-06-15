package linkedIn;

import linkedIn.user.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchIndex {
    HashMap<String, List<Member>> memberNames;
    HashMap<String, List<Company>> companyNames;
    HashMap<String, List<JobPosting>> jobTitles;

    public void addMember(Member member) {
        if (memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), new ArrayList<Member>());
        }
    }

    public void addCompany(Company company) {
    }

    public void addJobPosting(JobPosting jobPosting) {
    }

    public List<Member> searchMember(String name) {
        return memberNames.get(name);
    }

    public List<Company> searchCompany(String name) {
        return companyNames.get(name);
    }

    public List<JobPosting> searchJob(String title) {
        return jobTitles.get(title);
    }
}
