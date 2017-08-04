package com.taxzar.utils;

import java.security.NoSuchAlgorithmException;

public class Utils {

    public static String MD5(String target) throws NoSuchAlgorithmException {

        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        byte[] array = md.digest(target.getBytes());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < array.length; ++i) {
            sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
        }

        return sb.toString();
    }
}
