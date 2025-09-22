package com.datastucture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeString {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        int n = strs.size() - 1;
        int i = 0;
        while (i <= n) {
            if (i != 0) {
                builder.append("#20");
            }
            builder.append(strs.get(i));
            i++;
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        String[] array = str.split("#20");
        List<String> rs = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            String value = array[i];
            if (value == null || value.isEmpty()) {
                continue;
            }
            rs.add(value);
        }
        return rs;
    }

}
