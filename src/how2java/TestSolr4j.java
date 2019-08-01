package how2java;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;

public class TestSolr4j {

	public static void main(String[] args) throws SolrServerException, IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<Product> products = ProductUtil.file2list("140k_products.txt");
		System.out.println("开始："+dateFormat.format(new Date()));
		SolrUtil.batchSaveOrUpdate(products);
		System.out.println("结束："+dateFormat.format(new Date()));
	}

}
