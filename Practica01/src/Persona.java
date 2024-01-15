import javax.swing.*;



public class Persona
{
    // inicializamos las variables de instancias
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private double imc;
    private String imcMsj;

    // cpntructor implicito
    public Persona()
    {
        this.nombre = JOptionPane.showInputDialog("nombre: ");

        this.edad = Integer.parseInt( JOptionPane.showInputDialog("Edad: "));

        this.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));

        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

    }
    // contructor explisito que recibe parametros por si deseo crear yo mismos los nombre
    public Persona(String nombre, int edad, double peso, double altura, double imc, String imcMsj)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.imcMsj = imcMsj;
    }


    // set y get nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }
    //set y get de la edad
     public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    // set y get de peso
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    public double getPeso()
    {
        return peso;
    }

    //set y get de altura
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double getAltura()
    {
        return altura;
    }

    // set y get de imc
    public void setImc(double imc)
    {
        this.imc = imc;
    }
    public double getImc()
    {
        return imc;
    }

    //set y get de imcMsj
    public String getImcMsj() {
        return imcMsj;
    }
    public void setImcMsj(String imcMsj)
    {
        this.imcMsj = imcMsj;
    }
}

