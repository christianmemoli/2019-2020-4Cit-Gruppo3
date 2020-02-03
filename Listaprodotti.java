import java.io.IOException;
import java.util.Scanner;

public class Listaprodotti {
	private Nodo pl;
	
	public Listaprodotti() {
		pl = null;
	}
	
	public void Inserimento(Prodotto c) {
		Nodo pn = new Nodo(c);
		pn.setLink(pl);
		pl = pn;
		return;
	}
	
	public void Visualizzazione() {
		Nodo p = pl;
		while(p != null) {
		System.out.println("ID  = "+ p.getInfo().getId());
		System.out.println("NOME  = "+ p.getInfo().getNome());
		System.out.println("PESO  = "+ p.getInfo().getPeso());
		System.out.println("MARCA  = "+ p.getInfo().getMarca());
		System.out.println("QUANTITA'  = "+ p.getInfo().getQuantita());
		System.out.println("SCONTO  = "+ p.getInfo().getSconto());
		System.out.println("PREZZO  = "+ p.getInfo().getPrezzo());
		p = p.getLink();
		};
	}
	
	public void Login () throws IOException, FileException {
		Scanner input = new Scanner(System.in);
		File list = new File("Utenti.txt",'W');
		Utente p = new Utente();
		String Password2 = new String();
		System.out.println("COMPILARE I SEGUENTI CAMPI PER LA REGISTRAZIONE");
		System.out.println("Inserire il nome: ");
		p.setName(input.nextLine());
		System.out.println("Inserire il cognome: ");
		p.setSurname(input.nextLine());
		do {
		System.out.println("Inserire l'email: ");
		p.setEmail(input.nextLine());
		}while(p.controllaEmail() != true);
		do {
		System.out.println("Inserire la password: ");
		p.setPassword(input.nextLine());
		}while(p.controllaPassword()!=true);
		do {
		System.out.println("Conferma password: ");
		Password2=input.nextLine();
		}while(p.controllaPassword2(Password2)!=true);
		System.out.println("Registrazione effetuata corretamente!");
		System.out.println(p.getName()+","+p.getSurname()+";"+p.getEmail()+","+p.getPassword());
		list.toFile(p.getName()+","+p.getSurname()+";"+p.getEmail()+","+p.getPassword());
		list.close();
	}
	
	
	
	
	
	
	
}
