package xsl.common.pojo;

import java.util.List;

/**
 * @ClassName:EUdataGridResult
 * @Description:easyUI的数据————{total:”2”,rows:[{“id”:”1”,”name”,”张三”},{“id”:”2”,”name”,”李四”}]}
 * @version V1.0
 * @Copyright: www.taotao.com
 * @author:何林鸿
 * @date: 2017年11月20日 上午1:41:30
 */
public class EUdataGridResult {
	private long total;
	private List<?> rows;
	
	public EUdataGridResult(){}
	
	public EUdataGridResult(Integer total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}
	
	public EUdataGridResult(long total, List<?> rows) {
		this.total = (int) total;
		this.rows = rows;
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
