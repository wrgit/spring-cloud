package cn.ezfintel.coll.gateway.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayBootstrap {
}
