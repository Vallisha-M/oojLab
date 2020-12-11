public class Father {
    int age;
    String message = "Father's age cannot be less than zero";
    Father(){}
    Father(int age)throws AgeLessThanZeroException {
        if(age<0)
            throw new AgeLessThanZeroException(message);
        this.age = age;
    }
}