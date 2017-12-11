package selenium2;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;

import mappers.is.web.bmw.sql.LoginsExtendViewMapper;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import utils.Constant;
import utils.ProxyUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.is.web.bmw.entity.ProxyResponse;
import com.is.web.bmw.entity.sql.entity.Logins;
import com.is.web.bmw.entity.sql.extend.LoginsExtend;

public class SeleniumTest{

	static Logger logger = LogManager.getLogger(SeleniumTest.class.getName());
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver",Constant.DRIVERPATH);
		
//		SeleniumMyBmw.checkProxy();
	}
	
//	@Test
//	public void testSe(){
//		SeleniumMyBmw.login("小海豹", "123456zxc");
//	}
	
	@Test
	public void testM() throws UnknownHostException{
		InetAddress addr = InetAddress.getByName("localhost");
		String domainName = addr.getHostName();//获得主机名
		String IPName = addr.getHostAddress();//获得IP地址
		System.out.println(domainName);
		System.out.println(IPName);
	}
//	@Test
//	public void testMybatis() throws IOException{
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession session = sqlSessionFactory.openSession();
//		
//		LoginsExtendViewMapper loginMapper = session.getMapper(LoginsExtendViewMapper.class);
//		System.out.println(loginMapper.getAllLoginsBySearchWithJoin(new LoginsExtend(new Logins())));
//	}
	
//	@Test
//	public void testProxy(){
//		List<ProxyResponse> responseList = ProxyUtils.getProxyList();
//		System.out.println(responseList.size());
//	}
}
