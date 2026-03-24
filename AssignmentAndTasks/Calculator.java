class Calculator{


public void add(int a,int b)
{

	int sum=a+b;
	System.out.println("the sum of "+ a +" and" + b +" is" +sum);

}

public void sub(int a,int b)
{

	int sum=a-b;
	System.out.println("the substraction of "+ a +" and" + b +" is" +sum);

}
public void mul(int a,int b)
{

	int sum=a*b;
	System.out.println("the multipliction of "+ a +" and" + b +" is" +sum);

}
public void div(int a,int b)
{

	int sum=a/b;
	System.out.println("the division of "+ a +" and" + b +" is" +sum);

}

public static void main(String[] args)
{
	Calculator obj=new Calculator();
	obj.add(12,56);
	obj.sub(12,56);
	obj.mul(12,56);
	obj.div(12,56);


}}
