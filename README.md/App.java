package com.onetomany;

import com.onetomany.daoimpl.Trainerdaoimpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainerdaoimpl d = new Trainerdaoimpl();
        d.addTrainer();
        d.fetchTrainer();
	}

}
