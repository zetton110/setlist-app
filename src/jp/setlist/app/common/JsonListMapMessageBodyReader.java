package jp.setlist.app.common;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * JAX-RS拡張クラス
 * 
 * JSON形式の文字列を読み込み、
 * ArrayList<LinkedHashMap<String,String>>>型へ
 * マッピングする。（Jackson利用）
 * 
 * @author kohei
 *
 */
@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class JsonListMapMessageBodyReader implements MessageBodyReader<ArrayList<LinkedHashMap<String, String>>> {
	
	private static ObjectMapper mapper = new ObjectMapper();

	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return type == ArrayList.class;
	}

	@Override
	public ArrayList<LinkedHashMap<String, String>> readFrom(
			Class<ArrayList<LinkedHashMap<String, String>>> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		try {
			ArrayList<LinkedHashMap<String, String>> ArrayList = mapper.readValue(entityStream, new TypeReference<ArrayList<LinkedHashMap<String, String>>>(){});
			return ArrayList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}