package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import Controller.Search;
import Model.Pills;

/** FOR FUTURE DEVELOPMENT. A lot of the JComponents should be moved to a different class in the view package for better readability. .  
  * Due to extremely narrow time constraints and other workplace priorities, a significant portion of this class
  * was written on paper and copied onto the compiler. Many features needed to be implemented fast for the client
  * because of workplace events outside of my control. **/

public class Frames extends JFrame implements ActionListener
{
	//General fields for features displayed on startup. 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnSearch;
	private JButton reset;
	private JTextField tagSearch;
	private JComboBox<String> colorBox;
	private JComboBox<String> colorBox2;
	private JComboBox<String> country;
	private JComboBox<String> shape;
	
	//For displaying icons. 
	private static JLabel image; 
	private JPanel p;
	private ArrayList<JLabel> imageLabelHolder = new ArrayList<JLabel>(); 
	private ArrayList<JLabel> imageNameHolder = new ArrayList<JLabel>();
	public List<Pills> localDB = new ArrayList<Pills>();
	private JLabel iconName;
	public int rows = 0;
	public int cols = 0;
	
	//For displaying pages. 
	private int page = 1;
	private int pageIndex = (page*37)-37;
	private JButton pageBack;
	private JButton pageNext;
	private JLabel pageNumber;
	
	//For displaying profile. 
	private JFrame profile; 
	private JPanel imagePanel;
	
