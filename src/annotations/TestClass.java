package annotations;

/**
 * Created by vishal on 22/5/15.
 */
@TesterInfo(lastModifiedBy = "VJ",
            createdAt = "22/05/2015",
            priority = Priority.HIGH)
public class TestClass {

    @Test(enabled = false)
    void test1(){
        System.out.println("Hey its test1()");
    }

    @Test(enabled = true)
    void test2(){
        System.out.println("Hey its test2()");
    }

    void test3(){
        System.out.println("Hey its test3()");
    }
}
