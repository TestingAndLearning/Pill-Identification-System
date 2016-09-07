package Model;

//This is the template of the pills objects that will be contained in the arraylist in the PillCollection class. 
public class Pills
{
	private String ID = "";
	private String color = "";
	private String color2 = "";
	private String shape = "";
	private String country = "";
	private String[] tags;
	private String status = "";
	private String imgPath = "";
	private String thumbPath = "";
	private String comments = "";
	private int relevance = 0;
	
	public Pills (String ID, String color, String color2, String shape, 
					String country, String tags, String status, String imgPath, String thumbPath, String comments)
	{
		this.ID = ID;
		this.color = color;
		this.color2 = color2;
		this.shape = shape;
		this.country = country;
		this.tags = tags.split(",");
		this.status = status;
		this.imgPath = imgPath;
		this.thumbPath = thumbPath;
		this.comments = comments;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getColor2()
	{
		return color2;
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public String[] getTags()
	{
		return tags;
	}
	
	public String getTagsIndex(int k)
	{
		return tags[k];
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getImgPath()
	{
		return imgPath;
	}
	
	public String getThumbPath()
	{
		return thumbPath;
	}
	
	public String getComments()
	{
		return comments;
	}
	
	public int getRelevance()
	{
		return relevance;
	}
	
	public void addRelevance()
	{
		relevance++;
	}
	
	public void resetRelevance()
	{
		relevance = 0;
	}
	
	public String getRelevanceString()
	{
		return Integer.toString(relevance);
	}
}
