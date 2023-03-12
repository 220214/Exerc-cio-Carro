package view;

import java.util.concurrent.Semaphore;

import Controller.Carro;

public class MainCarro {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		
			Thread c = new Carro (0, semaforo);
			c.start();
		}

	}


