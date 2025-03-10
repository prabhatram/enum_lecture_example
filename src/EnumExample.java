
enum Directions{
    NORTH, SOUTH, EAST, WEST;
}


public class EnumExample{

    enum Books{
        ALICE_IN_WONDERLAND("Alice in Wonderland", "Lewis Carroll", 1865, 150, 8.99),
        THE_ADVENTURES_OF_TOM_SAWYER("The Adventures of Tom Sawyer", "Mark Twain", 1876, 200, 9.99),
        THE_ADVENTURES_OF_HUCK_FINN("The Adventures of Huck Finn", "Mark Twain", 1876, 200, 9.99);

        private String title;
        private String author;
        private int year;
        private int pages;
        private double price;

        Books(String title, String author, int year, int pages, double price){
            this.title = title;
            this.author = author;
            this.year = year;
            this.pages = pages;
            this.price = price;
        }

        public String getTitle(){
            return title;
        }

        public String getAuthor(){
            return author;

        }

        public int getYear(){
            return year;
        }

        public int getPages(){
            return pages;
        }

        public double getPrice(){
            return price;
        }

        public String toString(){
            return "Book Name: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nPages: " + pages + "\nPrice: " + price;
        }
    }



    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    
    enum Months{
        JANUARY("Start of a new year", 1), 
        FEBRUARY("something", 2);
        
        private final String description;
        private final int monthNumber;

        Months(String description, int monthNumber){
            this.description = description;
            this.monthNumber = monthNumber;
        }

        public String getDescription(){
            return description;
        }

        public int getMonthNumber(){
            return monthNumber;
        }

        public String toString(){
            return "This comes from toString(): " + description + " and the month number is: " + monthNumber;
        }

    }


}



