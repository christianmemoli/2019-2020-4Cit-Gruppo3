import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Listaprodotti t = new Listaprodotti();
		Listaprodotti carrello = new Listaprodotti();
		int scelta;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n SCEGLIERE L'OPZIONE");
			System.out.println("1_VISUALIZZAZIONE");
			System.out.println("2_AGGIUNTA AL CARRELLO");
			System.out.println("3_LOGIN");
			scelta = input.nextInt();
			Prodotto m = new Prodotto();
			switch(scelta) {
			
			case 1: {
				File list = new File("Prodotti",'R');
				try {
					int i = 0;
					while(true) {
						m.setNome(list.fromFile());
						m.setPeso(Double.parseDouble(list.fromFile()));
						m.setPrezzo(Float.parseFloat(list.fromFile()));
						m.setId(Integer.parseInt(list.fromFile()));
						m.setQuantita(Integer.parseInt(list.fromFile()));
						m.setSconto(Integer.parseInt(list.fromFile()));
						i++;
						t.Inserimento(m);
						t.Visualizzazione();
					}
				}
				catch(FileException exception) {
					System.out.println(exception.getMess());
				}
				list.close();
			}break;
			
			case 2: {
				Scrivi("Carrello",t);
			}break;
			
			case 3: {
				Login();
			}
			
			case 4: {
				
			}
			}
		}while(scelta != 8);
	}

}
