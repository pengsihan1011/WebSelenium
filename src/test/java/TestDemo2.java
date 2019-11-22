public class TestDemo2 {

    String name;
    static int age;

    public String toString(){
        return "Name:"+ name + "," + "Age:" + age;
    }

    public static void main(String[] args){
        TestDemo2 p1 = new TestDemo2();
        p1.name = "zhangsan";
        p1.age = 10;

        TestDemo2 p2 = new TestDemo2();
        p2.name = "lisi";
        p2.age = 9;

        System.out.println(p1);
        System.out.println(p2);
    }


}
