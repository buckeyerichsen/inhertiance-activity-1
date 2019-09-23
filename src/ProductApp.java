import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        double price;
        String author;
        int pages;
        String programmer;
        String platform;
        String os;
        String code;
        String description;
        Product c = new Product();
        Book b = new Book();
        Software s = new Software();

        System.out.println("please enter in the stuff");
        Scanner sc = new Scanner(System.in);
        System.out.println("whats the price of the thing");
        price = sc.nextDouble();
        c.setPrice(price);
        sc.nextLine();
        System.out.println("whos the author of the thing");
        author = sc.nextLine();
        b.setAuthor(author);
        System.out.println("how many pages in da thing");
        pages = sc.nextInt();
        b.setPages(pages);
        sc.nextLine();
        System.out.println("who do dang programmer");
        programmer = sc.nextLine();
        s.setProgrammer(programmer);
        System.out.println("what da platform");
        platform = sc.nextLine();
        s.setPlatform(platform);
        System.out.println("how we operating dis joint?");
        os = sc.nextLine();
        s.setOs(os);
        System.out.println("whats the code of the product?");
        code = sc.nextLine();
        c.setCode(code);
        System.out.println("describe the product");
        description = sc.nextLine();
        c.setDescription(description);





        System.out.println((c.toString()));
        System.out.println(b.toString());
        System.out.println((s.toString()));


    }
}
