/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/9/7 下午5:31
 * @Version 1.0
 */

public class Student implements Person {


    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
