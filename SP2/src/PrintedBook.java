public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
    }

    @Override
    double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }

    @Override
    double calculateLiteraturePoints() {

        switch ()

        return 0;
    }
}
