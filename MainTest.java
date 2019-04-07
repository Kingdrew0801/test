/**
	public 修饰符：Java类由JVM调用，为了让JVM自由的调用这个main（）方法。使用public修饰符修饰

	static 修饰符：JVM调用这个主方法时，不会先创建该主类的对象，然后通过该对象来调用该主方法。
	JVM直接通过该类来调用主方法，因此使用static修饰符。

	void 返回值：因为主方法被JVM调用，该方法的返回值也要返回给JVM，这没有任何意义，因此main()
	方法没有返回值

	字符串数组形参：根据方法调用规则，谁调用方法，谁负责为形参赋值，main()方法由JVM调用，即
	args形参由JVM负责赋值。JVM通过执行命令来给字符串形参数组来赋值（见下程序）
*/

public class MainTest
{
	public static void main(String [] args)
		{
			//输出args数组的长度
			System.out.println(args.length);
			//遍历args数组的元素
			for(String arg:args)
				{
					System.out.println(arg);
				}
		}
}