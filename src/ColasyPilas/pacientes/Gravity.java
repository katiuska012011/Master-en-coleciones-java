package ColasyPilas.pacientes;

public enum Gravity {

    MINOR("Minor",1),
    MODERATE("Moderate",2),
    SEVERE("Severe",3),
    VERY_SEVERE("Very Severe",4);


    private String decripcion;
    private Integer level;
    private Gravity(String descripcion, Integer level){
        this.decripcion = descripcion;
        this.level = level;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
