package com.hakancivelek.java.strings.regex;

/**
 * MyRegex class that provides a method to validate IPv4 addresses using regex.
 *
 * @author <a href="hakancivelek5461@gmail.com">Hakan Civelek</a>
 * @see <a href="https://www.linkedin.com/in/hakancivelek">LinkedIn Profile</a>
 */
class MyRegex {
    private String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    private String pattern = num + "\\." + num + "\\." + num + "\\." + num;

    /**
     * Validates whether the given IP address matches the IPv4 pattern.
     *
     * @param ip The IP address to be validated.
     * @return true if the IP address is valid, false otherwise.
     */
    public boolean isValidIP(String ip) {
        return ip.matches(pattern);
    }
}