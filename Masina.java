public class Masina { // clasa masina

    // parametrii clasei

    private String marca;
    private String model;
    private float pret;

    // construsctorul

    public Masina(String marca, String model, float pret) {
        this.setMarca(marca);
        this.setModel(model);
        this.setPret(pret);
    }

    // metode de tip get/set

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public float getPret(){
        return pret;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public void setModel(String model) {
        this.model = model;
    }



    public void setPret(float pret){
        this.pret = pret;
    }

    // metoda toString

    @Override
    public String toString() {
        return marca + " " + model + " " + " " + pret;
    }
}