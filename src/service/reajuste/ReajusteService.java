package service.reajuste;

import model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void ReajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
         this.validacoes.forEach(v->v.validar(funcionario,aumento));
         BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
         funcionario.atualizarSalario(salarioReajustado);
    }

}
