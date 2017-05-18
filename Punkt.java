
public class Punkt {

	private int x;
	private int y;

	private String namn;




	public Punkt(Punkt a){

		setPunkt(a.getName(), a.getX(), a.getY());
		// konstruktorn, tar ett objekt av typen Punkt och därmed ändrar variablerna till de sakerna.
		//först kommer den gå till metoderna getName(),getX(),getY()
	}
	public Punkt(String name, int xled, int yled) {

		setPunkt(name,xled,yled);
		//går till vidare till metoden setPunkt();
	}
	public String toString(){
		return String.format("%s %s %s",namn,x,y);

	}
	public void setPunkt(String n,int xledet, int yledet)
	{

		setName(n);
		setX2(xledet);
		setY2(yledet);
		//går vidare
	}



	public boolean equals(Punkt test)
	{
		int newx=test.getX();
		int newy=test.getY();
		if ((newx==getX())&&(newy==getY())){
			return true;
		}else{
			return false;
		}
	}
	public double avstand(Punkt newpunkt){
		double xled=newpunkt.getX();
		double yled=newpunkt.getY();

		return Math.sqrt(Math.pow(xled-getX(),2)+Math.pow(yled-getY(),2));
	}
	public void setX2(int kordinat)
	{ 
		this.x=kordinat;
		//denna säger att override det som redan finns i x och det gör även så att det pekar på den globala 
		//variabeln för att ändra den och hela grejen att fungera
	}
	public void setY2(int kordinat)
	{
		this.y=kordinat;
		//samma som x
	}

	public void setName(String name){
		this.namn=name;
		//samma som x

	}
	public String getName(){
		return this.namn;
		//returnerar det som finns i namn. I detta fall skall vi inte this eftersom det skulle peka på det 
		//som redan finns i metoden Punkt vilket inte är nödvändigtvist det vi vill ha.
		//fråga honom. vem bryr sig om kompileringsfel;
	}
	public int getX(){
		return this.x;
		//samma?
	}
	public int getY(){
		return this.y;
	}

}
