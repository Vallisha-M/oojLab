public class Son extends Father{
    String message1 = "Son's age cannot be less than zero";
    String message2 = "Age of son can't be greater than age of father";
    int age; 
    Son(int sonAge, int fatherAge) throws AgeLessThanZeroException, SonOlderThanFatherException {
    super(fatherAge);
    if(sonAge<0)
        throw new AgeLessThanZeroException(message1);
    if(sonAge>=fatherAge)
        throw new SonOlderThanFatherException(message2);
    age = sonAge;
   }
}
