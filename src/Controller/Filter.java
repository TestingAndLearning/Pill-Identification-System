package Controller;

import java.util.stream.Collectors;

import Model.PillCollection;

/*
This class uses streams to filter the array list of pills. A regular for loop may be faster, but can use 
up more resources. However, the difference in speed using this current data set is not noticeable. 
Because of this, I opted to use streams because it is personally more readable and makes the program simpler. 
If the search function seems to be slowing down in the future, this can be changed. 
*/
public class Filter
{
	private Search search;
	private PillCollection pillColl;
		
	public Filter(Search search, PillCollection pillColl)
	{
		this.search = search;
		this.pillColl = pillColl;
	}
	
	
	public void color()
	{		
		pillColl.pillDB = pillColl.pillDB.stream()
				.filter(p -> 
				{
					if(p.getColor().equalsIgnoreCase(search.getColor()) || 
							p.getColor2().equalsIgnoreCase(search.getColor()))
					{
						return true;
					}
					return false;
				}).collect(Collectors.toList());
	}
	
	public void color2()
	{
		pillColl.pillDB = pillColl.pillDB.stream()
				.filter(p -> 
				{
					if(p.getColor2().equalsIgnoreCase(search.getColor2()) || 
							p.getColor().equalsIgnoreCase(search.getColor2()))
					{
						return true;
					}
					return false;
				}).collect(Collectors.toList());
	}
	
	public void shape()
	{
		pillColl.pillDB = pillColl.pillDB.stream()
			    .filter(p -> p.getShape().equalsIgnoreCase(search.getShape())
			    		).collect(Collectors.toList());
	}

	public void country()
	{
		pillColl.pillDB = pillColl.pillDB.stream()
			    .filter(p -> p.getCountry().equalsIgnoreCase(search.getCountry())
			    		).collect(Collectors.toList());
	}
	
	public void removeRelevance()
	{
		for (int i = 0; i < pillColl.pillDB.size(); i++)
		{
			if (pillColl.pillDB.get(i).getRelevance() < 1)
			{
				pillColl.pillDB.remove(pillColl.pillDB.get(i));
				i--; //Removes relevant 0 for all of them. Removing it alters index so need to decrement after removing. 
			}
		}
	}
	
	/** This function searches the tags by matching every word from the search bar with every word in the Pill's tag attribute. 
	 *  At the time this was created, we only found a bit over a hundred items to put into the array list, so the program was still 
	 *  fast and met the client's needs perfectly. However, this will not scale well if a lot more items are found and added in the coming years. 
	 *  This method should be changed if the program runs a lot slower. **/
	public void tags()
	{
		for (int i = 0; i < search.getTagSearch().length ;i++)
		{
			for (int j = 0; j < pillColl.pillDB.size();j++ )
			{
				for (int k = 0; k < pillColl.pillDB.get(j).getTags().length; k++)
				{
					if (search.getTagSearchIndex(i).equalsIgnoreCase(pillColl.pillDB.get(j).getTagsIndex(k)))
					{
						pillColl.pillDB.get(j).addRelevance();
					}
				}
			}
		}
		pillColl.sortRelevance();
		
		//This fixes the issue where drop down menu does not give relevance for items. This way blank searches will work. 
		if (search.getColor().equalsIgnoreCase("N/A") &&
			search.getColor2().equalsIgnoreCase("N/A") &&
			search.getColor2().equalsIgnoreCase("N/A") &&
			search.getCountry().equalsIgnoreCase("N/A") &&
			search.getShape().equalsIgnoreCase("N/A"))
		{
			removeRelevance();
		}
	}

}