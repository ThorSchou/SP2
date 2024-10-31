import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name){
        this.name = name;

    }

    public double calculateTotalPay(){
        double totalPay = 0;
        for (Title t:titles){
            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }

    public void addTitles(Title title) {
        titles.add(title);
    }

    public ArrayList<Title> getTitles(){
        return titles;
    }

    public String getName(){
        return name;
    }

}
