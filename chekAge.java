public class chekAge {
   public static void main(String[] args) {

    ChekAge("Thammarat" , 20);
   }
   public static void ChekAge(String name , int age) {

    if (age>=60){
        System.err.println(name +" Elderly person");
    }
    else if (age>30){
        System.out.println(name +" Working age");
    }
    else if (age>15) {
        System.out.println(name +" youngger");
    }
    else {
        System.out.println(name +" childhood");
    }

   }
}
