package com.onkiup.linker.grammars.commons.strings;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : Slash
 * @created : Sunday Mar 29, 2020 22:51:40 EDT
 */

public class Backslash implements AnyStringMember {
  private static final String MARKER = "\\";

  @Override
  public String value() {
    return MARKER;
  }
}
