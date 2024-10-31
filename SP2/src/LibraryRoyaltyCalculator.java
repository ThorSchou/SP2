public class LibraryRoyaltyCalculator {


    public static void main(String[] args) {

        Author author = new Author("Sussi Bech");
        PrintedBook printBook1 = new PrintedBook("printBook1","BI",10,50);
        PrintedBook printBook2 = new PrintedBook("printBook2","LYRIK",100,150);
        AudioBook audioBook1 = new AudioBook("audioBook1", "TE",20, 240);

        author.addTitles(printBook1);
        author.addTitles(printBook2);
        author.addTitles(audioBook1);

        System.out.printf("%s: %.2fkr", author.getName(), author.calculateTotalPay());


    }
}