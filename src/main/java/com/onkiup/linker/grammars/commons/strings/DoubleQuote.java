package com.onkiup.linker.grammars.commons.strings;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : DoubleQuote
 * @created : Sunday Mar 29, 2020 22:49:43 EDT
 */

public class DoubleQuote implements SingleQuotedString.Member {
  private static final String MARKER = "\"";

  @Override
  public String value() {
    return MARKER;
  }
}
