package net.smartcosmos.cluster.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

import net.smartcosmos.annotation.EnableSmartCosmosMonitoring;

@EnableSmartCosmosMonitoring
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServerApplication implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(ConfigServerApplication.class);

    @Value("${spring.cloud.config.server.git.uri}")
    private String configFileUri;

    public static void main(String[] args) {

        new SpringApplicationBuilder(ConfigServerApplication.class).web(true)
            .run(args);
    }

    @Override
    public void run(String... strings) throws Exception {

        log.debug("CONFIG_FILE_URI was set to: {}", configFileUri);
    }
}
