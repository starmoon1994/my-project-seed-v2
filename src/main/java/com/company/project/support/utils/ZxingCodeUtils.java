package com.company.project.support.utils;//package com.company.project.support.utils;
//
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.EncodeHintType;
//import com.google.zxing.MultiFormatWriter;
//import com.google.zxing.WriterException;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//import com.google.zxing.common.BitMatrix;
//import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
//
//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ZxingCodeUtils {
//	public static void main(String[] args) throws Exception {
//		encode(400, 400, "http://h5.xiaodugongche.com/popularize/ditui.htm?channel=ditui-001");
//	}
//
//	/**
//	 * 生成二维码
//	 *
//	 * @throws WriterException
//	 * @throws IOException
//	 */
//	public static BufferedImage encode(int width, int height, String content) throws WriterException, IOException {
//		String filePath = "";
//		String fileName = "zxing.png";
//		String format = "png";// 图像类型
//		Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
//		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
//		hints.put(EncodeHintType.MARGIN, 0);
//		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
//		BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);// 生成矩阵
//		Path path = FileSystems.getDefault().getPath(filePath, fileName);
//		MatrixToImageWriter.writeToPath(bitMatrix, format, path);// 输出图像
//		File file = new File(filePath + fileName);
//		BufferedImage bufImg = null;
//		try {
//			bufImg = ImageIO.read(file);
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
//		}
//		return bufImg;
//	}
//
//}
