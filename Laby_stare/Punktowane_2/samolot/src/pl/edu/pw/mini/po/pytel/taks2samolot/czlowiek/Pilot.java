package pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek;

public class Pilot extends Kadra {

	protected int nalot;

	public Pilot() {
		super();
		setNalot();
	}

	@Override
	public void setStaz() {
		this.staz = 5 + random.nextInt(16);
	}

	public void setNalot() {
		this.nalot = 2000 + random.nextInt(3001);
	}

}
