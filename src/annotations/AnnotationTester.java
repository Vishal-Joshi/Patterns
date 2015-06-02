package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by vishal on 22/5/15.
 */
public class AnnotationTester {
    public static void main(String[] args) throws InstantiationException {
        Class<TestClass> testClassObject = TestClass.class;
        if(testClassObject.isAnnotationPresent(TesterInfo.class)){
            System.out.println("tester info is present");
            for(Method method: testClassObject.getDeclaredMethods()){
                if(method.isAnnotationPresent(Test.class)) {
                    Test annotation = (Test) method.getAnnotation(Test.class);
                    if (annotation.enabled()) {
                        try {
                            method.invoke(testClassObject.newInstance());
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else{
            System.out.println("tester info is NOT present");
        }
    }
}
