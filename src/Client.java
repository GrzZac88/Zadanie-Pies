import java.util.List;

public class Client {

    public static void main(String[] args){

        Dog pies1 = new Dog.Builder()
                .name("Barbas")
                .type("Kundel Pospolity")
                .age(7)
                .toys(List.of("Kij"))
                .build();

        Dog pies2 = new Dog.Builder()
                .name("Burek")
                .type("Jamnik")
                .age(21)
                .toys(List.of("Skarpeta","Ogon Jamnika"))
                .build();

        Dog pies3 = new Dog.Builder()
                .name("Dingo")
                .type("Pies Dingo")
                .age(1)
                .toys(List.of("Bumerang","Pluszowy Kangur"))
                .build();

        System.out.println(pies1);
        System.out.println(pies2);
        System.out.println(pies3);
    }
}
