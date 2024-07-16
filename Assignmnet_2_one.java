
class Person {
   String Name;
   int age;
   char gender;

   void set(String t_name, int t_age, char t_gender) {
      Name = t_name;
      age = t_age;
      gender = t_gender;
   }

   void get() {
      System.out.println("Name:" + Name);
      System.out.println("Age:" + age);
      System.out.println("Name:" + gender);
   }

}

class Assignmnet_2_one {
   public static void main(String args[]) {
      // 1. Create a Person class with the following properties: name, age, and
      // gender. Implement methods to set and get these properties.
      Person p1 = new Person();
      p1.set("Ashish", 20, 'M');
      p1.get();
   }
}
