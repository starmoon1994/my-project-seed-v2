package com.company.project.support.utils;//package com.company.project.support.utils;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * @ClassName: WordFilter
// * @Author: Allen allen.ime@gmail.com
// * @Date: 2015年6月26日 上午11:24:22
// * @Description: 检测/过滤敏感字
// */
//public class WordFilter {
//	private static final Logger log = LoggerFactory.getLogger(WordFilter.class);
//	private volatile List<String> arrt = new ArrayList<String>();// 文字
//	private volatile Node rootNode = new Node('R');
//
//	private static WordFilter wordFilter;
//	private static final Object MONITOR = new Object();
//
//	public static WordFilter getInstance() {
//		if (wordFilter == null) {
//			synchronized (MONITOR) {
//				if (wordFilter == null) {
//					wordFilter = new WordFilter().initWords();
//				}
//			}
//		}
//		return wordFilter;
//	}
//
//	// private static final WordFilter instance=new WordFilter();
//	// public static WordFilter getInstance(){
//	// return instance;
//	// }
//	public WordFilter() {
//		// initWords();
//		// log.info("初始化过滤关键字：" + arrt.size());
//	}
//
//	/**
//	 * 过滤敏感词
//	 *
//	 * @param content
//	 * @return
//	 */
//	public String badWordstFilterStr(String content) {
//		char[] chars = content.toCharArray();
//		Node node = rootNode;
//		StringBuffer buffer = new StringBuffer();
//		List<String> badList = new ArrayList<String>();
//		int a = 0;
//		while (a < chars.length) {
//			node = findNode(node, chars[a]);
//			if (node == null) {
//				node = rootNode;
//				a = a - badList.size();
//				if (badList.size() > 0) {
//					badList.clear();
//				}
//				buffer.append(chars[a]);
//			} else if (node.flag == 1) {
//				badList.add(String.valueOf(chars[a]));
//				for (int i = 0; i < badList.size(); i++) {
//					buffer.append("*");
//				}
//				node = rootNode;
//				badList.clear();
//			} else {
//				badList.add(String.valueOf(chars[a]));
//				if (a == chars.length - 1) {
//					for (int i = 0; i < badList.size(); i++) {
//						buffer.append(badList.get(i));
//					}
//				}
//			}
//			a++;
//		}
//		return buffer.toString();
//	}
//
//	public static void main(String[] a) {
//		WordFilter swf = WordFilter.getInstance();// BadWordsFilter.getInstance();
//		swf.initWords();
//		String qq = "伱昰豬嗎";
//		// for (int i = 0; i < 100; i++) {
////		qq += swf.badWordstFilterStr("习近平想做爱操逼了没了，激情女优,稀少罕见的美少女蝴蝶屄,mm的诱人双峰→免费试看片呵呵，操B,做去吧,你真的想做爱吗做爱真的很好吗");
//		// }
//
//		boolean flag = swf.hashNoLimitedWords(qq);
//		System.out.println(flag);
//		// if (log.isDebugEnabled()) {
//		// log.debug("main(String[]) - " + qq); //$NON-NLS-1$
//		// }
//		// qq = "你好!";
//		// log.error(swf.hashNoLimitedWords(qq));
//	}
//
//	public WordFilter initWords() {
//		try {
//			String path = System.getProperty("keyWords", "/keyWords.txt");
//			if (log.isDebugEnabled()) {
//				log.debug("initWords() - initWords========================"); //$NON-NLS-1$
//			}
//			rootNode = new Node('R');
//			arrt.clear();
////			String fileName = this.getClass().getResource(path).getFile();
////			File file = new File(fileName);
////			log.info("initWords() - initWords fileName2:{}=>{} ========================",file.exists(),fileName); //$NON-NLS-1$
//
////			String fileName = ClassLoader.getSystemResource(path).getFile();
////			log.info("initWords() - initWords fileName:{} ========================",fileName); //$NON-NLS-1$
//
////			String keys = Files.toString(file, Charset.forName("utf-8"));
//
//			InputStream is = this.getClass().getResourceAsStream(path);
//
//			BufferedReader reader = null;
//			StringBuffer buffer = new StringBuffer();
//			try {
//				;
//				reader = new BufferedReader(new InputStreamReader(is));
//				String tempString = null;
//				// 一次读入一行，直到读入null为文件结束
//				while ((tempString = reader.readLine()) != null) {
//					buffer.append(tempString);
//				}
//				reader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				if (reader != null) {
//					try {
//						reader.close();
//					} catch (IOException e1) {
//					}
//				}
//			}
//			String keys = buffer.toString();
////			 if (keys == null) {
////			 return;
////			 }
//
//			String tempstr[] = keys.split(",");
//			for (int i = 0; i < tempstr.length; i++) {
//				String ss = tempstr[i];
//
//				arrt.add(ss.replace("\"", "").trim());
//
//			}
//			createTree();
//		} catch (Exception e) {
//			log.error("敏感词初始化失败", e); //$NON-NLS-1$
//		}
//		log.debug("初始化过滤关键字：" + arrt.size());
//		return this;
//	}
//
//	private void createTree() {
//		if (log.isDebugEnabled()) {
//			log.debug("createTree() - createTree========================"); //$NON-NLS-1$
//		}
//		for (String str : arrt) {
//			char[] chars = str.toCharArray();
//			if (chars.length > 0)
//				insertNode(rootNode, chars, 0);
//		}
//	}
//
//	private void insertNode(Node node, char[] cs, int index) {
//		Node n = findNode(node, cs[index]);
//		if (n == null) {
//			n = new Node(cs[index]);
//			node.nodes.put(String.valueOf(cs[index]), n);
//		}
//
//		if (index == (cs.length - 1))
//			n.flag = 1;
//
//		index++;
//		if (index < cs.length)
//			insertNode(n, cs, index);
//	}
//
//	/**
//	 * 名字是否有不允许字符
//	 *
//	 * @param content
//	 * @return true有坏字 false 没有
//	 */
//	public boolean hashNoLimitedWords(String content) {
//		char[] chars = content.toCharArray();
//		for (char c : chars) {
//			// c是汉字
//			if ((c >= 0x4e00) && (c <= 0x9fbb)) {
//				continue;
//			}
//			// c是数字或英文
//			if (Character.isLetterOrDigit(c)) {
//				continue;
//			}
//			return true;
//		}
//		return false;
//	}
//
//	/**
//	 * 是否有坏字
//	 *
//	 * @param content
//	 * @return true有坏字 false 没有
//	 */
//	public boolean hashBadWords(String content) {
//		char[] chars = content.toCharArray();
//		Node node = rootNode;
//		StringBuffer buffer = new StringBuffer();
//		List<String> word = new ArrayList<String>();
//		int a = 0;
//		while (a < chars.length) {
//			node = findNode(node, chars[a]);
//			if (node == null) {
//				node = rootNode;
//				a = a - word.size();
//				buffer.append(chars[a]);
//				word.clear();
//			} else if (node.flag == 1) {
//				node = null;
//				return true;
//			} else {
//				word.add(String.valueOf(chars[a]));
//			}
//			a++;
//		}
//		chars = null;
//		word.clear();
//		word = null;
//		return false;
//	}
//
//	private Node findNode(Node node, char c) {
//		return node.nodes.get(String.valueOf(c));
//	}
//
//	private static class Node {
//		@SuppressWarnings("unused")
//		public char c;
//		public int flag;
//		public HashMap<String, Node> nodes = new HashMap<String, Node>();
//
//		public Node(char c) {
//			this.c = c;
//			this.flag = 0;
//		}
//
//		@SuppressWarnings("unused")
//		public Node(char c, int flag) {
//			this.c = c;
//			this.flag = flag;
//		}
//	}
//
//}
