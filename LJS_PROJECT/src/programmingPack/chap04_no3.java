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
		System.out.println("�̸� : " + name);
		System.out.println("���̵� : " + m.getId());
		System.out.println("��й�ȣ : " + m.getPwd());
		System.out.println("���� : " + m.getAge());
		m.setAge(30);
		System.out.println("���� ������ ��� ��");
		System.out.println("���� : " + m.getAge());
	}

}
