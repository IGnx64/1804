public class Sub_class extends Super_class{
    int num =70;
    public void display(){
        System.out.println("Этот метод display подкласса");
    }
    public void myMethod(){
        Syb_class sub = new Sub_class();
        sub.display();
        super.display();
        System.out.println("Значение переменной num в подклассе: " );
    }
}
