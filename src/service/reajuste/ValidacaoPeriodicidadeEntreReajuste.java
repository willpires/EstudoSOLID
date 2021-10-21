package service.reajuste;

import model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste {
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste,dataAtual);

        if (mesesDesUltimoReajuste < 6){
            System.out.println("Intervalo de 6 meses para o reajuste");
        }
    }
}
