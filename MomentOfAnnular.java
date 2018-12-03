import java.util.Scanner;
public class MomentOfAnnular{

	// This program takes in a mass, ID, and OD, and given preset
	// uncertainty values, will output an average moment of inertia for a
	// given annular cylinder in addition to a final uncertainty value.

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter mass: ");
		double mass = Double.parseDouble(s.next());

		System.out.print("\nEnter thickness: ");
		double thickness = Double.parseDouble(s.next());

		System.out.print("\nEnter OD: ");
		double outer = Double.parseDouble(s.next());

		outer += 0.001;

		double max = 0.5*(mass+0.00005) * (Math.pow(outer/2,2) +
			Math.pow((outer-(2*thickness))/2,2));

		outer -= 0.002;

		double min = 0.5*(mass-0.00005) * (Math.pow(outer/2,2) +
			Math.pow((outer-(2*thickness))/2,2));

		double avg = (max+min)/2;
		System.out.print("\n\nAvg: " + avg);
		double unc = max-min;
		System.out.print("\nUnc: " + unc);
	}
}
