package com.onkiup.linker.grammars.commons.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.onkiup.linker.parser.annotation.IgnoreCharacters;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : DoubleQuotedString
 * @created : Sunday Mar 29, 2020 22:34:06 EDT
 */
@IgnoreCharacters(inherit=false)
public class SingleQuotedString implements ACommonString {
  public interface Member extends AStringMember {
  }
  private static final String OPEN = "'";
  private Member[] members;
  private static final String CLOSE = "'";

  private transient String cache;

  public String value() {
    if (cache == null) {
      cache = Arrays.stream(members)
        .map(AStringMember::value)
        .collect(Collectors.joining(""));
    }
    return cache;
  }
}
