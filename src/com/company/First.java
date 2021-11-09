package com.company;
interface It1{
    int a = 10;
   }
interface It2{
    int a = 1009;
}
class First implements It1,It2{

//public void m1() {
//    System.out.println("interface" + It1.a);
//    System.out.println(It2.a);
//}
    public static void main(String[] args) {
	// write your code here
        System.out.println("interface" + It1.a);
        System.out.println(It2.a);
       // new First().m1();
    }
}
