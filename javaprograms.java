abstract class Abstractionexfour 
{
	Abstractionexfour()
	{
		System.out.println("Abstarct cls 0 arg");
	}
	abstract void m1();	
}
class Abstractionexfour1 extends Abstractionexfour
{
	Abstractionexfour1()
	{
		super();
		System.out.println("normal cls 1 arg");
	}
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args)
	{
		  new Abstractionexfour1().m1();	 
	}
}
..........................................................................................
class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
	
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}} 
.........................................................................................
class Ass
{
	int x=50;
	int y=90;
	static void m1()
	{
		Ass t= new Ass();
	System.out.println(t.x);
    System.out.println(t.y);
    }
	static void m2()
	{
		Ass t1= new Ass();
	System.out.println(t1.x);
    System.out.println(t1.y);
    }
	public static void main(String[] args) 
	{
		Ass.m1();
		Ass.m2();
			}
}
............................................................................................
class Assg
{
	int x=50;
	int y=90;
	static int a=60;
    static int b=70;
	void m1()
	{
	System.out.println(x);
    System.out.println(y);
	Assg t= new Assg();
	System.out.println(t.a);
    System.out.println(t.b);
    }
	static void m2()
	{
	Assg t= new Assg();
	System.out.println(t.x);
    System.out.println(t.y);
	System.out.println(Assg.a);
    System.out.println(Assg.b);
	    }
	public static void main(String[] args) 
	{
		Assg t= new Assg();
		t.m1();
		Assg.m2();
			}
}
........................................................................................................
class Consta
{
	{
		System.out.println("Inst bl1");
	}
	static{
		System.out.println("st bl1");
			}
	Consta()
	{
	System.out.println("0 arg const");
	}
    Consta(int a)
    {
    	System.out.println("10");
    }
    public static void main(String[] args)
    {
    new Consta();	
new Consta(10);
    }
}
........................................................................................................
class Constadv
{
	int eid;           //instance variables
	String str;
	float esal;	
	void disp()
	{
		System.out.println("eid="+eid);
		System.out.println("str="+str);
		System.out.println("esal="+esal);
	}
			public static void main(String[] args)
{
				Constadv t = new Constadv();		
		t.disp(); 
			}
}
..................................................................................................................
class Constadvn
{
	int eid;           //instance variables
	String str;
	float esal;	
	Constadvn()       //user defined constructor//to store values to the instance variables
	{
		eid=111;
		str="floag";
		esal=10.00f;				
	}
	void disp()
		{
		System.out.println("eid="+eid);
		System.out.println("str="+str);
		System.out.println("esal="+esal);
	}
			public static void main(String[] args)
{
				Constadvn t = new Constadvn();		
		t.disp(); 
			}
}
............................................................................................................................
class Constdgt
{
	void m1()
	{
		System.out.println("m1 method");
	}
		Constdgt(int a)
	{
		System.out.println("m1 method");
		System.out.println(a);
	}
	public static void main(String[] args)
{
				Constdgt t = new Constdgt(10);		
		t.m1(); // we can call m1 method with any obj//
			}
}
..............................................................................................................................
class Constemp
{
	int eid;
	Constemp(int eid)
	{
		this.eid=eid; 
		//to convert the local to instance we use. with out this code the o/p is 111&0 becoz we r passing 
		//only params to const not for disp() then disp o/p is 0. If we convert then o/p is 1&111
				System.out.println(eid);
	}
	void disp()
	{
		System.out.println(eid);
	}
	public static void main(String[] args)
	{
	Constemp e = new Constemp(111);
	e.disp();	
	}
	}
