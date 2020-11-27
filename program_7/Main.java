public class Main {
    public static void main(String args[]) {
        TwoGen<Integer, String>  obj  =new TwoGen<Integer, String>(99, "Java");
        obj.showType();
        int v= obj.getObj1();
        String str = obj.getObj2();
        System.out.println("Integer value : "+v);
        System.out.println("String value : "+str);

    }
}
