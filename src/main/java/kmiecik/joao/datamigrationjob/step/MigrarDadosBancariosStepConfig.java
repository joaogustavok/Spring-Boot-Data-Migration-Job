package kmiecik.joao.datamigrationjob.step;

import kmiecik.joao.datamigrationjob.domain.DadosBancarios;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MigrarDadosBancariosStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step migrarDadosBancariosStep(ItemReader<DadosBancarios> arquivoDadosBancariosReader, ItemWriter<DadosBancarios> bancoDadosBancariosWriter) {
        return stepBuilderFactory.get("migrarDadosBancariosStep")
                .<DadosBancarios, DadosBancarios>chunk(5000)
                .reader(arquivoDadosBancariosReader)
                .writer(bancoDadosBancariosWriter)
                .build();
    }
}