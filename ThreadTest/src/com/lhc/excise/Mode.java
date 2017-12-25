package com.lhc.excise;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by DELL on 2017/3/4.
 */

// === Lambda======
public class Mode {

    public static Map<String, Integer> mainMethod(Function<String, Integer> parse, String filePath, String pattern) throws IOException {

        Map<String, Integer> resultMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                Integer count = parse.apply(pattern);
                Integer c = resultMap.get(pattern);
                if (c != null) {
                    resultMap.put(pattern, 1);
                } else {
                    resultMap.put(pattern, c + 1);
                }
            }
        }
        return resultMap;
    }

}

//File file = new File("C:\\Users\\DELL\\Desktop\\1.txt");

//======================= 1 抽象類 + 繼承 + 重寫
abstract class AbsMode {

    public Map<String, Integer> mainMethod(String file) throws IOException {
        // 模板步驟

        Map<String, Integer> resultMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                Integer count = parse(line);
            }
        }
        String str = null;
        StringBuffer buf = new StringBuffer();

        // 待子類重寫的
        return null;
    }

    abstract Integer parse(String pattern);

}





