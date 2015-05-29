class Pilha {
	int pilha[] = new int[10];
	int topo;

	Pilha() {
		topo = -1;
	}

	void empilha(int item) {
		if(topo==9)
			System.out.println("A pilha est� cheia.");
		else
			pilha[++topo] = item;
	}

	int desempilha() {
		if(topo < 0) {
			System.out.println("N�o � poss�vel retirar elementos.");
			return 0;
		}
		else
			return pilha[topo--];
	}
	
	void imprimePilha() {
		for (int i = 0; i<=topo; i++) {
			System.out.println(pilha[i]);
		}
	}
}
