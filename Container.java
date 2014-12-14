import java.util.Arraylist;

public class Container
{
	private int maxContents;
	private int currentContents;
	private Arraylist<Item> contents = new ArrayList<Item>();

	public Container(int init_maxContents)
	{
		maxContents = init_maxContents;
	}

	public String getDescription(Item item)
	{
		boolean flag;
		String description;

		for (Item e : contents)
		{
			if (e.getID() == item.getID())
			{
				return item.getDesciption();
				flag = true;
				break;
			}
		}

		if (flag == false)
		{
			description = "the item is not here";
		}

		return description;
	}

	public void addItem(Item item)
	{
		contents.add(item);
	}

	public void removeItem(Item item)
	{
		boolean flag;

		for (Item e : contents)
		{
			if (e.getID() == item.getID())
			{
				contents.remove(item);
				flag = true;
				break;
			}
		}

		if (flag == false)
		{
			System.out.println("The item is not here");
		}
	}
}