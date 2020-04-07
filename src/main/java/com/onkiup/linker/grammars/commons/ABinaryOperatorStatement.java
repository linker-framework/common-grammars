package com.onkiup.linker.grammars.commons;

import com.onkiup.linker.parser.Rule;

/**
 * @author : chedim (chedim@chedim-Surface-Pro-3)
 * @file : BinaryOperator
 * @created : Tuesday Mar 17, 2020 16:13:57 EDT
 */

public abstract class ABinaryOperatorStatement<L extends Rule, O extends ABinaryOperator, R extends Rule> implements ACommonRule {
  private L left;
  private O operator;
  private R right;

  public L left() {
    return left;
  }

  public O operator() {
    return operator;
  }

  public R right() {
    return right;
  }
}
