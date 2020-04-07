package com.onkiup.linker.grammars.commons.strings;

/**
 * @author      : chedim (chedim@chedim-Surface-Pro-3)
 * @file        : EscapedQuote
 * @created     : Sunday Mar 29, 2020 22:58:01 EDT
 */

public class EscapedDoubleQuote implements SingleQuotedString.Member
{
  private static final String MARKER = "\\\"";

  @Override
  public String value() {
    return MARKER;
  }
}


