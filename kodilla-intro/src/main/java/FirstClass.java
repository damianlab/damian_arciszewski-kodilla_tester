public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(1500, 1000, 2005
        );
        System.out.println("Weight" + " " + notebook.weight + " " + "Price" + " " + notebook.price + " " + "Year" + " " + notebook.year );
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015
        );
        System.out.println("Weight" + " " + heavyNotebook.weight + " " + "Price" + " " + heavyNotebook.price + " " + "Year" + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 1999
        );
        System.out.println("Weight" + " " + oldNotebook.weight + " " + "Price" + " " + oldNotebook.price + " " + "Year" + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();

    }
}
