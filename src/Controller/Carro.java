package Controller;

import java.util.concurrent.Semaphore;

public class Carro extends Thread{
	private Semaphore semaforo;
	

	public Carro(int carro, Semaphore semaforo ) {
		this.semaforo = semaforo;
		
	}
	public void run() {
		
		try {
			semaforo.acquire();
			direção1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}
	private void direção1() {
		System.out.println("Carro 1 --> Oeste para Leste ");
		System.out.println("Carro 2 --> Leste para Oeste ");
		System.out.println("Carro 3 --> Norte para Sul ");
		System.out.println("Carro 4 --> Sul   para Norte ");
	}
}
