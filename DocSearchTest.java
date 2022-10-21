import org.junit.Test;
import static org.junit.Assert.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.URI;


public class DocSearchTest 
{
    @Test
    public void testHandleRequest()
    {
        Handler test = new Handler("technical\\biomed\\");
        URI url = new URI("http://localhost:4000");
        assertEquals("Don't know how to handle that path!" , test.handleRequest(url));
    }
    
}