..........................................................................................................................................
class Constmul
{
	int eid;           //instance variables
	String ename;
	float esal;	
	Constmul(int eid,String ename,float esal) //local variables
	{	
		this.eid=eid;   
		//converting local to instance values to print the disp() without conversion the o/p is null
		this.ename=ename;
		this.esal=esal;	
			}
	void disp()
		{
		System.out.println("eid="+eid);
		System.out.println("str="+ename);
		System.out.println("esal="+esal);
	}
			public static void main(String[] args)
{
				Constmul t = new Constmul(111,"mouni",1000.00f);
						t.disp(); 
				Constmul t1 = new Constmul(112,"mouli",1020.00f);
				t1.disp();
			}
}
.................................................................................................................................................................
class Constructordefault
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Constructordefault()
	{
		System.out.println("default contrsuctor");	
	}
	public static void main(String[] args)
{
		Constructordefault t = new Constructordefault();
	t.m1();
	}
}
..........................................................................................................................
class Constructoruser
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Constructoruser()
	{
		System.out.println("default contrsuctor");	
	}
	Constructoruser(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
{
				Constructoruser t1 = new Constructoruser(10);		
	t1.m1(); // we can call m1 method with any obj//
	}
}
....................................................................................................................................
class Constthree
{
	void m1()
	{
		System.out.println("m1 method");
	}
	Constthree()
	{
		System.out.println("default contrsuctor");	
	}
	Constthree(int a)
	{
		System.out.println("m1 method");
		System.out.println(a);
	}
	public static void main(String[] args)
{
		Constthree t = new Constthree();
		Constthree t1 = new Constthree(10);		
		t.m1(); // we can call m1 method with any obj//
		t1.m1();
			}
}
........................................................................................................................................
class Dgt
{
	int a=100;      
	int b=200;    //instance variables//
	public static void main(String[] args) 
			{
		Dgt t = new Dgt();
		System.out.println(t.a); 
		System.out.println(t.b); 
		t.m1();
			}
       void m1()  
    {
      System.out.println(a); 
      System.out.println(b);  
     }
}
..........................................................................................................................
class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
.....................................................................................................................
class DisplayOverloading2
{
    public static void main(String args[])
    {
        DisplayOverloading2 obj = new DisplayOverloading2();
        obj.disp('a');
        obj.disp(5);
    }
}
..............................................................................................................................
class Example
{
	int x=10;
	int y=20;
	static int a=30;
	static int b=40;
		 void m1()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(Example.a);
			System.out.println(Example.b);
		}
		static void m2()
		{
			Example t=new Example();
			System.out.println(t.x);
			System.out.println(t.y);
			System.out.println(Example.a);
			System.out.println(Example.b);
					}
		public static void main(String[] args)
		{
			Example t=new Example();	
			t.m1();
			Example.m2();
		}
	}
