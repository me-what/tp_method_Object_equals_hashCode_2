public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Junior dev", 300);
        Programmer programmer2 = new Programmer("Junior dev", 300);

        System.out.println(programmer1 == programmer2); // false
        System.out.println(programmer1.equals(programmer2)+"\n"); // true


        Programmer programmer_1 = new Programmer("Junior", 300);
        Programmer programmer_2 = new Programmer("Middle", 300);

        System.out.println(programmer_1 == programmer_2); // false
        System.out.println(programmer_1.equals(programmer_2)+"\n"); // false

        System.out.println("Какие у них хэш-коды?");
        System.out.println("хэш-код у programmer1 :"+programmer1.hashCode());
        System.out.println("хэш-код у programmer2 :"+programmer2.hashCode());
        System.out.println("хэш-код у programmer_1 :"+programmer_1.hashCode());
        System.out.println("хэш-код у programmer_2 :"+programmer_2.hashCode());
    }
}