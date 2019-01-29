package ExtractClass;

public class Main {

    public static void main(String[] args) {
        Book refactoring = new Book(
            "Refactoring: improving the design of existing code",
                "ISBN201485672",
                "$44.95",
                "Martin Fowler",
                "fowler@acm.org"
        );

        Book math = new Book(
            "プログラマの数学",
                "ISBN479329734",
                "\\2310",
                "結城浩",
                "hyuki@hyuki.com"
        );

        System.out.println("refactoring:");
        System.out.println(refactoring.toXml());

        System.out.println("math:");
        System.out.println(math.toXml());
    }
}
