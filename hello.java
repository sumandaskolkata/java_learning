class Person{
  private String name;

  private int age;

  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void print(){
    System.out.println("the person is "+this.name+"age is "+this.age);
  }
}
class hello{
  public static void main(String[] args) {
    System.out.println("hello world");
    Person suman=new Person("suman",22);
    suman.print();
  }
}
