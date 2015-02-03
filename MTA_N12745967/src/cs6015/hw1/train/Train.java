package cs6015.hw1.train;

public class Train {

	private int currentStation, trackNo, traveldir, stationsToReach;
	private final int UP = 1, DOWN = 0;
	public boolean destReached;
	private int[] passDepart = new int[13];
	
	public Train(String dir){
		currentStation = 0;
		stationsToReach = 13;
		trackNo = 0; 
		if (dir == "Manhattan Bound")
			traveldir = UP;
		else
			traveldir = DOWN;
		destReached = false;
		for (int i=0; i<13; i++){
			passDepart[i] = 0;
		}
	}
	
	public int getCurrentStation(){
		return currentStation;
	}
	
	public int getTrackNo(){
		return trackNo;
	}
	
	public int getTraveldir(){
		return traveldir;
	}
	
	public void drive(int station){
		currentStation = station;
		stationsToReach--;
		
		passDepart[currentStation] = 0;

		if (stationsToReach == 0){
			destReached = true;
			if (traveldir == UP)
				traveldir = DOWN;
			else 
				traveldir = UP;
		} else destReached = false;

	}
	
	public void boardPassenger(int destination){
		passDepart[destination]++;
	}
	
	public String toString() { 
		int total = 0;
		for (int i=0; i<passDepart.length; i++){
			total = total + passDepart[i];
		}
		
		return "Station #"+ currentStation + ": " + total + " passengers";
	}
}
