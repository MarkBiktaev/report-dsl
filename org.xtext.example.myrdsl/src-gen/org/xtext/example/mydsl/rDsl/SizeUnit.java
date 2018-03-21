/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getSizeUnit()
 * @model
 * @generated
 */
public enum SizeUnit implements Enumerator
{
  /**
   * The '<em><b>M</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #M_VALUE
   * @generated
   * @ordered
   */
  M(0, "M", "medium"),

  /**
   * The '<em><b>L</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #L_VALUE
   * @generated
   * @ordered
   */
  L(1, "L", "large"),

  /**
   * The '<em><b>Lr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LR_VALUE
   * @generated
   * @ordered
   */
  LR(2, "Lr", "larger"),

  /**
   * The '<em><b>XL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XL_VALUE
   * @generated
   * @ordered
   */
  XL(3, "XL", "x-large"),

  /**
   * The '<em><b>XXL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XXL_VALUE
   * @generated
   * @ordered
   */
  XXL(4, "XXL", "xx-large"),

  /**
   * The '<em><b>S</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #S_VALUE
   * @generated
   * @ordered
   */
  S(5, "S", "small"),

  /**
   * The '<em><b>Sr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SR_VALUE
   * @generated
   * @ordered
   */
  SR(6, "Sr", "smaller"),

  /**
   * The '<em><b>XS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XS_VALUE
   * @generated
   * @ordered
   */
  XS(7, "XS", "x-small"),

  /**
   * The '<em><b>XXS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XXS_VALUE
   * @generated
   * @ordered
   */
  XXS(8, "XXS", "xx-small");

  /**
   * The '<em><b>M</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #M
   * @model literal="medium"
   * @generated
   * @ordered
   */
  public static final int M_VALUE = 0;

  /**
   * The '<em><b>L</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>L</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #L
   * @model literal="large"
   * @generated
   * @ordered
   */
  public static final int L_VALUE = 1;

  /**
   * The '<em><b>Lr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LR
   * @model name="Lr" literal="larger"
   * @generated
   * @ordered
   */
  public static final int LR_VALUE = 2;

  /**
   * The '<em><b>XL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XL
   * @model literal="x-large"
   * @generated
   * @ordered
   */
  public static final int XL_VALUE = 3;

  /**
   * The '<em><b>XXL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XXL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XXL
   * @model literal="xx-large"
   * @generated
   * @ordered
   */
  public static final int XXL_VALUE = 4;

  /**
   * The '<em><b>S</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #S
   * @model literal="small"
   * @generated
   * @ordered
   */
  public static final int S_VALUE = 5;

  /**
   * The '<em><b>Sr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SR
   * @model name="Sr" literal="smaller"
   * @generated
   * @ordered
   */
  public static final int SR_VALUE = 6;

  /**
   * The '<em><b>XS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XS
   * @model literal="x-small"
   * @generated
   * @ordered
   */
  public static final int XS_VALUE = 7;

  /**
   * The '<em><b>XXS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XXS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XXS
   * @model literal="xx-small"
   * @generated
   * @ordered
   */
  public static final int XXS_VALUE = 8;

  /**
   * An array of all the '<em><b>Size Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SizeUnit[] VALUES_ARRAY =
    new SizeUnit[]
    {
      M,
      L,
      LR,
      XL,
      XXL,
      S,
      SR,
      XS,
      XXS,
    };

  /**
   * A public read-only list of all the '<em><b>Size Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SizeUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Size Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SizeUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SizeUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Size Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SizeUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SizeUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Size Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SizeUnit get(int value)
  {
    switch (value)
    {
      case M_VALUE: return M;
      case L_VALUE: return L;
      case LR_VALUE: return LR;
      case XL_VALUE: return XL;
      case XXL_VALUE: return XXL;
      case S_VALUE: return S;
      case SR_VALUE: return SR;
      case XS_VALUE: return XS;
      case XXS_VALUE: return XXS;
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
  private SizeUnit(int value, String name, String literal)
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
  
} //SizeUnit
