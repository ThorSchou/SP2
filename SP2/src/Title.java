public abstract class Title {

    private String title;
    private String literatureType;
    int copies;
    double rate =  0.067574;

    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.copies = copies;
        this.literatureType = literatureType;

    }

    public String getLiteratureType() {
        return literatureType;
    }

    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    abstract double calculatePoints();

    abstract double calculateLiteraturePoints();
}
