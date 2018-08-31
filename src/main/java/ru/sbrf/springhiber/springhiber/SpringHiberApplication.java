package ru.sbrf.springhiber.springhiber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//https://www.callicoder.com/spring-boot-jpa-hibernate-postgresql-restful-crud-api-example/
@SpringBootApplication
public class SpringHiberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHiberApplication.class, args);
	}
}

/*
@Slf4j
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private AppProperties appProperties;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/login").permitAll()
                .antMatchers("/images/**", "/login").permitAll()
                .antMatchers("/console/**", "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        log.trace( "user=" + appProperties.getAdminName() );
        log.trace( "pass=" + appProperties.getAdminPass() );

        auth.inMemoryAuthentication()
                .withUser( appProperties.getAdminName() )
                .password( appProperties.getAdminPass() )
                .roles( "ADMIN" );
    }
}
* */