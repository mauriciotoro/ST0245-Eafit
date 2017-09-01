
public class Laboratorio3 {
public static void main(String[] args)
{
	
	LinkedListMauricio list = new LinkedListMauricio();
	list.insert(5, 0);
	list.insert(4, 0);
	list.insert(3, 0);
	list.insert(2, 0);
	list.insert(1, 0);
	for (int i = 0; i < list.size(); i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println(list.contains(3));
	list.remove(2);
	System.out.println(list.contains(3));
	for (int i = 0; i < list.size(); i++)
	{
		System.out.println(list.get(i));
	}
}
	
}
