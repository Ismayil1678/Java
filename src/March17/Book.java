package March17;

public class Book {
    private String Title;
    private String Author;
    private String ISBN;   //WE assumed same ISBN number star 0;
    private int Page;
    private boolean Availability;
    private String BorrowDate;
    private String ReturnDate;

    public Book(String Title, String Author, String ISBN, int Page, boolean Availability, String BorrowDate, String ReturnDate) {
        this.Title = Title;
        this.Author = Author;
        this.Availability = Availability;
        this.ISBN = ISBN;
        this.Page = Page;
        this.BorrowDate = BorrowDate;
        this.ReturnDate = ReturnDate;


    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        BorrowDate = borrowDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }

    public void borrowDate(String date) {
        if (this.Availability) {
            this.Availability = false;
            String[] arr = date.split("/");
            int month = Integer.parseInt(arr[0]);
            int day = Integer.parseInt(arr[1]);
            if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
                this.BorrowDate = date;
            } else {
                System.out.println("Date is not correct");
            }

        }
         else {
            System.out.println("Book is not availability");

        }
    }

    public  void  ReturnBook(String date){
        this.Availability=true;
        String [] MyArr=date.split("/");
        int Month=Integer.parseInt(MyArr[0]);
        int day=Integer.parseInt(MyArr[1]);
        if ((Month>0 &&Month<13) &&(day>0 &&day<32)){
            this.ReturnDate=date;
        } else {
            System.out.println("Date is wrong");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Page=" + Page +
                ", Availability=" + Availability +
                ", BorrowDate='" + BorrowDate + '\'' +
                ", ReturnDate='" + ReturnDate + '\'' +
                '}';
    }
}
