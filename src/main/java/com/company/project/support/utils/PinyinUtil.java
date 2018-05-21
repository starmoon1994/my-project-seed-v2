package com.company.project.support.utils;//package com.company.project.support.utils;
//
//import net.sourceforge.pinyin4j.PinyinHelper;
//import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
//import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
//import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
//import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
//
//public class PinyinUtil {
//	/**
//	 * 获取中文对应的全拼
//	 *
//	 * @author 向蓬
//	 * @date 2016-8-11下午6:06:42
//	 * @param chines
//	 * @return String
//	 */
//	public static String converterToFirstSpell(String chines) {
//		String pinyinName = "";
//		char[] nameChar = chines.toCharArray();
//		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
//		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
//		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
//		for (int i = 0; i < nameChar.length; i++) {
//			String s = String.valueOf(nameChar[i]);
//			if (s.matches("[\\u4e00-\\u9fa5]")) {
//				try {
//					String[] mPinyinArray = PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat);
//					pinyinName += mPinyinArray[0];
//				} catch (BadHanyuPinyinOutputFormatCombination e) {
//					e.printStackTrace();
//				}
//			} else {
//				pinyinName += nameChar[i];
//			}
//		}
//		return pinyinName;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(converterToFirstSpell("阿斯顿-马丁"));
//	}
//}
///*
//依赖包
//   <dependency>
//            <groupId>com.belerweb</groupId>
//            <artifactId>pinyin4j</artifactId>
//            <version>2.5.0</version>
//        </dependency>
// */