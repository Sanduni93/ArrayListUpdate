import java.util.ArrayList;
class ArrayListUpdate{

	public static void main(String args[]){

		ArrayList<String> laps = new ArrayList<String> ();
		laps.add("DELL");
        laps.add("Asuz");
        laps.add("Acer");
        laps.add("Asuz");
        laps.set(0,"DELL COREi7");
        System.out.println(laps);
	}
}