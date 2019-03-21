package ch07.service;

public class PC {
	public void show() {
		Member[] mem = select();
		for(Member m : mem) {
			System.out.println(m.id);
			System.out.println(m.pw);
		}
	}
	public Member[] select() {
		Member[] mem = new Member[5];
		for(int i = 0; i < 5; i++) {
			//DB 초기화  --> 배열에 담음
			Member m = new Member();
			m.id = "id" + i;
			m.pw = "pw" + i;
			mem[i] = m;
		}
		return mem;
	}
}

