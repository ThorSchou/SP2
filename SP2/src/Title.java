public abstract class Title {

    private String title;
    private int literatureTypePoints;
    int copies;
    double rate;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.copies = copies;
    }


    public double calculateRoyalty(){
        return 0;
    }

    abstract double calculatePoints();

    abstract double calculateLiteraturePoints();
}
