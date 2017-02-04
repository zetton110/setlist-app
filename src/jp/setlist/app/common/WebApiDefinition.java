package jp.setlist.app.common;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import jp.setlist.app.api.ArtistApiResource;
import jp.setlist.app.api.TestResourceMaker;
import jp.setlist.app.api.UserApiResource;
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
		s.add(UserApiResource.class);
		s.add(ArtistApiResource.class);
		s.add(TestResourceMaker.class);
		s.add(JsonMapMessageBodyReader.class);
		s.add(JsonListMapMessageBodyReader.class);
		s.add(JsonMapMessageBodyWriter.class);
		s.add(JsonListMapMessageBodyWriter.class);
		return s;
	}
}
