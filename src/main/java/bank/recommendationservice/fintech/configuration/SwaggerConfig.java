package bank.recommendationservice.fintech.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Fintech API")
                        .version("1.0")
                        .description("API для управления новым сервисом Fintech - Recommended Program for SkyPro School"))
                .addTagsItem(new Tag().name("Health Check").description("Эндпоинты для проверки работоспособности приложения"))
                .addTagsItem(new Tag().name("Recommendation").description("Эндпоинты для управления рекомендациями"))
                .addTagsItem(new Tag().name("Dynamic Rule").description("Эндпоинты для управления динамическими правилами"));

    }
}