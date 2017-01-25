package jp.setlist.app.common;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class JsonMapMessageBodyReader implements MessageBodyReader<LinkedHashMap<String, String>> {
	
	private static ObjectMapper mapper = new ObjectMapper();

	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == LinkedHashMap.class;
	}

	@Override
	public LinkedHashMap<String, String> readFrom(Class<LinkedHashMap<String, String>> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		try {
			LinkedHashMap<String,String> map = mapper.readValue(entityStream, new TypeReference<LinkedHashMap<String,String>>(){});
			return map;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}