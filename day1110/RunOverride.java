package day1110;

public class RunOverride {

	public static void main(String[] args) {
		// �ڽ�Ŭ������ ��ü ����
		OverrideSub overridesub = new OverrideSub();
		OverrideSub2 overridesub2 = new OverrideSub2();

		overridesub.methodA(); // �θ��� method
		overridesub.methodB();

		// ������ - Override
		overridesub2.methodA();
		overridesub2.methodB();
		overridesub2.childMehtod();
		System.out.println("--------------------------------------------");

		// is a ������ ��üȭ - ��ü�������� ���(���� class�� ������� ��ü�� �ٸ� ���� ����)
		// �θ�Ŭ���� ��ü�� = new �ڽ�Ŭ����������();
		// ���������� �θ�Ŭ���� -> �θ��� �ڿ��� ��� ����
		// method�� �κ�Ŭ������ ���� method�� ȣ�� ����
		OverrideSuper overridesuper = new OverrideSub();
		OverrideSuper overridesuper2 = new OverrideSub2();

		overridesuper.methodA(); // Override ���� ���� - �θ��� method
		overridesuper.methodB();

		overridesuper2.methodA(); // Override - �ڽ��� method ȣ��
		overridesuper2.methodB();
		// overridesuper2.childMethod(); // �θ�Ŭ������ ���� method�� ȣ�� ����
	}
}
