package com.onkiup.linker.grammars.commons.strings;

import com.onkiup.linker.parser.annotation.CapturePattern;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : CharacterGroup
 * @created : Sunday Mar 29, 2020 22:16:04 EDT
 */

public class CharacterGroup implements SingleQuotedString.Member, DoubleQuotedString.Member {
  @CapturePattern("[^\\\"']")
  private String value;

  public String value() {
    return value;
  }
}
