/**
	public ���η���Java����JVM���ã�Ϊ����JVM���ɵĵ������main����������ʹ��public���η�����

	static ���η���JVM�������������ʱ�������ȴ���������Ķ���Ȼ��ͨ���ö��������ø���������
	JVMֱ��ͨ�����������������������ʹ��static���η���

	void ����ֵ����Ϊ��������JVM���ã��÷����ķ���ֵҲҪ���ظ�JVM����û���κ����壬���main()
	����û�з���ֵ

	�ַ��������βΣ����ݷ������ù���˭���÷�����˭����Ϊ�βθ�ֵ��main()������JVM���ã���
	args�β���JVM����ֵ��JVMͨ��ִ�����������ַ����β���������ֵ�����³���
*/

public class MainTest
{
	public static void main(String [] args)
		{
			//���args����ĳ���
			System.out.println(args.length);
			//����args�����Ԫ��
			for(String arg:args)
				{
					System.out.println(arg);
				}
		}
}