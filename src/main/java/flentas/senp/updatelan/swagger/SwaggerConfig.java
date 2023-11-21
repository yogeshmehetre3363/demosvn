   
package flentas.senp.updatelan.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import com.google.common.base.Predicate;
@Configuration
@EnableSwagger2
public class SwaggerConfig{
	//old code
//      ApiInfo apiInfo() {
//            return new ApiInfoBuilder()
//                .title("user-management")
//                .description("")                
//                .license("")
//                .licenseUrl("https://www.flentas.com")
//                .termsOfServiceUrl("")
//                .version("1.0.0")
//                .contact(new Contact("flentas","https://www.flentas.com", null))
//                .build();
//        }
//    @Bean
//    public Docket productApi() {
////        return new Docket(DocumentationType.SWAGGER_2).select()
////                .apis(RequestHandlerSelectors.basePackage("flentas.senp.controller"))
////                .paths(PathSelectors.ant("/**")).paths(PathSelectors.any()).build().apiInfo(apiInfo());
//    	return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//				.apiInfo(apiInfo()).select().paths(postPaths()).build();
//
//    }
//    private Predicate<String> postPaths() {
//		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//	}
////    @Bean
////    SecurityConfiguration security() {
////        return new SecurityConfiguration(null, null, null, null, "Bearer access_token", ApiKeyVehicle.HEADER,
////                "Authorization", ",");
////    }
//	//new code
//	@Bean
//	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//				.apiInfo(apiInfo()).select().paths(postPaths()).build();
//	}
//
//	private Predicate<String> postPaths() {
//		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("JavaInUse API")
//				.description("JavaInUse API reference for developers")
//				.termsOfServiceUrl("http://javainuse.com")
//				.contact("javainuse@gmail.com").license("JavaInUse License")
//				.licenseUrl("javainuse@gmail.com").version("1.0").build();
//	}
//    @Bean
//SecurityConfiguration security() {
//    return new SecurityConfiguration(null, null, null, null, "Bearer access_token", ApiKeyVehicle.HEADER,
//            "Authorization", ",");
//}

	//new code updated
		@Bean
		public Docket postsApi() {
//			return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
//					.apiInfo(apiInfo()).select().paths(postPaths()).build();
			return new Docket(DocumentationType.SWAGGER_2).select()
					.apis(RequestHandlerSelectors.basePackage("flentas.senp.crimecheck.controller")).paths(PathSelectors.ant("/**"))
					.paths(PathSelectors.any()).build().apiInfo(apiInfo());
		}
//
//		private Predicate<String> postPaths() {
//			return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
//		}

		private ApiInfo apiInfo() {
			return new ApiInfoBuilder()
	                .title("Crime Check")
	                .description("")                
	                .license("")
	                .licenseUrl("https://www.flentas.com")
	                .termsOfServiceUrl("")
	                .version("1.0.0")
	                .contact(new Contact("flentas","https://www.flentas.com", null))
	                .build();
	        }
	    @Bean
	SecurityConfiguration security() {
	    return new SecurityConfiguration(null, null, null, null, "Bearer access_token", ApiKeyVehicle.HEADER,
	            "Authorization", ",");
	}
    
}
    
    
  
  




