import java.lang.reflect.Method;
import java.lang.reflect.Field;

/*
 * Program to explain various uses of reflection and its pitfalls.
 * This activity is to practise the Heniz video tutorial about Java Reflections
 */

 class TestReflection {
   public static void main(String ... args) throws ClassNotFoundException {

     //Class<String> clazz = Class.forName("java.lang.String"); // compiler error
     Class<String> clazz = (Class<String>) Class.forName("java.lang.String");
     System.out.println("Type parameters will be lost during compilation");

     //other ways of getting information about class object

     Class<String> clazz2 = String.class; // ok no problem

     try {
       String stringref = (String) Class.forName("java.lang.String").newInstance();
     }
     catch (InstantiationException e) {
       // occurs when we are not giving the required parameters to instantiate a class or incorrect initialization done in target class.
       System.out.println(e);
     }
     catch (IllegalAccessException e) {
       // occurs when we try to initialize invisible class types. Like "java.lang.System" class
       System.out.println(e);
     }

     /*
      * Using methods of class 'Class'
      */
     try {

       Class<String> clazz3 = (Class<String>) Class.forName("java.lang.String");

       // public methods
       Method[] methods = clazz3.getMethods();

       System.out.printf("\nPublic Methods\n");
       for (Method method : methods) {
         //System.out.println (method.toString());
       }

       // all methods
       methods = clazz3.getDeclaredMethods();

       System.out.printf("\nDeclared Methods\n");
       for (Method method : methods) {
         //System.out.println (method.toString());
       }

       //invoke a method
       Method toUpperCaseMethod = clazz3.getMethod("toUpperCase");
       System.out.println(toUpperCaseMethod.invoke("Hello"));

       // invoke a method without passing argument
       Method charAtMethod = clazz3.getMethod("charAt", int.class);
       System.out.println(charAtMethod.invoke("Hello", 2));

       // int.class is existing!!!!!!!!!!!!!!!!!!!
     }
     catch (NoSuchMethodException e) {
       // occurs when either 'blank' or not exising method name is passed
       System.out.println(e);
     }
     catch (Throwable e) {
       // occurs when we are not giving the required parameters to instantiate a class or incorrect initialization done in target class.
       System.out.println(e);
     }
   }
 }
