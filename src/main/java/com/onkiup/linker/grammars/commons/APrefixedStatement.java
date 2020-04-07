package com.onkiup.linker.grammars.commons;

import com.onkiup.linker.parser.Rule;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : APrefixedStatement
 * @created : Tuesday Mar 17, 2020 16:28:49 EDT
 */
public abstract class APrefixedStatement<P extends APrefixOperator, S extends Rule> implements ACommonRule {
  private P prefix;
  private S statement;

  public P prefix() {
    return prefix;
  }

  public S statement() {
    return statement;
  }
}
