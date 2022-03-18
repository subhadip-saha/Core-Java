package sp99_super_keyword;


class A
{
	int a = 10;
}
class B extends A
{
	int a = 20;			//notice, we have taken two instance variables with same name in two classes
	
	void show(int a)	//notice, we have taken a local variable with same name again.
	{
		System.out.println(a);		//it prints which value is passed i.e. 30 
		System.out.println(this.a);	//it prints value of current class's instance variable. So, it points to the class B's instance variable a i.e. 20
		System.out.println(super.a);//it prints value of current class's parent class's instance variable. So, it points to the class A's instance variable a i.e. 10	
	}
	public static void main(String[] args)
	{
		B ob1 = new B();
		ob1.show(30);
	}

}
/*
30
20
10
*/
