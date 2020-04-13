public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if(this.price >= 600 && this.price < 1000) {
            System.out.println("The price is good.");
        }
        else  {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
    if(this.weight < 700) {
        System.out.println("This notebook is very light.");
    }
    else if(this.weight >= 700 && this.weight < 1500) {
        System.out.println("This notebook is medium weight.");
    }
    else {
        System.out.println("This notebook is heavy.");
    }
    }

    public void checkYear() {
        if(this.year > 2019 ) {
            System.out.println("This notebook is new.");
        }
        else if(this.year > 2005 && this.year <= 2019) {
            System.out.println("This notebook is old.");
        }
        else {
            System.out.println("This notebook is very old.");
        }
    }

}
