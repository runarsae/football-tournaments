package ft.html.util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

import com.google.common.io.Files;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

/**
 * A simple HTTP server that serves HTML files in the ft.html/output folder.
 */
public class Server {
	
	private static final int PORT = 9000;
	private static final String OUTPUT_FOLDER = "output/";
	
	/**
	 * Run server.
	 */
    public static void main(String[] args) throws Exception {
    	HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

    	server.createContext("/", new Handler());
    	server.setExecutor(null);
    	server.start();

    	System.out.println("Server started on port " + PORT);
    	System.out.println("Go to http://localhost:" + PORT + "/football-tournaments.html");
    	
    	// Open start page in browser
    	if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
    	    Desktop.getDesktop().browse(new URI("http://localhost:" + PORT + "/football-tournaments.html"));
    	}
    }

    static class Handler implements HttpHandler {
    	/**
    	 * Handle HTTP requests by serving files in ft.html/output folder.
    	 */
        @Override
        public void handle(HttpExchange t) throws IOException {
    		Headers h = t.getResponseHeaders();
    		h.set("Content-Type", "text/html");
    		
            URI uri = t.getRequestURI();
            String path = uri.getPath();
            
            File file = new File(OUTPUT_FOLDER + path);
            t.sendResponseHeaders(200, file.length());
            try (OutputStream os = t.getResponseBody()) {
            	Files.copy(file, os);
            }
          }
    }


}