package com.conpany.project;

import com.google.common.base.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 测试文件行数对文件大小的影响
 */
public class FileGenTest {


    public static void main(String[] args) throws IOException {


        System.out.println("行字符长度=" + lineItem.length() + "  lineItem: " + lineItem);

        String userDir = System.getProperty("user.dir");
        String filePath = userDir + "\\";
        String fileName = "testFile_" + System.currentTimeMillis() + ".txt";

        File file = new File(filePath + fileName);
        if (!file.exists()) {
            file.createNewFile();
        }

        ArrayList<String> strings = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 1000; i++) {
                strings.add(lineItem);
            }
            FileUtils.writeLines(file, Charsets.UTF_8.name(), strings, "\n", true);
        }

        System.out.printf("file文件写入已完成 %s  \n", file.getAbsolutePath());
        System.out.printf("file.length=%s%n", file.length());

        // 结论：汉字最耗费
        /**
         * | 文件行数 | 每行长度 | 行内容       | 文件大小                  |
         * | -------- | -------- | ------------ | ------------------------- |
         * | 10000    | 1000     | 纯数字       | 52.5 MB (55,055,000 字节) |
         * | 10000    | 1000     | 纯字母       | 52.5 MB (55,055,000 字节) |
         * | 10000    | 1000     | 字母数字混合 | 52.5 MB (55,055,000 字节) |
         * | 10000    | 1000     | 字母数字汉字 | 55.6 MB (58,355,000 字节) |
         *
         */

    }


    // 1000字符  不同字符，对文件大小影响很大
    // ASCII码编码 占用1个字节，可表示数字和英文大小写字母
    // 非ASCII编码 如Unicode、UTF-8等
    // UTF-8编码 UTF-8最大的一个特点，就是它是一种变长的编码方式。它可以使用1~4个字节表示一个符号，根据不同的符号而变化字节长度。
    final static String lineItem2 = "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~"
            + "0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~0123456789qwertyuiopasdfghjklzxcvbnm!@#$$%^&*()_+~";

    final static String lineItem3 = "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer"
            + "0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer0123456789qwertyuiopasdfghjklzxcvbnm9876543210qwer";

    final static String lineItem4 = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

    final static String lineItem = "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
            + "大家好3456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";


}
