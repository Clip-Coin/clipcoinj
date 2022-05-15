package com.google.clipcoin.uri;

/**
 * <p>Exception to provide the following to {@link ClipcoinURI}:</p>
 * <ul>
 * <li>Provision of parsing error messages</li>
 * </ul>
 * <p>This base exception acts as a general failure mode not attributable to a specific cause (other than
 * that reported in the exception message). Since this is in English, it may not be worth reporting directly
 * to the user other than as part of a "general failure to parse" response.</p>
 *
 * @since 0.4.0
 */
public class ClipcoinURIParseException extends RuntimeException {
    public ClipcoinURIParseException(String s) {
        super(s);
    }

    public ClipcoinURIParseException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
