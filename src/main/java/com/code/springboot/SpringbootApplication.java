package com.code.springboot;

//import com.code.jsch.Ssh;
import com.jcraft.jsch.JSchException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@ComponentScan(basePackages = "com.code")
@EntityScan("com.code.model") // szuka entity z całego packega
@EnableJpaRepositories(basePackages = "com.code.repository") // szuka z całego .reposityry
/*@PropertySources({
		@PropertySource({"file:C:\\Users\\skowr\\microservice\\student.properties"})
})*/
public class SpringbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		//Ssh sshTunnel = new Ssh();
		//try{
			//sshTunnel.connect();
			SpringApplication.run(SpringbootApplication.class, args);
		/*}
		catch (JSchException e){
			e.printStackTrace();
		}
		finally {
			sshTunnel.disconnect();
		}*/

	}

}
