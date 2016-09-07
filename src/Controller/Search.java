package Controller;

import Model.PillCollection;
import View.Frames;

public class Search implements Runnable
{
	private Frames frames;
	private String[] tagSearch;
	private String color = "";
	private String color2 = "";
	private String country = "";
	private String shape = "";

	public Search (Frames frames, String tagSearch, String color, 
			String color2, String shape, String country)
	{
		try
		{
			this.frames = frames;
			this.tagSearch = tagSearch.split("\\s+");
			this.color = color;
			this.color2 = color2;
			this.country = country;
			this.shape = shape;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void run()
	{
		PillCollection pillColl = new PillCollection(Search.this, frames);
		Filter filter = new Filter(Search.this, pillColl);
		
		//Filter by color if either pill.color or pill.color2 matches search.color. 
		if (!(getColor().equalsIgnoreCase("N/A")))
		{
			filter.color();
		}
		
		//Filter by color if either pill.color or pill.color2 matches search.color2. 
		if (!(getColor2().equalsIgnoreCase("N/A")))
		{
			filter.color2();
		}
		
		//Filter by shape. 
		if (!(getShape().equalsIgnoreCase("N/A")))
		{
			filter.shape();
		}
		
		//Filter by associated country. 
		if (!(getCountry().equalsIgnoreCase("N/A")))
		{
			filter.country();
		}
		
		
		if (tagSearch != null && tagSearch.length > 0)
		{
			filter.tags();
		}
		
		//Resets icons for a new list if search is performed again. 
		frames.resetIcons();
		frames.resetPage();
		
		if (pillColl.pillDB.size() > 0)
		{
			for (int i = 0; i < pillColl.pillDB.size(); i++)
			{	
				frames.iconsToList(pillColl.pillDB.get(i).getThumbPath(), pillColl.pillDB.get(i).getID(), i);
			}
			frames.pages();
		}
		
		
		if (pillColl.pillDB.size() == 0)
		{
			frames.noResults();
		}
		
		//Sets the localDB list in frames to equal the same one as pillColl's pillDB. That way frame can use
		//it to display profile and icons since it cannot currently access this pillColl object. 
		frames.setLocalDB(pillColl.pillDB);
		
	}
	
	//Splits by space. 
	
	public String getColor()
	{
		return color;
	}
	
	public String getColor2()
	{
		return color2;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public String[] getTagSearch()
	{
		return tagSearch;
	}
	
	public String getTagSearchIndex(int i)
	{
		return tagSearch[i];
	}

}
