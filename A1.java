 //What will be the output of the following program

/*public class A1 {
    int a = 50;
    int b = 10;
    public static void main(String args[]) {
        a += b--;
        System.out.println(a);
    }
}*/ // output = error bocz static not declared

/*class A1
{
    final static short i = 2;
    public static int j = 0;
    
    public static void main(String [] args)
    {
        for (int k = 0; k < 3; k++)
        {
            switch (k)
            {
                case i: System.out.print(" 0 ");
                case i-1: System.out.print(" 1 ");
                case i-2: System.out.print(" 2 ");
            }
        }
    }
}*/
 // output= 2 1 2 0 1 2

/*
class A1 
    {
        public static void main(String args[])
        {
            int arr[] = {1, 2, 3, 4, 5};
            for ( int i = 0; i < arr.length - 2; i++)
                System.out.println(arr[i] + " ");
        } 
    }
	*/ // output= 1 2 3
	
/*public class A1 {
    static boolean ball;
    public static void main(String[] args) {
        short bat = 42;
        if (bat < 50 & !ball)
            bat++;
        if (bat > 50)
            ;
        else if (bat > 40) {
            bat += 7;
            bat++;
        }
        else
            --bat;
        System.out.println(bat);
    }
}
*/ //output= 51
/*
 class Student {
    int rollno;
    String name;
    static String college = "RITA";
    static void chage() {
        college = "SRIT";
    }
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String arts[]) {
        Student.chage();
        Student s1 = new Student(516, "Kiran");
        Student s2 = new Student(560, "Vishwanath");
        Student s3 = new Student(517, "Kranthi");
        s1.display();
        s3.display();
        s2.display();
    }
}*/