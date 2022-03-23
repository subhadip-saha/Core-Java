package sp104_static_block;

//see, we do not call static block ourselves, it is automatically created
/*
class Test
{
	static		//static block
	{
		System.out.println("hello first static block");
	}
	
	public static void main(String[] args)
	{
		System.out.println("hi main method");
	}
	
	static
	{
		System.out.println("hola second static block");
	}
}

hello first static block
hola second static block
hi main method

always static block will be called at first place.Then main method is executed atlast
for multiple static blocks - top to bottom static blocks are called then main method
*/

//static block is used to initialize static members

class Test
{
	static int i;
	static		//static block
	{
		i = 10;
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		System.out.println("hi main method");
	}
	
}

/*
10
hi main method
*/
