package com.onkiup.linker.grammars.commons.strings;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : Quote
 * @created : Sunday Mar 29, 2020 22:47:21 EDT
 */

public class Quote implements DoubleQuotedString.Member {
  private static final String MARKER = "'";

  @Override
  public String value() {
    return MARKER;
  }

}
