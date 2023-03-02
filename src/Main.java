import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Student s1=new Student("james","gosling","0987654");
        Student s2=new Student("dennis","Ritchie","1234567");
        lab l1=new lab("Mr.Smith","Monday",5);
        s1.setGrade(18);
        s2.setGrade(17.5);
        System.out.println();
        System.out.println("----- for show information of student -----");
        s1.PrintStudentInfo();
        s2.PrintStudentInfo();
        System.out.println();
        System.out.println("----- for show information of laboratory-----");
        l1.printLabInfo();
        l1.calAve();

//Etod red=new Etod("uyt","red",9);
//Etod blue=new Etod("yt","blue",7);
////System.out.println(red.color);
//red.push();
//blue.drawing();
//System.out.println(pow2('o',9,7.8f));
//Main t=new Main();
//        System.out.println(t.pow3(6));
//       System.out.println (String.valueOf(12));
//        String s="Hello";
//        System.out.println(s.toUpperCase());
//        Scanner in=new Scanner(System.in);
//    System.out.println(profit(in.nextFloat()));
//    System.out.println(profit(2,6));
//    Etod e=new Etod("blue",8,"red");
//   //e.getInfo();
//   //System.out.println(e.brand);
//  // System.out.println(Etod.brand);
//        String newColor="";
//    for(int i=0 ; i<10 ;i++)
//    }
//    newColor=in.nextLine();
    }
}

















