package studio2;

public class Pi {

	public static void main(String[] args) {
		
		int inCircle = 0;
		for(int i=0;i<1000000000;i++) {
			double xCord = Math.random() - .5;
			double yCord = Math.random() - .5;
		
			double distance = Math.sqrt(Math.pow(xCord, 2)+ Math.pow(yCord, 2));
			if(distance<.5) {
				inCircle = inCircle +1;
			}
			else {
				inCircle = inCircle;
			}
				
		
		}
		System.out.println(inCircle);
		double circleProportion = inCircle/1000000000.0;
		double pi = circleProportion * 4;
		System.out.println(pi);
	}

}
