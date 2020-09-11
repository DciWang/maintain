import java.lang.reflect.Method;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/9/7 下午5:33
 * @Version 1.0
 */

public class Proxy implements Person {

    //被代理的学生
    Student stu;

    public Proxy(Person zhangsan) {
    }

    public void StudentsProxy(Person stu) {
        // 只代理学生对象
        if(stu.getClass() == Student.class) {
            this.stu = (Student)stu;
        }
    }

    //代理上交班费，调用被代理学生的上交班费行为
    public void giveMoney() {
        stu.giveMoney();
    }

    public static void main(String[] args) {
        //被代理的学生张三，他的班费上交有代理对象monitor（班长）完成
        Person zhangsan = new Student("张三");

        //生成代理对象，并将张三传给代理对象
        Person monitor = new Proxy(zhangsan);

        //班长代理上交班费
        monitor.giveMoney();
    }
}
