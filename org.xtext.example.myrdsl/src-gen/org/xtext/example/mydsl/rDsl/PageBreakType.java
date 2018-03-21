/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Page Break Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreakType()
 * @model
 * @generated
 */
public enum PageBreakType implements Enumerator
{
  /**
   * The '<em><b>Page Break After</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_AFTER_VALUE
   * @generated
   * @ordered
   */
  PAGE_BREAK_AFTER(0, "pageBreakAfter", "after"),

  /**
   * The '<em><b>Page Break Before</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_BEFORE_VALUE
   * @generated
   * @ordered
   */
  PAGE_BREAK_BEFORE(1, "pageBreakBefore", "before"),

  /**
   * The '<em><b>Page Break Inside</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_INSIDE_VALUE
   * @generated
   * @ordered
   */
  PAGE_BREAK_INSIDE(2, "pageBreakInside", "inside");

  /**
   * The '<em><b>Page Break After</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Page Break After</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_AFTER
   * @model name="pageBreakAfter" literal="after"
   * @generated
   * @ordered
   */
  public static final int PAGE_BREAK_AFTER_VALUE = 0;

  /**
   * The '<em><b>Page Break Before</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Page Break Before</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_BEFORE
   * @model name="pageBreakBefore" literal="before"
   * @generated
   * @ordered
   */
  public static final int PAGE_BREAK_BEFORE_VALUE = 1;

  /**
   * The '<em><b>Page Break Inside</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Page Break Inside</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAGE_BREAK_INSIDE
   * @model name="pageBreakInside" literal="inside"
   * @generated
   * @ordered
   */
  public static final int PAGE_BREAK_INSIDE_VALUE = 2;

  /**
   * An array of all the '<em><b>Page Break Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PageBreakType[] VALUES_ARRAY =
    new PageBreakType[]
    {
      PAGE_BREAK_AFTER,
      PAGE_BREAK_BEFORE,
      PAGE_BREAK_INSIDE,
    };

  /**
   * A public read-only list of all the '<em><b>Page Break Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PageBreakType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Page Break Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PageBreakType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Page Break Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PageBreakType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Page Break Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakType get(int value)
  {
    switch (value)
    {
      case PAGE_BREAK_AFTER_VALUE: return PAGE_BREAK_AFTER;
      case PAGE_BREAK_BEFORE_VALUE: return PAGE_BREAK_BEFORE;
      case PAGE_BREAK_INSIDE_VALUE: return PAGE_BREAK_INSIDE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private PageBreakType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PageBreakType
