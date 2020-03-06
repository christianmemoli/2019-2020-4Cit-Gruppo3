import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, FileException {
		// TODO Auto-generated method stub
		Prodotto m = new Prodotto();
		Nodo n = new Nodo(m);
		Listaprodotti t = new Listaprodotti();
		Listaprodotti carrello = new Listaprodotti();
		int scelta;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("\n SCEGLIERE L'OPZIONE");
			System.out.println("1_VISUALIZZAZIONE");
			System.out.println("2_AGGIUNTA AL CARRELLO");
			System.out.println("3_REGISTRAZIONE");
			System.out.println("4_LOGIN");
			scelta = input.nextInt();
			Scanner x =new Scanner(System.in);
			File f = null;
			switch(scelta) {
			
			case 1: {
				File list = new File("E:\\progetto con GitHub\\Progetto_Memoli\\src\\Prodotti",'R');
				try {
					while(true) {
						m.setNome(list.fromFile());
						m.setPeso(Float.parseFloat(list.fromFile()));
						m.setPrezzo(Float.parseFloat(list.fromFile()));
						m.setId(Integer.parseInt(list.fromFile()));
						m.setQuantita(Integer.parseInt(list.fromFile()));
						m.setSconto(Integer.parseInt(list.fromFile()));
						t.inserisciInCoda(m);
					}
				}
				catch(FileException exception) {
					System.out.println(exception.getMess());
				}
				list.close();
					System.out.println(t.Visualizzazione(n));
				
			}break;
			
			case 2: {
				f.Scrivi("Carrello",t);
			}break;
			
			case 3: {
				File list = new File("Utenti.txt",'W');
				Utente p=new Utente();
				String Password2= new String();
				System.out.println("############################################");
				System.out.println("REGISTRAZIONE");
				System.out.println("############################################");
				System.out.println("Inserire il nome: ");
				p.setName(input.nextLine());
				do {
				System.out.println("Inserire l'email: ");
				p.setEmail(input.nextLine());
				}while(p.controllaEmail()!=true);
				do {
				System.out.println("Inserire la password: ");
				p.setPassword(input.nextLine());
				}while(p.controllaPassword()!=true);
				do {
				System.out.println("Conferma password: ");
				Password2=input.nextLine();
				}while(p.controllaPassword2(Password2)!=true);
				System.out.println("Registrazione effetuata corretamente!");	
				list.toFile(p.getName()+"\n"+p.getSurname()+"\n"+p.getEmail()+"\n"+p.getPassword());
				list.close();
			}
			
			case 4: {
				File list2 = new File("Utenti.txt",'R');
				list2.fromFile();
				list2.fromFile();
				String Email2=list2.fromFile();
				String Pass2=list2.fromFile();
				boolean found = false;
				String user;
				String pass;
				x.nextLine();
				System.out.println("############################################");
				System.out.println("Log in:");
				System.out.println("############################################");
				System.out.println("Inserisci l'email: ");
				user=x.nextLine();
				System.out.println("Inserisci la password: ");
				pass=x.nextLine();
				if(user.equals(Email2) && pass.equals(Pass2))
				{
					found = true;
					if(found == true) System.out.println("Accesso effettuato");
				}
				if(found == false) System.out.println("Accesso non effettuato");
			}
			}
		}while(scelta != 8);
	}

}