..........................................................................................................................
public class IfElseExample {  
public static void main(String[] args) {  
    int number=13;  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
}  
..........................................................................................................
public class IfElseIfExample {  
public static void main(String[] args) {  
    int marks=65;  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}  
.........................................................................................................................
public class IfExample {  
public static void main(String[] args) {  
    int age=20;  
    if(age>18){  
        System.out.print("Age is greater than 18");  
    }  
}  
}  
.....................................................................................................
public class Inheritance {
   public static void main(String args[]) {
      Car b1 = new Car();
      b1.color = "Blue";
      b1.speed = 200 ;
      b1.size = 22;
      b1.CC = 1000;
      b1.gears = 5;
      b1.attributescar();
   }
}

class Vehicle {
   String color;
   int speed;
   int size;
   void attributes() {
      System.out.println("Color : " + color);
      System.out.println("Speed : " + speed);
      System.out.println("Size : " + size);
   }
}

// A subclass which extends for vehicle
class Car extends Vehicle {
   int CC;
   int gears;
   void attributescar() {
      // The subclass refers to the members of the superclass
      System.out.println("Color of Car : " + color);
      System.out.println("Speed of Car : " + speed);
      System.out.println("Size of Car : " + size);
      System.out.println("CC of Car : " + CC);
      System.out.println("No of gears of Car : " + gears);
   }
}
.........................................................................................................................
class Inheritex2 {
	 int a=10;
		int b=20;
		}
	class B extends Inheritex2
	{
		int a=100;
		int b=200;
		void add(int a, int b)
		{
			System.out.println("a+b");
			System.out.println("a+b");
			System.out.println("a+b");
		}
			public static void main(String[] args)
			{
				new B().add(1000,2000);
			}
		}
..............................................................................................................................
class Inheritvarone
{
	int a=10;
	int b=20;
	}
class child extends Inheritvarone
{
	int x=10;
	int y=20;
	void add(int i, int j)
	{
		System.out.println("i+j");
		System.out.println("a+b");
		System.out.println("x+y");
	}
		public static void main(String[] args)
		{
			new child().add(1000,2000);
		}
	}
...................................................................................................................................
class Instanceex
{
	Instanceex()
	{
		System.out.println("o arg");
	}
	Instanceex(int a)
	{
		System.out.println("1 arg");
	}
	{
		System.out.println("Instance block");
		}
	public static void main(String[] args)
	{
		new Instanceex(); //here the instance block is executed first then constructor
		new Instanceex(10); //inst block exection depends on no of obj creted 
			}
}
......................................................................................................................................................
class Instancemul
{
	Instancemul()
	{
		System.out.println("o arg");
	}
	Instancemul(int a)
	{
		System.out.println("1 arg");
	}
	{
		System.out.println("Instance block 1");
		}
	{
		System.out.println("Instance block 2");
	}
	public static void main(String[] args)
	{
		new Instancemul(); 
		new Instancemul(10); 
			}
}
.......................................................................................................................................
class Instanceobj
{
	Instanceobj()
	{
		this(10);
		System.out.println("o arg");
	}
	Instanceobj(int a)
	{
		System.out.println("1 arg");
	}
	{
		System.out.println("Instance block 1");
		}
		public static void main(String[] args)
	{
		new Instanceobj(); 
			}
}
...............................................................................................................................
class Instanceval
{
	int eid;
	{
		eid=111; //instance block initializing values to variable
	}
	Instanceval()
	{
		System.out.println(eid);
	}
	public static void main(String[] args)
	{
		new Instanceval();
		
			}
}
............................................................................................................................
interface It1
{
	void m1();   //here methods are by default public and abstract
	void m2();
	void m3();
}
class Inter implements It1
{
	public void m1()
	{
		System.out.println("m1 method");   // we need to mention methods as public becoz we didnt declare as a public 
		                                  //then those methods will be default methods by that permissions will decrease. 
		                                 //In java permission decerasing is not allowed
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public void m3()
	{
		System.out.println("m3 method");
	}
	public static void main(String[] args)
	{
	Inter t = new Inter();
		t.m1();
		t.m2();
		t.m3();
	}
}
......................................................................................................................................
class Methodex
{
    void m1()
    {
    	System.out.println("m1 method");
     }
    void m2(int a)
    {
    	System.out.println("m2 method");
    	System.out.println(a);    	
    }
    public static void main(String[] args) 
    {
    	Methodex t = new Methodex();
    	t.m1();
    	t.m2(10);
    }
}	
.................................................................................................
class Methodoverloading{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Methodoverloading.add(12,12));  
System.out.println(Methodoverloading.add(12,12,12));  
}}  
...........................................................................................
class Methodreturn
{
    void m1()
    {
    	m2();
    	System.out.println("m1 method");
    	m2();
     }
    void m2()
    {
    	System.out.println("m2 method"); 	
    }
    void m3()
    {
    	System.out.println("m3 method"); 	
    }
    public static void main(String[] args) 
    {
    	Methodreturn t = new Methodreturn();
    	t.m1();
    }
}	
.......................................................................................
class Methodreturns
{
    void m1()
    {
    	m2();
    	System.out.println("m1 method");
    	m2();
    	     }
    void m2()
    {
    	m3();
    	System.out.println("m2 method"); 	
    }
    void m3()
    {
    	System.out.println("m3 method"); 	
    }
    public static void main(String[] args) 
    {
    	Methodreturns t = new Methodreturns();
    	t.m1();
    }
}	
......................................................................................................
class Methodsame
{
    void m1()
    {
    	System.out.println("m1 method");
     }
    void m1(int a)
    {
    	System.out.println("m1 method");
    	System.out.println(a);    	
    }
    public static void main(String[] args) 
    {
    	Methodsame t = new Methodsame();
    	t.m1();
    	t.m1(10);
    }
}	
.................................................................................................
class X{}
class Y{}
class Student{}
class Emp{}
class Methodthree
{
    void m1(X x1, Emp e)
    {
    	System.out.println("m1 method");
     }
    static void m2(Y y1, Student s)
    {
    	System.out.println("m2 method");
    }
    public static void main(String[] args) 
    {
    	Methodthree t = new Methodthree();
    	X x1 = new X();
    	Emp e = new Emp();
    	t.m1(x1,e);
    	Y y1 = new Y();
    	Student s = new Student();
    	Methodthree.m2(y1,s);
 }
}
......................................................................................................
class Methodtwo 
{
	void m1(int a, char ch)//local variales
	{
	System.out.println("m1 method");
	System.out.println(a);
	System.out.println(ch);
	}
	static void m2(String str, double d)
	{
	System.out.println("m2 method");
	System.out.println(str);
	System.out.println(d);

	}
	public static void main(String[] args) 
	{
	Methodtwo t= new Methodtwo();
	t. m1(10,'a');
	Methodtwo. m2("ratan",10.5);
	}
}
...................................................................................................................
class Mthodone
{
	void m1()
	{
	System.out.println("m1 method");
	}
	static void m2()
	{
	System.out.println("m2 method");
	}
	public static void main(String[] args) 
	{
	Mthodone t= new Mthodone();
	t. m1();
	Mthodone. m2();
	}
}
..................................................................................................
package beginnersbook.com;
import java.util.Scanner;
class PalindromeCheck
{
       public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        
        return isPal(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
                if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
.....................................................................................................
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
........................................................................................................
class Static
{
	static int a=1000;      
	static int b=2000;   
	public static void main(String[] args) 
	{
		System.out.println(Static.a); 
		System.out.println(Static.b);   
		Static t = new Static();
		t.m1();    
	}
	void m1()  
    { 
   System.out.println(Static.a); 
   System.out.println(Static.b);  
	}
}
.............................................................................................................
class Staticd
{
	static int a=1000;      
	static int b=2000;   //static area//
	public static void main(String[] args) 
	{
		System.out.println(Staticd.a); 
		System.out.println(Staticd.b);   //static method//in this we r accesing through the class name(Static)//
		Staticd t=new Staticd();
		t.m1();  //calling m1 method//  
	 }
		void m1()  
     { 
			System.out.println(Staticd.a); 
			System.out.println(Staticd.b);  //in this we r accesing through the class name//instance variables//
	 }
}
...............................................................................................................
class Staticex
{
	static	
	{
		System.out.println("Static 1");
	}
	static	
	{
		System.out.println("Static 2");
	}
		{
		System.out.println("Inst 1");
	}
	{
		System.out.println("Inst 2");
		}
	Staticex()
	{
		System.out.println("0 arg");
	}
	Staticex(int a)
	{
		System.out.println("1 arg");
	}
	public static void main(String[] args)
	{
		new Staticex(); 
		new Staticex(10);
			}
}
..........................................................................................................................
class Staticex2
{
	static	
	{
		System.out.println("Static 1");
	}
	public static void main(String[] args)
	{
	}
	static	
	{
		System.out.println("Static 2");
	}
		static	
		{
			System.out.println("Static 3");
		}
	}
...........................................................................................................
class Test 
{
	int a=100;      
	int b=200;    
	public static void main(String[] args) 
			{
		Test t = new Test();
		System.out.println(t.a); 
		System.out.println(t.b); 
		t.m1();    
	}
     void m1()  
    {
   System.out.println(a); 
   System.out.println(b);  
    }
}
.............................................................................................
abstract class Testex
{
	Testex()
	{
		System.out.println("Abstarct cls 0 arg");
	}
	abstract void m1();	
}
class Testex1 extends Testex
{
	Testex1()
	{
		super();
		System.out.println("normal cls 1 arg");
	}
	void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args)
	{
		 new Testex1().m1();	 
	}
}
....................................................................................................
package firsttestng;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class firsttestngfile {
    public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
     @AfterTest                            //Jumbled
      public void terminateBrowser(){
          driver.close();
      }
     @BeforeTest                            //Jumbled
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.firefox.marionette", driverPath);
          driver = new FirefoxDriver();
          driver.get(baseUrl);
      }
      @Test                                //Jumbled
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      
}
.............................................................................................................
package TESTNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testngone {
    public String baseUrl = "http://newtours.demoaut.com/";
    String driverPath = "C:\\geckodriver.exe";
  
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.firefox.marionette", driverPath);
      Webdriver driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
....................................................................................................................
