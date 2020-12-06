package day1109;

/**
 * ��Ӱ����� class���� �θ�Ŭ������ ��üȭ�Ͽ� ����ϴ� �� ����, �ڽ�Ŭ������ ��üȭ�Ͽ� ����ϴ� ���� �� ����.
 * 
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		HongGilDong hgd = new HongGilDong(); // �ڽ��� �����ϸ� �θ� ���� �����ȴ�.
		Clark superman = new Clark();

		hgd.setName("ȫ�浿"); // �θ�Ŭ������ method
		superman.setName("Ŭ��"); // �θ�Ŭ������ method

		System.out.println(
				hgd.getName() + "�� �� " + hgd.getEye() + "��, �� " + hgd.getNose() + "��, �� " + hgd.getMouth() + "��");
		System.out.println(superman.getName() + "�� �� " + superman.getEye() + "��, �� " + superman.getNose() + "��, �� "
				+ superman.getMouth() + "��");

		System.out.println(hgd.eat());
		System.out.println(superman.eat()); // �θ�Ŭ������ method ���� �ʿ� -> Override�� method ȣ��
		System.out.println(hgd.eat("����", 1)); // �θ�Ŭ������ method ���� �ʿ� -> Override�� method ȣ��
		System.out.println(superman.eat("������ũ", 10)); // �θ�Ŭ������ method ���� �ʿ� -> Override�� method ȣ��
		System.out.println("--------------------------------------------------------------------------------");
		// �ڽ�Ŭ�������� ������ �ڽŸ��� Ư¡ ȣ��
		System.out.println(hgd.fight(5)); // level : 6 -> 7
		System.out.println(hgd.fight(6)); // level : 7 -> 8
		System.out.println(hgd.fight(8)); // level : 8
		System.out.println(hgd.fight(9)); // level : 8 -> 7
		System.out.println(hgd.fight(7)); // level : 7
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(superman.power("¯��")); // power : 11
		System.out.println(superman.power("ũ���䳪��Ʈ")); // power : 0
		System.out.println(superman.power("���̾Ƹ��")); // power : 10
		System.out.println("--------------------------------------------------------------------------------");

		Park park = new Park();
		park.setName("Park");
		System.out.println("Park�� ���� ���� : " + park.getEye());
		System.out.println("Park�� ���� ���� : " + park.getMouth());
		System.out.println("Park�� ���� ���� : " + park.getNose());
		System.out.println(park.eat());
		System.out.println(park.eat("������", 6500));

		System.out.println(park.did("����", 3)); // score : 90 -> 96
		System.out.println(park.did("����", 4)); // score : 96 -> 80
	}

}
