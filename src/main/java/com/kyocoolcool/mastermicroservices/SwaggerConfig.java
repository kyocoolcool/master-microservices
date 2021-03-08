package com.kyocoolcool.mastermicroservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/5 11:10 AM
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final Contact DEFAULT_CONTACT = new Contact("", "", "");
    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
            new HashSet<String>();
    static List<VendorExtension> list= new ArrayList<>();
    static {
        list.add(new StringVendorExtension("author", "chris"));
        DEFAULT_PRODUCES_AND_CONSUMES.add("application/json");
        DEFAULT_PRODUCES_AND_CONSUMES.add("application/xml");
    }
    public static final ApiInfo DEFAULT_API_INFO =
            new ApiInfo("Api title", "Api Documentation", "1.0",
                    "urn:tos", DEFAULT_CONTACT,
                    "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
                    list);

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                 .apiInfo(DEFAULT_API_INFO)
                 .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}
