package com.sample.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 
 * ClassName: Services
 * Function:
 * 不可实例化的服务注册和访问类
 * non instantiable class for service registration and access
 * Reason: TODO ADD REASON(可选)
 * date: 2016年11月24日 下午11:25:01
 *
 * @author Administrator
 * @version 
 * @since JDK 1.8
 */
public class Services {
	//私有化构造器，防止实例化 见条目4 Prevents instatntiation(Item 4)
	private Services(){};
	//将服务名称映射到服务  Maps service names to services
	private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	/**
	 * 
	 * registerDefaultProvider:提供者注册API
	 * provider registration API
	 * TODO
	 * @param p
	 * @return void 
	 * @throws
	 */
	public static void registerDefaultProvider(Provider p){
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}
	private static void registerProvider(String name, Provider p) {
		providers.put(name, p);
		
	}
	/**
	 * 
	 * newInstance:服务访问API
	 * Services access API
	 * TODO
	 * @return
	 * @return Service 
	 * @throws
	 */
	public static Service newInstance(){
		return newInstance(DEFAULT_PROVIDER_NAME);
	}
	private static Service newInstance(String name) {
		Provider p = providers.get(name);
		if(p == null){
			throw new IllegalArgumentException("No provider registered with name:" + name);
		}
		return p.newService();
	}
}
