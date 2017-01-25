package jp.setlist.app.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import jp.setlist.app.api.WebApiResource;
/**
 * アプリ内共通定義（WebAPIのアプリケーションパス）
 * @author kohei
 *
 */
@ApplicationPath("app")
public class WebApiDefinition extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(WebApiResource.class);
		s.add(JsonMapMessageBodyReader.class);
		s.add(JsonListMapMessageBodyReader.class);
		s.add(JsonMapMessageBodyWriter.class);
		s.add(JsonListMapMessageBodyWriter.class);
		return s;
	}
}
