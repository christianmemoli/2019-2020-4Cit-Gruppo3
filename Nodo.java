
class Nodo {
 private Prodotto info;
 private Nodo link;

 public Nodo (Prodotto pr){
     info = new Prodotto();
     link = null;
 }

 public void setInfo(Prodotto p){
     info = new Prodotto();
 }

 public Prodotto getInfo(){
     return info;
 }

 protected void setLink(Nodo link){
     this.link=link;
 }

 public Nodo getLink(){
     return link;
 }
 
}