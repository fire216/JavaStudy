package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		
		int age = 0; 
		String name = "";// �������� ���̸� Ȯ���Ͽ� ����
		String type = "";// �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.getAge();
		name = human.getName();
		
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if(age >= 16 && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		if(isPossible(human) == true) 
			result = "������ �����մϴ�"+ human.getName() + "�� �����մϴ�";
			
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		else 
			System.out.println("������ �Ұ����մϴ�");
		
		return result;
	}
}