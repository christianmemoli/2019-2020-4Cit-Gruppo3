import java.util.*;
public class Prodotto {
	private String nome;
	private double peso;
	private String marca;
	private int quantita;
	private int id;
	private int sconto;
	private float prezzo;
	
	public Prodotto() {
		nome = null;
		peso = 0;
		marca = null;
		quantita = 0;
		id = 0;
		sconto=0;
		prezzo=0;
	}
	
	public Prodotto(String nome, double peso, String marca, int quantita, int id, int sconto, float prezzo) {
		this.nome = nome;
		this.peso = peso;
		this.marca = marca;
		this.quantita = quantita;
		this.id = id;
		this.sconto = sconto;
		this.prezzo = prezzo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setQuantita(int quantita){
		this.quantita = quantita;
	}
	
	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	String getNome() {
		return nome;
	}
	
	double getPeso() {
		return peso;
	}
	
	String getMarca() {
		return marca;
	}
	
	int getId(){
		return id;
		}	
	
	int getQuantita(){
		return quantita;
		}
	
	int getSconto() {
		return sconto;
	}
	
	float getPrezzo() {
		return prezzo;
	}
	
	public String toString() {
		return "Nome: "+getNome()+" Marca: "+getMarca()+" Peso: "+getPeso()+" Quantita': "+getQuantita()+" ID: "+getId()+" Sconto: "+getSconto()+" Prezzo: "+getPrezzo();
	}
	
}