
public class Punkt {

	private int x;
	private int y;

	private String namn;




	public Punkt(Punkt a){

		setPunkt(a.getName(), a.getX(), a.getY());
		// konstruktorn, tar ett objekt av typen Punkt och d�rmed �ndrar variablerna till de sakerna.
		//f�rst kommer den g� till metoderna getName(),getX(),getY()
	}
	public Punkt(String name, int xled, int yled) {

		setPunkt(name,xled,yled);
		//g�r till vidare till metoden setPunkt();
	}
	public String toString(){
		return String.format("%s %s %s",namn,x,y);

	}
	public void setPunkt(String n,int xledet, int yledet)
	{

		setName(n);
		setX2(xledet);
		setY2(yledet);
		//g�r vidare
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
		//denna s�ger att override det som redan finns i x och det g�r �ven s� att det pekar p� den globala 
		//variabeln f�r att �ndra den och hela grejen att fungera
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
		//returnerar det som finns i namn. I detta fall skall vi inte this eftersom det skulle peka p� det 
		//som redan finns i metoden Punkt vilket inte �r n�dv�ndigtvist det vi vill ha.
		//fr�ga honom. vem bryr sig om kompileringsfel;
	}
	public int getX(){
		return this.x;
		//samma?
	}
	public int getY(){
		return this.y;
	}

}
