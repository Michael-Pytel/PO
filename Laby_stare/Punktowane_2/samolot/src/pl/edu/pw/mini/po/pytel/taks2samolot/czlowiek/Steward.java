package pl.edu.pw.mini.po.pytel.taks2samolot.czlowiek;

public class Steward extends Kadra {

	@Override
	public void setStaz() {
		this.staz = 1 + random.nextInt(3);
	}

}
