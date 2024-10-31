public class AudioBook extends Title {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title,literatureType,copies);


    }

    @Override
    double calculatePoints() {


        return 0;
    }

    @Override
    double calculateLiteraturePoints() {
        return 0;
    }
}
