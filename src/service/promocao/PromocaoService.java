package service.promocao;

import model.Cargo;
import model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario,Boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            System.out.println("Gerentes nao podem ser promovidos!!!");
        }
        if (metaBatida){
        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
        }else {
            System.out.println("Funcionario nao bateu a meta!!!");

        }
    }
}
