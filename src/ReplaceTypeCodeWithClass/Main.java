package ReplaceTypeCodeWithClass;

public class Main {

    public static void main(String[] args) {
        Item book = new Item(
            ItemType.BOOK,
            "世界の歴史",
            4800
        );

        Item dvd = new Item(
            ItemType.DVD,
            "ニューヨークの夢・特別版",
            3000
        );

        Item soft = new Item(
            ItemType.SOFTWARE,
            "チューリングマシンエミュレータ",
            3200
        );

        System.out.println("book = " + book.toString());
        System.out.println("dvd = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
