package globalandlocal;

public class sample7 {
	int m=12;          //global variable

public void j1()
{
	int v=3;
System.out.println(v);	//local variable
System.out.println(m);
}

public void j2()
{
int g=4;
System.out.println(g);
System.out.println(m);
}
}

