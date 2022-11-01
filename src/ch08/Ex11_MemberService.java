package ch08;

public interface Ex11_MemberService {
	void register(String id, String password, String name);
	void printAllMembers();
	Ex11_Member findById(String id);
	boolean login(String id, String password);
	void logout(String id);
}
