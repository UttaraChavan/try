package cs6015.hw1.tests;

import cs6015.hw1.train.Train;

public class TrainTest {

	static Train objTrain = new Train("Manhattan Bound");
	public static void main(String[] args){

		for (int station=0; station<13; station++){
			objTrain.drive(station);
			boarding(station);
			System.out.println(objTrain.toString());
		}
	}

	private static void boarding(int station) {
		// TODO Auto-generated method stub
		int pass, dest;
		switch (station){
		case 0:
			pass = 15;
			dest = 2;
			insert(pass, dest);
			pass = 20;
			dest = 5;
			insert(pass, dest);
			pass = 30;
			dest = 6;
			insert(pass, dest);
			pass = 30;
			dest = 9;
			insert(pass, dest);
			pass = 5;
			dest = 12;
			insert(pass, dest);
			break;
		case 1:
			pass = 5;
			dest = 3;
			insert(pass, dest);
			pass = 5;
			dest = 4;
			insert(pass, dest);
			break;
		case 2:
		case 3:
		case 4:
			break;
		case 5:
			pass = 5;
			dest = 6;
			insert(pass, dest);
			pass = 5;
			dest = 10;
			insert(pass, dest);
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		default:
			break;
		}
	}

	private static void insert(int pass, int dest) {
		// TODO Auto-generated method stub
		for (int k=0; k<pass; k++){
			objTrain.boardPassenger(dest);
		}
	}
	
	
}
