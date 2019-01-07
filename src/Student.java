public class Student {
    private String name;
    private int matrikelnummer;
    private int jahrgang;

    public Student(String name, int matrikelnummer, int jahrgang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
    @Override
    public String toString(){
        return "Name : " + getName() + " Matrikelnummer : " + getMatrikelnummer() + " Jahrgang : " + getJahrgang();
    }
}
