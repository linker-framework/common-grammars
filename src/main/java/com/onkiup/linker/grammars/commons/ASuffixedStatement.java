package com.onkiup.linker.grammars.commons;

import com.onkiup.linker.parser.Rule;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : ASuffixedStatement
 * @created : Tuesday Mar 17, 2020 16:41:58 EDT
 */

public abstract class ASuffixedStatement<S extends Rule, P extends ASuffixOperator> implements ACommonRule {

  private S statement;
  private P suffix;

  public S statement() {
    return statement;
  }

  public P suffix() {
    return suffix;
  }
}
