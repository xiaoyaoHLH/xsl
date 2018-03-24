package xsl.sso.dao;

public interface JedisClient {
	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String heky, String key, String value);
	//自增长
	long incr(String key);
	//设置生命
	long expire(String key, int second);
	//获取生命
	long ttl(String key);
    long del(String key);
	long hdel(String hkey, String key);
}
