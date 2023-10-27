public class Camion {
    
    private String marca;
    private String model;
    private int an;
    private float pret;
    private int caiPutere;


    public Camion(String marca, String model) {
        this.setMarca(marca);
        this.setModel(model);
        this.setAn(an);
        this.setPret(pret);
        this.setCaiPutere(caiPutere);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

     public int getAn() {
        return an;
    }

     public float getPret() {
        return pret;
    }

 public int getCaiPutere() {
        return caiPutere;
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

     public void setPret(float pret) {
        this.pret = pret;
    }

     public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }


    @Override
    public String toString() {
        return marca + " " + model + " "  + an + " " + pret + " " + caiPutere ;
    }
}