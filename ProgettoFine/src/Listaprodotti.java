import java.io.IOException;
import java.util.Scanner;

public class Listaprodotti {
	private Nodo pl;
	private int elementi;
	
	public Listaprodotti() {
		pl = null;
	}
	
	private Nodo creaNodo(Prodotto m, Nodo link) {
		   Nodo nuovoNodo = new Nodo(m);
		   nuovoNodo.setLink(link);
		   return nuovoNodo;
		 }
	
	 private Nodo getLinkPosizione(int posizione) {
		  int n = 1;
		  Nodo p = pl;
		  if (pl == null)
			  return p;
		  while ((p.getLink()!=null) && (n<posizione)) {
		   p = p.getLink();
		   n++;
		  }
		  return p;
		}
	 
	public void inserisciInTesta(Prodotto m) {
		   Nodo p = creaNodo(m, pl);
		   pl = p;
		   elementi++;
		   return;
		 }
	
	public void inserisciInCoda(Prodotto m) throws FileException {
		  if (pl == null)
		   inserisciInTesta(m);
		  else {
		    Nodo p = getLinkPosizione(elementi);
		      p.setLink(creaNodo(m, null));
		      elementi++;
		  return;
		  }
		 }
	
	
	public String Visualizzazione(Nodo p) {
		  if (p == null)
		   return "";
		  return p.getInfo().toString()+"\n" + Visualizzazione(p.getLink());
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
