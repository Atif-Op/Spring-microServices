@FunctionalInterface
interface a{
    int get(int a,int b);
}
public class test {

    public static void main(String[] args) {
        a obj = (b,a) -> b+a;
        a obj1=(c,d)->c+d;

        System.out.println(obj.get(5,20));
        System.out.println(obj.get(20, 30));
    }
}
