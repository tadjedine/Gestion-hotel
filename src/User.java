package src;

public abstract class User {

    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private String adresse;
    private String num_tel;
    private String email;

    public User(){}

    public User(String nom, String prenom, int age, String sexe, String adresse, String num_tel, String email){
        setAdresse(adresse);
        setNom(nom);
        setPrenom(prenom);
        setAge(age);
        setSexe(sexe);
        setNum_tel(num_tel);
        setEmail(email);
    }

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}

    public String getNum_tel() {return num_tel;}
    public void setNum_tel(String num_tel) {this.num_tel = num_tel;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getSexe() {return sexe;}
    public void setSexe(String sexe) {this.sexe = sexe;}

    public int getId() {return id;}

    public abstract int  setID ();
}
