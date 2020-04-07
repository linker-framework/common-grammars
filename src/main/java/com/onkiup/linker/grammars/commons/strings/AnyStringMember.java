package com.onkiup.linker.grammars.commons.strings;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : AnyStringMember
 * @created : Sunday Mar 29, 2020 22:52:05 EDT
 */

public interface AnyStringMember extends SingleQuotedString.Member, DoubleQuotedString.Member {
  @Override
  String value();
}
