package jp.setlist.app.common;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;



@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JsonMapMessageBodyWriter implements MessageBodyWriter<LinkedHashMap<String, String>> {
	
	private static ObjectMapper mapper = new ObjectMapper();

	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == LinkedHashMap.class;
	}

	@Override
	public long getSize(LinkedHashMap<String, String> t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(LinkedHashMap<String, String> t, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		String json = createJson(t);
        try(PrintWriter out = new PrintWriter(entityStream)){
        	out.print(json);
        } catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String createJson(LinkedHashMap<String, String> map) {
		try {
			String json = mapper.writeValueAsString(map);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}