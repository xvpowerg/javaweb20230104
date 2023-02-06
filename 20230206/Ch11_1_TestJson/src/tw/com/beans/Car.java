package tw.com.beans;

public class Car {
		private String type;
		private int doors;
		private String color;

		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getDoors() {
			return doors;
		}
		public void setDoors(int doors) {
			this.doors = doors;
		}
		@Override
		public String toString() {
			return "Car [type=" + type + ", doors=" + doors + ", color=" + color + "]";
		}
		
}
