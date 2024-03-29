/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Page Break Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreakValue()
 * @model
 * @generated
 */
public enum PageBreakValue implements Enumerator
{
  /**
   * The '<em><b>Auto</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AUTO_VALUE
   * @generated
   * @ordered
   */
  AUTO(0, "auto", "auto"),

  /**
   * The '<em><b>Always</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALWAYS_VALUE
   * @generated
   * @ordered
   */
  ALWAYS(1, "always", "always"),

  /**
   * The '<em><b>Avoid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVOID_VALUE
   * @generated
   * @ordered
   */
  AVOID(2, "avoid", "avoid");

  /**
   * The '<em><b>Auto</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AUTO
   * @model name="auto"
   * @generated
   * @ordered
   */
  public static final int AUTO_VALUE = 0;

  /**
   * The '<em><b>Always</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALWAYS
   * @model name="always"
   * @generated
   * @ordered
   */
  public static final int ALWAYS_VALUE = 1;

  /**
   * The '<em><b>Avoid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Avoid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVOID
   * @model name="avoid"
   * @generated
   * @ordered
   */
  public static final int AVOID_VALUE = 2;

  /**
   * An array of all the '<em><b>Page Break Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PageBreakValue[] VALUES_ARRAY =
    new PageBreakValue[]
    {
      AUTO,
      ALWAYS,
      AVOID,
    };

  /**
   * A public read-only list of all the '<em><b>Page Break Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PageBreakValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Page Break Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PageBreakValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Page Break Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PageBreakValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Page Break Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PageBreakValue get(int value)
  {
    switch (value)
    {
      case AUTO_VALUE: return AUTO;
      case ALWAYS_VALUE: return ALWAYS;
      case AVOID_VALUE: return AVOID;
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
  private PageBreakValue(int value, String name, String literal)
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
  
} //PageBreakValue
