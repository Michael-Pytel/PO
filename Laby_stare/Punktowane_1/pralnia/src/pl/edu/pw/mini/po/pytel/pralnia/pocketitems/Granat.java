package pl.edu.pw.mini.po.pytel.pralnia.pocketitems;

public class Granat extends PocketItems {
	protected boolean odbezpieczony;

	public Granat() {
		odbezpieczony = random.nextInt(10) == 0;
	}

	public boolean isOdbezpieczony() {
		return odbezpieczony;
	}

// Not the most optimal approach
//	private void odbezpieczenie() {
//		switch (random.nextInt(10)) {
//		case 0:
//			this.odbezpieczony = true;
//			break;
//		default:
//			this.odbezpieczony = false;
//		}
//	}
}
