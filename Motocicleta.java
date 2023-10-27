public class Motocicleta {
    
    private String marca;
    private String model;
    private int an;
    private float pret;
    private double capacitate;


    public Motocicleta(String marca, String model) {
        this.setMarca(marca);
        this.setModel(model);
        this.setAn(an);
        this.setPret(pret);
        this.setcapacitate(capacitate);
    }

    private void setcapacitate(double capacitate2) {
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getAn(){
        return an;
    }

    public float getPret(){
        return pret;
    }

    public double capacitate(){
        return capacitate;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAn(int an){
        this.an = an;
    }

    public void setPret(float pret){
        this.pret = pret;
    }

    public void setCapacitate(double capacitate){
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return marca + " " + model + " " + an + " " + pret + " " + capacitate ;
    }
}