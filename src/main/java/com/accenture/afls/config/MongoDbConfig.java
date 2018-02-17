package com.accenture.afls.config;


import com.accenture.afls.data.repositories.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.accenture.afls.data.repositories")
//@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDbConfig
{
   /*@Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                usersRepository.findAll();
            }
        };
    }*/

   /* @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
                                       MongoMappingContext context) {

        MappingMongoConverter converter =
                new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

        return mongoTemplate;

    }*/
}
