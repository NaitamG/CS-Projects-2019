public class Main {
    public static void main(String[] args) {
        ALStack<String> greet = new ALStack<>();
        greet.push("Hello!");
        greet.push("Hola mundo!");
        greet.push("Bonjour monde!");
        System.out.println(greet.pop());
        System.out.println(greet.pop());
        System.out.println(greet.pop());
    }
}
