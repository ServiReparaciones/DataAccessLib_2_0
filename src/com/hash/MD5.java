package com.hash;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5 {

    public static String passwordToMD5(String password) {
        return DigestUtils.md5Hex(
                new StringBuffer(DigestUtils.md5Hex("linux"))
                .append(password)
                .append(String.valueOf(password.length()))
                .toString());
    }

}
