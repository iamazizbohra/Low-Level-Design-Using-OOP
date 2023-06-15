package linkedIn;

import linkedIn.user.Member;

import java.util.List;

public interface searchable {
    public List<Member> searchMember(String name);

    public List<Company> searchCompany(String name);

    public List<JobPosting> searchJob(String title);
}
