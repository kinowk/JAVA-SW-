package day1109;

/**
 * ���� Ư¡�� Person class���� ����ϰ�, �ڽŸ��� Ư¡�� �ڽ�Ŭ������ �����Ͽ� ���
 * 
 * @author owner
 */
public class Clark extends Person {
	public int power;

	/**
	 * �Ϲ����� power�� 2, Clark ���� power
	 */
	public Clark() {
		power = 7;
	}// Clark

	/**
	 * Clark�� power�� stone�� ���� ����
	 * 
	 * @param stone Stone Type
	 * @return Result By Stone
	 */
	public String power(String stone) {
		String result = null;
		if (stone.equals("���̾Ƹ��")) {
			power = 10;
			result = "�����մϴ�.";
		} else if (stone.equals("ũ���䳪��Ʈ")) {
			power = 0;
			result = "���� �������.";
		} else {
			power = 11;
			result = "���� ����";
		}
		return result;
	}// power

	/**
	 * Person�� eat()�� �ڽ�Ŭ������ �����ϰ� ������ - Override
	 */
	@Override
	public String eat() {
		// name�� ���������ڴ� private�̹Ƿ� �ڽ�Ŭ�������� ����� �� ����.
		// �θ�Ŭ������ private variable�� setter method, getter method�� ����Ͽ� ����
		return getName() + "��(��) ������ ���� �Դ´�.";
	}

	@Override
	public String eat(String menu, int price) {
		return getName() + "��(��) ����������� " + menu + "��(��) " + price + "�޷� �ְ� ��Ծ���.";
	}
}// class
