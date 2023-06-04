package logo;
//Feat-Inclusão da nova classe cliente - git feat
//Feat-Criação do construtor da classe
public class Cliente {
    private int idade;
    private String sexo;
  
    public Cliente(int idade, String sexo) {
        this.idade = idade;
        this.sexo = sexo;
    }
//Feat-Criação do metodo calcularMensalidadeMasculina
    private double calcularMensalidadeMasculina() {
        if (idade <= 15) {
            return 60.0;
        } else if (idade <= 18) {
            return 75.0;
        } else if (idade <= 25) {
            return 90.0;
        } else if (idade <= 40) {
            return 85.0;
        } else {
            return 800.0;
        }
    }
}