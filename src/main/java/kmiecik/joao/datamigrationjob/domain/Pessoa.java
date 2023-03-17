package kmiecik.joao.datamigrationjob.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Strings;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private Integer id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private Integer idade;

    public boolean isValid() {
        return !Strings.isBlank(nome) && !Strings.isBlank(email) && dataNascimento != null && idade != null;
    }
}
