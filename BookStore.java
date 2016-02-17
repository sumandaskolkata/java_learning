//making constructor private and accessing through a function in class.
class Book {
  public String name;

  public String author;

  public int price;

  private Book (String name,String author,int price){
    this.name=name;
    this.author=author;
    this.price=price;
  }
  public static Book createBook(String name,String author,int price){
    return new Book(name,author,price);
  }
  public void print(){
    System.out.println("book name "+this.name+" writen by "+this.author+" price is "+this.price);
  }
}
class BookStore {
    public static void main(String[] args) {
      Book history = Book.createBook("History","Ramu",55);
      history.print();
    }
}
