package dmk.springboot.web.conf;

import java.io.FileNotFoundException;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
public class EmbeddedTLSTomcat {

	@Bean
	public EmbeddedServletContainerFactory servletContainer()
			throws FileNotFoundException {
		TomcatEmbeddedServletContainerFactory f = new TomcatEmbeddedServletContainerFactory();
		f.addAdditionalTomcatConnectors(createSslConnector());
		return f;
	}

	private Connector createSslConnector() throws FileNotFoundException {
		Connector connector = new Connector(Http11NioProtocol.class.getName());
		Http11NioProtocol protocol = (Http11NioProtocol) connector
				.getProtocolHandler();
		connector.setPort(8443);
		connector.setSecure(true);
		connector.setScheme("https");
		protocol.setSSLEnabled(true);
		protocol.setKeyAlias("dmk-keyalias");
		protocol.setKeystorePass("password");
		protocol.setKeystoreFile(ResourceUtils.getFile(
				"src/main/resources/dmk-tls-tomcat.keystore").getAbsolutePath());
		protocol.setSslProtocol("TLS");
		return connector;
	}
	
}