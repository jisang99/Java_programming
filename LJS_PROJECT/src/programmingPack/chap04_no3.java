package programmingPack;

class Member {
	private String name, id, pwd;
	private int age;

	public Member() {

	}

	public Member(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class chap04_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("ljs", "ee", "12", 24);
		String name = m.getName();
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + m.getId());
		System.out.println("비밀번호 : " + m.getPwd());
		System.out.println("나이 : " + m.getAge());
		m.setAge(30);
		System.out.println("나이 설정자 사용 후");
		System.out.println("나이 : " + m.getAge());
	}

}
