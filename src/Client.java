
public class Client extends User {

    private String adresse; //????
    private String ville;
    private String pays_residence;
    private

    public Client(){
    }
    public Client(String nom,String prenom, int age, String sexe, String adresse, String ville, String num_tel, String email, String pays_residence){
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
        setAge(age);
        setSexe(sexe);
        setEmail(email);
        setNum_tel(num_tel);
        setVille(ville);
        setPays_residence(pays_residence);
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getSexe() {return sexe;}
    public void setSexe(String sexe) {this.sexe = sexe;}

    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getNum_tel() {return num_tel;}
    public void setNum_tel(String num_tel) {this.num_tel = num_tel;}

    public String getPays_residence() {return pays_residence;}
    public void setPays_residence(String pays_residence) {this.pays_residence = pays_residence;}

    public String getVille() {return ville;}
    public void setVille(String ville) {this.ville = ville;}

    @Override
    public String toString() {return prenom+" " + nom.toUpperCase();}

}





