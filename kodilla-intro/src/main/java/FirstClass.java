public class FirstClass {
        public static void main(String[] args) {
        User users[] = new User[4];

        users[0] = new User("Marek", 30);
        users[1] = new User("Ula", 33);
        users[2] = new User("Sebastian", 40);
        users[3] = new User("Kris", 36);


        /* int index = 0;
        int oldest = users[0].age;

        for (int a = 0; a < users.length; a++) {
            if (users[a].age > oldest)
                index = a;
                oldest = users[a].age;
            } */
        double sum = 0;
        for( int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;

        }
        /*int size;
        size = users.length;*/

        double averageAge;
        averageAge = sum / users.length;


        for(int x = 0; x < users.length; x++) {
            if(users[x].age < averageAge) { System.out.println(users[x].name + users[x].age); }

        }


        /*System.out.println("Person: " + users[index].name + "is the oldest:" + users[index].age); */
        System.out.println(sum);
        System.out.println(averageAge);
        /*System.out.println(size);*/



    }
    }
       /* int maxage;
        int i;


        maxage = users[0].age;

        for (i = 0; i < users.length; i++) {
            if (users[i].age > maxage) maxage = users[i].age;
        }
        System.out.println("Najstarsza osoba ma:" + maxage);

    }*/

        /*for(int i=0; i<users.length; i++) { System.out.println("Co t" + users[i].age); }*/



       /*
        User marek = new User("Marek", 30);

        System.out.println("Name" + " " + marek.name + " " + "Age" + " " + marek.age);

        User ula = new User("Ula", 33);

        System.out.println("Name" + " " + ula.name + " " + "Age" + " " + ula.age);

        User sebastian = new User("Sebastian", 40);

        System.out.println("Name" + " " + sebastian.name + " " + "Age" + " " + sebastian.age); */

/*
        Int = new oldest(String[] this.name, int[] this.age)
        {
            int index = 0;
            int oldest = age[0];
            for ( int i=0; i < age.length; i++)
            {

                if(age[i] > oldest)
                {index = i;
                    oldest = age[i];
                }

                System.out.println("Person" + name[index] + "is the oldest:" +     age    [index]);
            } */



       /* User[] users = {marek, ula, sebastian};

            System.out.println(users);

        int itemsnumbers;
        itemsnumbers = users.length;

        System.out.println(itemsnumbers);*/








       /* Notebook notebook = new Notebook(600, 1000, 2020
        );

        System.out.println("Weight" + " " + notebook.weight + " " + "Price" + " " + notebook.price + " " + "Year" + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);


        Notebook heavyNotebook = new Notebook(2000, 1500, 2016
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

        LeapYear leapyear = new LeapYear(2000);

        leapyear.checkLeapYear(); */










