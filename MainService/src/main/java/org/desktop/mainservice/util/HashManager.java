package org.desktop.mainservice.util;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class HashManager {
    public static String getHashFrom(String str, String salt) {
        return BCrypt.hashpw(str + salt, BCrypt.gensalt());
    }
}
