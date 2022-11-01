package ch08;

public class Ex11_ArrayMemberService implements Ex11_MemberService {
	private Ex11_Member[] members = new Ex11_Member[10];
	
	@Override
	public void register(String id, String password, String name) {
		Ex11_Member member = findById(id);
		if (member != null)	{		// 동일한 id가 이미 존재함
			System.out.println("id가 중복되었습니다.");
			return;
		}
		member = new Ex11_Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Ex11_Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}
	}

	@Override
	public Ex11_Member findById(String id) {
		for (Ex11_Member member : members) {
			if (member == null)		// id 에 해당하는 member를 못찾고 끝까지 간 경우
				break;
			if (id.equals(member.getId()))		// id에 해당하는 member를 찾은 경우
				return member;
		}
		return null;
	}

	@Override
	public boolean login(String id, String password) {
		Ex11_Member member = findById(id);
		if (member == null)			// id에 해당하는 member가 없는 경우
			return false;				
		else {						// id에 해당하는 member를 찾은 경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다.");
				return true;
			} else					// 패스워드가 틀린 경우
				return false;
		}
	}

	@Override
	public void logout(String id) {
		Ex11_Member member = findById(id);
		System.out.println(member.getName() + "님 로그아웃 되셨습니다.");
	}
}
