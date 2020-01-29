package lv.renata.graph;

public class Point2D {
		private int x;
		private int y;
		
		public Point2D() { //defoltais konstruktors, bez mainiigajiem iekshaa
			this.x = 0; // sheit pieshkiram veertiibu mainiigajiem
			this.y = 0;
		}
		public Point2D (int x, int y){ // veel viens konstruktors, kuraa nodefineejam mainiigos
			this.x = x; 
			this.y = y;
		}
			

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public String toString() {
			return "(" +this.x + " , " + this.y + ")";
		}

		
	}

