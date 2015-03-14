#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerOptions;


public class MainVerticle extends AbstractVerticle {

    private static final int PORT = 8080;   
    
    @Override
    public void start() throws Exception {
        vertx.createHttpServer(new HttpServerOptions().setPort(PORT)).
            requestHandler(req -> req.response().end("Hello World")).listen();
    }    
}
