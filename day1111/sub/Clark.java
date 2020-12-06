package day1111.sub;

/**
 * ���� Ư¡�� Person class���� ����ϰ�, �ڽŸ��� Ư¡�� �ڽ�Ŭ������ �����Ͽ� ���<br>
 * ������ ���� Fly interface ����
 * 
 * @author owner
 */
public class Clark extends Person implements Fly {
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

	@Override
	public String[] language() {
		String[] language = new String[3];
		language[0] = "����";
		language[1] = "���Ͼ�";
		language[2] = "�ܰ��";
		return language;
	}

	// Fly interface�� abstract method

	@Override
	public int upwardForce() {
		return 100;
	}

	@Override
	public int drivingForce() {
		return 400;
	}

}// class