	private JLabel noResults;
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				Frames frames = new Frames();
				frames.setVisible(true);
				frames.setLocationRelativeTo(null); //Centers the frames on startup. 
			}
		});
	}

	//Draws the search bar and essential components to the main JFrame. 
	public Frames()
	{
		setTitle("Pill Identification System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 900);	// x, y, length, width
		setResizable(false);
		
		contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			//getContentPane().setBackground(Color.decode("#4C4CFF"));
			
		JLabel credit1 = new JLabel("Created by: Dylan Medway and Max Tsao");
			credit1.setBounds(755, 821, 500, 35);
			credit1.setFont(new Font("Times New Roman", Font.BOLD, 23));
			contentPane.add(credit1);
			
		pageNumber = new JLabel ("Page : "+ page);
			pageNumber.setBounds(550, 820, 150, 35);
			pageNumber.setFont(new Font("Times New Roman", Font.BOLD, 23));
			contentPane.add(pageNumber);
			
		tagSearch = new JTextField ("");
			tagSearch.setBounds(300, 35, 500, 35);
			tagSearch.addActionListener(this);
			tagSearch.setBackground(Color.decode("#E5E5FF"));
			tagSearch.setBorder(BorderFactory.createCompoundBorder(
					tagSearch.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			contentPane.add(tagSearch);
			
			//Detects enter button and executes "Search" command when pressed. 
			tagSearch.addKeyListener(new KeyAdapter()
			{
				public void keyPressed(KeyEvent e)
				{
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER)
					{
						Toolkit.getDefaultToolkit().beep();
						tagSearch.setActionCommand("Search");
					}
				}
			});
			
		btnSearch = new JButton ("Search");
			btnSearch.setBounds(850, 35, 100, 35);
			btnSearch.addActionListener(this);
			btnSearch.setActionCommand("Search");
			//btnSearch.setBackground(Color.decode("#7F7FFF"));
			contentPane.add(btnSearch);
			
		reset = new JButton ("Reset");
			reset.setBounds(861, 120, 75, 30);
			reset.addActionListener(this);
			reset.setActionCommand("Reset");
			//btnSearch.setBackground(Color.decode("#7F7FFF"));
			contentPane.add(reset);
			
		//Combo Boxes
		colorBox = new JComboBox<String>();
			colorBox.addItem("N/A");
			colorBox.addItem("Black");
			colorBox.addItem("Blue");
			colorBox.addItem("Brown");
			colorBox.addItem("Clear");
			colorBox.addItem("Green");
			colorBox.addItem("Grey");
			colorBox.addItem("Pink");
			colorBox.addItem("Purple");
			colorBox.addItem("Orange");
			colorBox.addItem("Red");
			colorBox.addItem("Yellow");
			colorBox.addItem("White");
			colorBox.addItem("Other");
			colorBox.setBounds(300, 120, 100, 30);
			contentPane.add(colorBox);
			
		colorBox2 = new JComboBox<String>();
			colorBox2.addItem("N/A");
			colorBox2.addItem("No Color");
			colorBox2.addItem("Black");
			colorBox2.addItem("Blue");
			colorBox2.addItem("Brown");
			colorBox2.addItem("Clear");
			colorBox2.addItem("Green");
			colorBox2.addItem("Grey");
			colorBox2.addItem("Pink");
			colorBox2.addItem("Purple");
			colorBox2.addItem("Orange");
			colorBox2.addItem("Red");
			colorBox2.addItem("Yellow");
			colorBox2.addItem("White");
			colorBox2.addItem("Other");
			colorBox2.setBounds(430, 120, 100, 30);
			contentPane.add(colorBox2);
			
		country = new JComboBox<String>();
			country.addItem("N/A");
			country.addItem("Australia");
			country.addItem("Canada");
			country.addItem("China");
			country.addItem("Fiji");
			country.addItem("Hong Kong");
			country.addItem("Indonesia");
			country.addItem("Japan");
			country.addItem("Korea");
			country.addItem("Macau");
			country.addItem("Malaysia");
			country.addItem("Pakistan");
			country.addItem("Philippines");
			country.addItem("Singapore");
			country.addItem("Taiwan");
			country.addItem("Thailand");
			country.addItem("UK");
			country.addItem("USA");
			country.addItem("Vietnam");
			country.addItem("Other");
			country.setBounds(565, 120, 100, 30);
			contentPane.add(country);
			
		shape = new JComboBox<String>();
			shape.addItem("N/A");
			shape.addItem("Capsule");
			shape.addItem("Hexagon");
			shape.addItem("Oval");
			shape.addItem("Round");
			shape.addItem("Square");
			shape.addItem("Star");
			shape.addItem("Triangle");
			shape.addItem("Other");
			shape.setBounds(695, 120, 100, 30);
			contentPane.add(shape);
			
		//Labels
		JLabel colorLbl = new JLabel("Primary Color");
			colorLbl.setBounds(300, 95, 100, 20);
			contentPane.add(colorLbl);
			
		JLabel color2Lbl = new JLabel("Secondary Color");
			color2Lbl.setBounds(430, 95, 100, 20);
			contentPane.add(color2Lbl);
			
		JLabel languageLbl = new JLabel("Country");
			languageLbl.setBounds(565, 95, 75, 20);
			contentPane.add(languageLbl);
			
		JLabel shapeLbl = new JLabel("Shape");
			shapeLbl.setBounds(695, 95, 75, 20);
			contentPane.add(shapeLbl);
		
		panel = new JPanel();
			panel.setBounds(15, 175, 1170, 650);
			panel.setBorder(new CompoundBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.DARK_GRAY), null));
			contentPane.add(panel);
			panel.setLayout(null);
			//panel.setBackground(Color.decode("#9999FF"));
			
		/** These components take care of back and next page buttons and no results page. **/
		noResults = new JLabel("No results were found. ");
			noResults.setFont(new Font("Times New Roman", Font.BOLD, 21));
			noResults.setBounds(25, 25, 300, 35);
			noResults.setVisible(false);
			panel.add(noResults);
			
		pageBack = new JButton("Back");
			pageBack.setBounds(15,125,75,35);
			pageBack.setFont(new Font("Times New Roman", Font.BOLD, 21));
			pageBack.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			pageBack.setHorizontalAlignment(JTextField.CENTER);
			pageBack.setEnabled(false);
		    pageBack.addMouseListener(new MouseAdapter()
    		{
    			public void mouseClicked(MouseEvent e)
    			{
    				if (pageBack.isEnabled())
    				{
	    				resetPageIcon();
	    				page--;
	    				pages();
	    				
	    				pageNumber.setText("Page : "+ page);
    				}
    			}
    		});
		    contentPane.add(pageBack);
		    
		pageNext = new JButton("Next");
			pageNext.setBounds(1110,125,75,35);
			pageNext.setFont(new Font("Times New Roman", Font.BOLD, 21));
			pageNext.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			pageNext.setHorizontalAlignment(JTextField.CENTER);
			pageNext.setEnabled(false);
		    pageNext.addMouseListener(new MouseAdapter()
    		{
    			public void mouseClicked(MouseEvent e)
    			{
    				if (pageNext.isEnabled())
    				{
	    				resetPageIcon();
	    				page++;
	    				pages();
	    				
	    				pageNumber.setText("Page : "+ page);
    				}
    			}
    		});
		    contentPane.add(pageNext);
		    
		/** **/
	}
	
	/** These functions help display icons in a grid like format. **/
	//Adds icons to the list that will display thumbnails in the panel. 
	public void iconsToList(String iconPath, String idPath, int iterator)
	{		
		if (cols > 8)
		{
			rows++;
			
			if (rows > 3)
			{
				rows = 0;
			}
			cols = 0;
		}
		
	    image = new JLabel(new ImageIcon(iconPath));
	    image.setBounds(5+cols*130,35+rows*150,100,100); 
	    imageLabelHolder.add(image); 
	    
	    //Handles what happens when icon is clicked. 
	    image.addMouseListener(new MouseAdapter()
	    		{
	    			public void mouseClicked(MouseEvent e)
	    			{
	    				removeProfile();
	    				displayProfile(iterator);
	    			}
	    		});
	    
	    //Sets cursor to hand cursor when mouse hovers icon. 
	    image.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    
	    //Takes care of icon name.
	    iconName = new JLabel(idPath);
	    iconName.setBounds(5+cols*130,100+rows*150,100,100);
	    iconName.setHorizontalAlignment(JLabel.CENTER);
	    imageNameHolder.add(iconName);
	    
	    cols++;	    
	}
	
	//Resets icons to re-add icons on new search. 
	public void resetIcons()
	{
		rows = 0;
		cols = 0;
		//If p was not declared yet (before the first search). 
		if (p != null)
		{
			panel.remove(p);
		}
		p = new JPanel();
			p.setBounds(10, 10, 1150, 630);
			p.setLayout(null);
		    panel.add(p); 
		    p.setVisible(false); 
		    
		//Clears the arraylists for new search. 
	    imageLabelHolder.clear();
			imageLabelHolder = new ArrayList<JLabel>();
			imageLabelHolder.clear();
			
		imageNameHolder.clear();
			imageNameHolder = new ArrayList<JLabel>();
			imageNameHolder.clear();
	}
	
	/** **/
	
	/** These functions help display profile information of pill when icon is clicked **/
	//Receives the index from iconsToList set by Search to access the list that was searched. 
	//Displays the pill profile on click of the corresponding icon. 
	public void displayProfile(int index)
	{
		profile = new JFrame();
			profile.setTitle(localDB.get(index).getID());
			profile.setResizable(false);
			profile.setBounds(0, 0, 800, 650);
			profile.setLocationRelativeTo(null);
			profile.setLayout(null);
			profile.setVisible(false); 
			profile.setVisible(true);
			populateProfile(index);
			
		//Draws the rectangle to hold image. 
		imagePanel = new JPanel()
		{
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponents(g);
				g.drawRect(49+25, 59, 252, 252);
				g.drawRect(48+25, 58, 254, 254);
			}
		};
			imagePanel.setBounds(0,0,800,650);
			profile.add(imagePanel);
			imagePanel.setVisible(false);
			imagePanel.setVisible(true);
	}
	
	//Removes the profile page from the screen. This is called before opening another profile. 
	public void removeProfile()
	{
		if (profile != null)
		{
			profile.dispose();
		}
	}
	
	//This takes care of displaying data on the profile frame. 
	public void populateProfile(int index)
	{
		//This adjusted the x position of all the effected panels at once to test and present different layouts quickly. 
		int t = 25;
	    JLabel profileImage = new JLabel(new ImageIcon(localDB.get(index).getImgPath())); 
	    	profileImage.setBounds(50+t, 60, 250, 250); 
	    	profile.add(profileImage); 
			
		JTextField profileNameBox = new JTextField(localDB.get(index).getID());
			profileNameBox.setBounds(61+t, 350, 225, 35);
			profileNameBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileNameBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			profileNameBox.setHorizontalAlignment(JTextField.CENTER);
			profileNameBox.setBackground(Color.WHITE);
			profileNameBox.setEditable(false);
			profile.add(profileNameBox);
		
		JTextField profileStatusBox = new JTextField(localDB.get(index).getStatus());
			profileStatusBox.setBounds(78+t, 440, 185, 35);
			profileStatusBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileStatusBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			profileStatusBox.setHorizontalAlignment(JTextField.CENTER);
			
			if (localDB.get(index).getStatus().equalsIgnoreCase("Release"))
			{
				profileStatusBox.setBackground(Color.GREEN);
			}
			
			if (localDB.get(index).getStatus().equalsIgnoreCase("Health Canada"))
			{
				profileStatusBox.setBackground(Color.YELLOW);
			}
			
			if (localDB.get(index).getStatus().equalsIgnoreCase("CFIA"))
			{
				profileStatusBox.setBackground(Color.YELLOW);
			}
			
			if (localDB.get(index).getStatus().equalsIgnoreCase("CITES"))
			{
				profileStatusBox.setBackground(Color.YELLOW);
			}
			
			if (localDB.get(index).getStatus().equalsIgnoreCase("Seize"))
			{
				profileStatusBox.setBackground(Color.RED);
			}
			
			profileStatusBox.setEditable(false);
			profile.add(profileStatusBox);
			
		JLabel profileColor = new JLabel("Colors: ");
			profileColor.setBounds(405+t, 50, 75, 35);
			profileColor.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profile.add(profileColor);
			
		JTextField profileColorBox = new JTextField(localDB.get(index).getColor()+ ", " + localDB.get(index).getColor2());
			profileColorBox.setBounds(400+t, 90, 300, 35);
			profileColorBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileColorBox.setBackground(Color.WHITE);
			profileColorBox.setEditable(false);
			profileColorBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			profileColorBox.setBorder(BorderFactory.createCompoundBorder(
					profileColorBox.getBorder(), BorderFactory.createEmptyBorder(3, 10, 3, 3)));
			profile.add(profileColorBox);
			
		JLabel profileCountry = new JLabel("Associated Countries: ");
			profileCountry.setBounds(405+t, 135, 300, 35);
			profileCountry.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profile.add(profileCountry);
			
		JTextField profileCountryBox = new JTextField(localDB.get(index).getCountry());
			profileCountryBox.setBounds(400+t, 175, 300, 35);
			profileCountryBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileCountryBox.setBackground(Color.WHITE);
			profileCountryBox.setEditable(false);
			profileCountryBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			profileCountryBox.setBorder(BorderFactory.createCompoundBorder(
					profileCountryBox.getBorder(), BorderFactory.createEmptyBorder(3, 10, 3, 3)));
			profile.add(profileCountryBox);
			
		JLabel profileShape = new JLabel("Shape: ");
			profileShape.setBounds(405+t, 215, 75, 35);
			profileShape.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profile.add(profileShape);
			
		JTextField profileShapeBox = new JTextField(localDB.get(index).getShape());
			profileShapeBox.setBounds(400+t, 255, 300, 35);
			profileShapeBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileShapeBox.setBackground(Color.WHITE);
			profileShapeBox.setEditable(false);
			profileShapeBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			profileShapeBox.setBorder(BorderFactory.createCompoundBorder(
					profileShapeBox.getBorder(), BorderFactory.createEmptyBorder(3, 10, 3, 3)));
			profile.add(profileShapeBox);
			
		JLabel profileComments = new JLabel("Comments: ");
			profileComments.setBounds(385+t, 310, 150, 35);
			profileComments.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profile.add(profileComments);
			
		JTextArea profileCommentsBox = new JTextArea(localDB.get(index).getComments());
			profileCommentsBox.setFont(new Font("Times New Roman", Font.BOLD, 21));
			profileCommentsBox.setLineWrap(true);	//These lines make comments go to next line 
			profileCommentsBox.setWrapStyleWord(true);	//Automatically when it exceeds the text area by word. 
			profileCommentsBox.setBackground(Color.WHITE);
			profileCommentsBox.setEditable(false);
			profile.add(profileCommentsBox);
			
		JScrollPane scroll = new JScrollPane (profileCommentsBox);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setBounds(350+t, 350, 350, 165);
			scroll.setBackground(Color.WHITE);
			scroll.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
			scroll.setBorder(BorderFactory.createCompoundBorder(
					scroll.getBorder(), BorderFactory.createEmptyBorder(3, 10, 3, 3)));
			profile.add(scroll);
			
		/** **/
	}
	
	//Sets the ArrayList in this class to same as filtered ArrayList for use and temporary modifications. 
	public void setLocalDB(List<Pills> localDB)
	{
		this.localDB = localDB;
	}
	
	/** **/

	/** These functions help display multiple pages. **/
	public void pages()
	{
		pageIndex = (page*36)-36;
		
		if ((imageLabelHolder.size() - pageIndex) > 36)
		{
			for (;pageIndex < (page*36); pageIndex++)
			{
				p.add(imageLabelHolder.get(pageIndex));
			}
		}
		
		pageIndex = (page*36)-36;
		
		if ((imageNameHolder.size() - pageIndex) <= 36)
		{
			for (;pageIndex < imageLabelHolder.size(); pageIndex++)
			{
				p.add(imageLabelHolder.get(pageIndex));
			}
		}
		
		pageIndex = (page*36)-36;
		
		if ((imageNameHolder.size() - pageIndex) > 36)
		{
			for (;pageIndex < (page*36); pageIndex++)
			{
				p.add(imageNameHolder.get(pageIndex));
			}
		}
		
		pageIndex = (page*36)-36;
		
		if ((imageNameHolder.size() - pageIndex) <= 36)
		{
			for (;pageIndex < imageNameHolder.size(); pageIndex++)
			{
				p.add(imageNameHolder.get(pageIndex));
			}
		}
		checkButtons();
		pageNumber.setText("Page : "+ page);
		p.setVisible(true);
	}
	
	//If panel exists already, removes the panel holding existing images and created a new one for next search. 
	public void resetPageIcon()
	{
		if (p != null)
		{
			panel.remove(p);
		}
		p = new JPanel();
			p.setBounds(10, 10, 1150, 630);
			p.setLayout(null);
		    panel.add(p);
		    p.setVisible(false);
	}
	
	public void resetPage()
	{
		page = 1;
		noResults.setVisible(false);
	}
	
	//Enables the page back and next buttons if needed and disables if not. 
	public void checkButtons()
	{
		pageIndex = (page*36)-36;
		
		if ((imageLabelHolder.size() - pageIndex) > 36)
		{
			pageNext.setEnabled(true);
		}
			
		if ((imageNameHolder.size() - pageIndex) <= 36)
		{
			pageNext.setEnabled(false);
		}
		
		if(page > 1)
		{
			pageBack.setEnabled(true);
		}
		
		if (page <= 1)
		{
			pageBack.setEnabled(false);
		}
	}
	
	/** **/
	
	public void noResults()
	{
		noResults.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getActionCommand().equals("Search"))
		{
			try
			{
				Search search = new Search(Frames.this, tagSearch.getText(), 
						colorBox.getSelectedItem().toString(),
						colorBox2.getSelectedItem().toString(),
						shape.getSelectedItem().toString(),
						country.getSelectedItem().toString());

				ExecutorService executor = Executors.newCachedThreadPool();
				executor.execute(search);
				
				
			} catch (NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid search. ", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if (evt.getActionCommand().equals("Reset"))
		{
			tagSearch.setText("");
			colorBox.setSelectedIndex(0);
			colorBox2.setSelectedIndex(0);
			country.setSelectedIndex(0);
			shape.setSelectedIndex(0);
			pageBack.setEnabled(false);
			pageNext.setEnabled(false);
			
			if (p != null)
			{
				p.setVisible(false);
			}
			noResults.setVisible(false);
		}
	}
}
