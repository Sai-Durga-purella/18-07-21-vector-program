import java.util.*;

class v1

{

public static void main(String args[])

{
    
Vector v= new Vector();
    
Scanner sc =new Scanner (System.in);
    
v.add(101);
    
v.add("Rama");
    
v.add(6.58);
    
v.add(102);
    
v.add("Gita");
    
v.add(8.98);
   
 System.out.println(v);
    
v.remove("Gita");
    
System.out.println(v +"");
    
v.set(2,"9.17");
    
System.out.println(v);
    
System.out.println(v.contains("sta") +"");
    
}
    
}

...............................................
output:
[101, Rama, 6.58, 102, Gita, 8.98]

[101, Rama, 6.58, 102, 8.98]

[101, Rama, 9.17, 102, 8.98]

false