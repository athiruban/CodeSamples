package athilabs;

public class PrintClass{

	public void displayCoderName(){
		System.out.println("Coded by <Athiruban SM>");
	}

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		PrintClass pclassobj = new PrintClass();
		
        /* the classname should be fully qualified */
		Class classObj = Class.forName("athilabs.PrintClass");
		System.out.println("Class Name is " + classObj.getName());

		/* the default class loader */
		ClassLoader cloader = classObj.getClassLoader();
		System.out.println("Class Loader is " + cloader.toString());
		
        /* newInstance() return type is object */
		PrintClass insObj = (PrintClass) classObj.newInstance();
		System.out.println("Creating object using newInstance"+insObj.toString());
		
        /* we can use the instance to invoke methods */
		insObj.displayCoderName();

		System.out.println("JFrame interfaces");
		
        Class frameCls = Class.forName("javax.swing.JFrame");
		Class []frameInf = frameCls.getInterfaces();		
        for (int i=0; i<frameInf.length; i++)
			System.out.println(frameInf[i].getName());
		System.out.println("\n");
		
        Class []frameClss = frameCls.getClasses();
		for (int i=0; i<frameClss.length; i++)
			System.out.println(frameClss[i].getName());

		System.out.println("JPanel interfaces");

		Class panelCls = Class.forName("javax.swing.JPanel");
		Class []panelInf = panelCls.getInterfaces();
		for (int i=0; i<panelInf.length; i++)
			System.out.println(panelInf[i].getName());
	}
}
