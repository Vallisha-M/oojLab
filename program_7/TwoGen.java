public class TwoGen<T, V> {
    T obj1;
    V obj2;
    TwoGen(T ob1, V ob2) {
        obj1 = ob1;
        obj2 = ob2;
    }
    void showType() {
        System.out.println("Type of T is "+obj1.getClass().getName());
        System.out.println("Type of V is "+obj2.getClass().getName());
    }
    T getObj1() {
        return obj1;
    }
    V getObj2() {
        return obj2;
    }
}
