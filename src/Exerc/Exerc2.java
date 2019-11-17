package Exerc;

import javax.swing.JOptionPane;

public class Exerc2 {
	
	public static void main(String[] args) {
		String Elements1[] = new String[10] ,Elements2[] = new String[10], Resp1 ="", Resp2 ="";
		int i = 0;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao sitema da 12° Maratona Nacional\nInsira 10 nomes (victícios ou não) de corredores\nque participaram dessa corrida", "MrBrasil_2019", 1);
		
		for(int x=0; x<10; x++) {
			Elements1[x] = JOptionPane.showInputDialog(null, "Qual o " + (x+1) + "° competidor a chegar?", "MrBrasil_2019", 3);
			
			Resp1 += "[" + x + "] => " + (x+1) + "° :" + Elements1[x] + "\n"; 

		}
		
		for(int y =9; y>=0; y--) {
			Elements2[i] = Elements1[y];
			
			Resp2 += "[" + i + "] => " + ((i+1)*100) + "° :" + Elements2[i] + "\n"; 
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "Esta é ordem de chegada dos participantes:\n" + Resp1, "MrBrasil_2019", 1);
		
		JOptionPane.showMessageDialog(null, "Esta é a ordem de pontuação dos competidores\n(Dos que menos ganharam até os que mais ganharam):\n" + Resp2, "MrBrasil_2019", 1);
	}

}
