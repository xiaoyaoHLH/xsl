package test;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisTest {
	
	@Test
	public void testRedisSingle(){
		Jedis jedis = new Jedis("40.125.212.233", 6379);
		jedis.set("key1", "jedis test");
		String string = jedis.get("key1");
		System.out.println(string);
		//关闭jedis。
		jedis.close();
	}
	
	@Test
	public void testRedisPool(){
		JedisPool jedisPool = new JedisPool("40.125.212.233", 6379);
		Jedis jedis = jedisPool.getResource();
		
		jedis.set("key2", "pool");
		String string = jedis.get("key2");
		System.out.println(string);
		
		jedis.close();
	}

}
