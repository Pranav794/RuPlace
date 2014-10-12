package backend;
import java.util.ArrayList;

public class building {
	String title;
	String description;
	String cid;
	int buildingid;
	int buildingnum;
	int campuscode;
	String campusname;
	location loc;
	ArrayList<String> offices;
	
	public building(String ti, String des, String cd, int bi, int bn, int cc, String cn, location l, ArrayList<String> of){
		this.title = ti;
		this.description = des;
		this.cid = cd;
		this.buildingid = bi;
		this.buildingnum = bn;
		this.campuscode = cc;
		this.campusname = cn;
		this.loc = l;
		this.offices  = of;
	}
	
	public String toString()
	{
		String s = "TITLE: " + title
				+ "\nDescription: " + description 
				+ "\nCID: " + cid 
				+ "\nBuildingID: " + buildingid
				+ "\nCampcusCode: " + campuscode
				+ "\nCampusName: " + campusname
		;
		
		return s;
	}
	
	
}
