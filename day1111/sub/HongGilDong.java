package day1111.sub;

/**
 * ���� Ư¡�� Person class���� ����ϰ�, �ڽŸ��� Ư¡�� �ڽ�Ŭ������ �����Ͽ� ���
 * 
 * @author owner
 */
public class HongGilDong extends Person {
	private int level;

	/**
	 * �Ϲ����� level�� 3, �ִ� level�� 10<br>
	 * ȫ�浿�� level�� 6
	 */
	public HongGilDong() {
		level = 6;
	}// HongGilDong

	/**
	 * fight method<br>
	 * ���� level�� ���� �ο�� win, ���� level�� ���� �ο�� draw, ���� level�� ���� �ο�� lose
	 * 
	 * @param yourLevel
	 * @return
	 */
	public String fight(int yourLevel) {
		String result = null;
		if (level < yourLevel) {
			level--;
			if (level < 0) {
				level = 0;
			}
			result = "Lose";
		} else if (level > yourLevel) {
			level++;
			if (level > 10) {
				level = 10;
			}
			result = "Win";
		} else {
			result = "Draw";
		}
		return result;
	}// fight

	/**
	 * �θ�Ŭ�������� �����ϴ� ����� �ڽ�Ŭ������ ���� �ʾ�, �ڽ�Ŭ�������� method�� Override
	 */
	@Override
	public String eat(String menu, int price) {
		return getName() + "��(��) �ָ����� " + menu + "��(��) " + price + "�� �ְ� ��Ծ���.";
	}

	@Override
	public String eat() {
		return getName() + "��(��) ������ ���� �Դ´�.";
	}

	@Override
	public String[] language() {
		String[] language = { "�ѱ���", "������" };
		return language;
	}

} // class
