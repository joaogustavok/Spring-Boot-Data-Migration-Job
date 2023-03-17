package kmiecik.joao.datamigrationjob.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosBancarios {
    private Integer id;
    private Integer pessoaId;
    private Integer agencia;
    private Integer conta;
    private Integer banco;
}
